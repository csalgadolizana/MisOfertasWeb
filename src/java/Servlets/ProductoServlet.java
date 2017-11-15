/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import servicios.Producto;
import servicios.ProductoService_Service;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author PC-Cristopher
 */
public class ProductoServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_21823/MisOfertasWebService/ProductoService.wsdl")
    private ProductoService_Service service;
    JSONObject jObj;
    JSONArray listaJson;

    private String rutaFiles;
    private String rutaForDB;

    private final String rutaForDBDefaul = "img\\productos\\";
    private final String rutaDefaulRaiz = "C:\\Users\\PC-Cristopher\\Documents\\NetBeansProjects\\MisOfertasWeb\\web\\";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        try {
            String bnt = "";
            List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
            for (FileItem item : items) {
                if (item.isFormField() && item.getFieldName().equals("btnAction")) {
                    bnt = item.getString();
                    System.out.println(item.getFieldName() + " " + item.getString());
                    break;
                }
            }
            System.err.println("ProductosServlet ->" + bnt);
            switch (bnt) {
                case "btnCrear":
                    crearProducto(request, response, items);
                    break;
                case "btnModificar":
                    System.err.println("Entro aca");
                    actualizarProducto(request, response, items);
                case "listaProductos":
                    returnListProductos(request, response);
                    break;
            }
        } catch (Exception e) {
            String accion = request.getParameter("accion");
            System.err.println("ProductosServlet -> " + accion);
            switch (accion) {
                case "listaProductos":
                    returnListProductos(request, response);
                    break;
                default:
                    System.err.println("Fue al Defaul en ProductosServlet");
//                existeCorreo(request, response);
                    break;
            }
        }

    }

    private void actualizarProducto(HttpServletRequest request, HttpServletResponse response, List<FileItem> items) throws IOException {
        try {
            int idProducto = 0, precioProd = 0, idCat = 0;
            boolean conImagen = false;
            String nombreProducto = null, desProd = null, cambiarFoto = null;
            String d = request.getParameter("d");
            rutaFiles = rutaDefaulRaiz + rutaForDBDefaul;
            rutaForDB = rutaForDBDefaul;
            File file = new File(rutaFiles);
            if (!file.exists()) {
                System.err.println("El directorio -> " + rutaFiles + " aun no está creado...");
                if (file.mkdir()) {
                    System.err.println("El directorio -> " + rutaFiles + " ahora fue creado!");
                } else {
                    System.err.println("Fallo al intentar crear el directorio -> " + rutaFiles);
                }
            }
            for (FileItem item : items) {
                if (item.isFormField()) {
                    System.err.println(item.getFieldName());
                    switch (item.getFieldName()) {
                        case "idProducto2":
                            idProducto = Integer.parseInt(item.getString().trim());
                            break;
                        case "nombreProducto2":
                            nombreProducto = item.getString().trim();
                            break;
                        case "descripcionProducto2":
                            desProd = item.getString().trim();
                            break;
                        case "txtPrecio2":
                            precioProd = Integer.parseInt(item.getString().trim());
                            break;
                        case "selectCategoria2":
                            idCat = Integer.parseInt(item.getString().trim());
                            break;
                        case "checkCambiarFoto":
                            cambiarFoto = item.getString().trim();
                            break;
                    }
                } else {
                    if (cambiarFoto != null) {
                        conImagen = true;
                        String fieldname = item.getFieldName();
                        String conte = item.getContentType();
                        String filename = FilenameUtils.getName(item.getName());
//                    System.err.println("************fieldname : " + fieldname + " fieldvalue : " + filename + " conte : " + conte);
                        InputStream filecontent = item.getInputStream();
                        File f = new File(rutaFiles, item.getName());
                        rutaForDB = rutaForDB + item.getName();
                        System.err.println(item.getName());
                        item.write(f);
                        Thread.sleep(2000);
                    }
                }
            }
            List<Producto> lista = listadoProductos();
            int idPro = idProducto;
            Producto p = lista.stream().filter((x) -> x.getIdProducto().intValue() == idPro).findFirst().orElse(null);
            GregorianCalendar fechaHoy = new GregorianCalendar();
            fechaHoy.setTime(new Date());
            XMLGregorianCalendar fechaHoyXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(fechaHoy);
            rutaForDB = rutaForDB.replace("\\", "/");
            if (!conImagen) {
                rutaForDB = "-";
            }
            modificarProducto(idProducto, nombreProducto, desProd, precioProd, p.getInicio(), fechaHoyXml, rutaForDB, idCat);
            response.sendRedirect("accesoEncargado.html?ope=mod&sta=true&tipo=prod");
        } catch (Exception e) {
            response.sendRedirect("accesoEncargado.html?ope=mod&sta=false&tipo=prod");
            System.err.println("Error en ProductoServlet -> actualizarProducto() " + e.getMessage());
        }
    }

    private void crearProducto(HttpServletRequest request, HttpServletResponse response, List<FileItem> items) throws IOException {
        try {
            System.err.println("Entro al crearProducto()");
            int idProducto = 0, precioProd = 0, idCat = 0;
//            boolean conImagen = false;
            String nombreProducto = null, desProd = null, cambiarFoto = null;
            String d = request.getParameter("d");
            rutaFiles = rutaDefaulRaiz + rutaForDBDefaul;
            rutaForDB = rutaForDBDefaul;
            File file = new File(rutaFiles);
            if (!file.exists()) {
                System.err.println("El directorio -> " + rutaFiles + " aun no está creado...");
                if (file.mkdir()) {
                    System.err.println("El directorio -> " + rutaFiles + " ahora fue creado!");
                } else {
                    System.err.println("Fallo al intentar crear el directorio -> " + rutaFiles);
                }
            }
            for (FileItem item : items) {
                if (item.isFormField()) {
                    System.err.println(item.getFieldName());
                    switch (item.getFieldName()) {
                        case "idProducto":
                            idProducto = Integer.parseInt(item.getString().trim());
                            break;
                        case "nombreProducto":
                            nombreProducto = item.getString().trim();
                            break;
                        case "descripcionProducto":
                            desProd = item.getString().trim();
                            break;
                        case "txtPrecio":
                            precioProd = Integer.parseInt(item.getString().trim());
                            break;
                        case "selectCategoria":
                            idCat = Integer.parseInt(item.getString().trim());
                            break;
                        case "checkCambiarFoto":
                            cambiarFoto = item.getString().trim();
                            break;
                    }
                } else {
                    String fieldname = item.getFieldName();
                    String conte = item.getContentType();
                    String filename = FilenameUtils.getName(item.getName());
//                    System.err.println("************fieldname : " + fieldname + " fieldvalue : " + filename + " conte : " + conte);
                    InputStream filecontent = item.getInputStream();
                    File f = new File(rutaFiles, item.getName());
                    rutaForDB = rutaForDB + item.getName();
                    System.err.println(item.getName());
                    item.write(f);
                    Thread.sleep(2000);
                }
            }
            GregorianCalendar fechaHoy = new GregorianCalendar();
            fechaHoy.setTime(new Date());
            XMLGregorianCalendar fechaHoyXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(fechaHoy);
            rutaForDB = rutaForDB.replace("\\", "/");
            insertarProducto(33, nombreProducto, desProd, precioProd, fechaHoyXml, fechaHoyXml, rutaForDB, idCat);
            response.sendRedirect("accesoEncargado.html?ope=add&sta=true&tipo=prod");
        } catch (Exception e) {
            response.sendRedirect("accesoEncargado.html?ope=add&sta=false&tipo=prod");
            System.err.println("Error en ProductoServlet -> crearProducto() " + e.getMessage());
        }
    }

    private void returnListProductos(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException {
        PrintWriter out = response.getWriter();
        response.setContentType("Content-Type: application/json");
        listaJson = new JSONArray();
        List<Producto> list = listadoProductos();
        if (list != null) {
            for (Producto pro : list) {
                if (pro != null) {
                    jObj = new JSONObject();
                    jObj.put("idpro", pro.getIdProducto().intValue());
                    jObj.put("nombre", pro.getNombre());
                    jObj.put("desc", pro.getDescripcion());
                    jObj.put("precio", pro.getPrecio().intValue());
                    DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    Date fecha;
                    fecha = pro.getInicio().toGregorianCalendar().getTime();
                    jObj.put("fecha_cre", sdf.format(fecha));
                    fecha = pro.getActualizacion().toGregorianCalendar().getTime();
                    jObj.put("fecha_act", sdf.format(fecha));
                    jObj.put("imagen", pro.getImagen());
                    jObj.put("nombre_cat", pro.getCategoriaIdCategoria().getDescripcion());
                    jObj.put("idcat", pro.getCategoriaIdCategoria().getIdCategoria().intValue());
                    listaJson.add(jObj);
                }
            }
        }
        out.println(listaJson);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ProductoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ProductoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private java.util.List<servicios.Producto> listadoProductos() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ProductoService port = service.getProductoServicePort();
        return port.listadoProductos();
    }

    private String insertarProducto(int id, java.lang.String nombre, java.lang.String descripcion, int precio, javax.xml.datatype.XMLGregorianCalendar fechaInicio, javax.xml.datatype.XMLGregorianCalendar fechaActualizacion, java.lang.String rutaImagen, int idCagegoria) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ProductoService port = service.getProductoServicePort();
        return port.crearProducto(id, nombre, descripcion, precio, fechaInicio, fechaActualizacion, rutaImagen, idCagegoria);
    }

    private String modificarProducto(int id, java.lang.String nombre, java.lang.String descripcion, int precio, javax.xml.datatype.XMLGregorianCalendar fechaInicio, javax.xml.datatype.XMLGregorianCalendar fechaActualizacion, java.lang.String rutaImagen, int idCagegoria) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ProductoService port = service.getProductoServicePort();
        return port.modificarProducto(id, nombre, descripcion, precio, fechaInicio, fechaActualizacion, rutaImagen, idCagegoria);
    }

}
