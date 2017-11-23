/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import servicios.DetalleOferta;
import servicios.DetalleOfertaService_Service;
import servicios.Oferta;
import servicios.OfertaLocalService_Service;
import servicios.OfertaService_Service;
import servicios.Ofertalocal;
import servicios.Producto;
import servicios.ProductoService_Service;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
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
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author PC-Cristopher
 */
public class OfertaServlet extends HttpServlet {

    JSONObject jObj;
    JSONArray listaJson;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MisOfertasWebService/DetalleOfertaService.wsdl")
    private DetalleOfertaService_Service service_3;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MisOfertasWebService/OfertaLocalService.wsdl")
    private OfertaLocalService_Service service_2;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MisOfertasWebService/OfertaService.wsdl")
    private OfertaService_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MisOfertasWebService/ProductoService.wsdl")
    private ProductoService_Service service;

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
            throws ServletException, IOException, Exception {

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
            System.err.println("1 OfertaServlet ->" + bnt);
            switch (bnt) {
                case "btnCrear":
                    crearOferta(request, response, items);
                    break;
                case "btnModificar":
                    actualizarferta(request, response, items);
                case "listaOfertas":
                    returnListOfertas(request, response);
                    break;
            }
        } catch (Exception e) {
            String accion = request.getParameter("accion");
            switch (accion) {
                case "listaOfertas":
                    returnListOfertas(request, response);
                    break;
                case "btnPublicar":
                    publicarOferta(request, response);
                    break;
                case "btnDejarDePublicar":
                    dejarDePublicarOferta(request, response);
                    break;
                default:
                    System.err.println("Fue al Defaul en ProductosServlet");
//                existeCorreo(request, response);
                    break;
            }
        }
    }

    private void dejarDePublicarOferta(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idOferta = Integer.parseInt(request.getParameter("inputIdOfertadej").trim());
        try {
            DetalleOferta detalleOferta = listadoDetalleOferta().stream().filter((x) -> x.getDetalleOfertaPK().getIdDetOferta().intValue() == idOferta).findFirst().orElse(null);
            dejarDePublicarOfertaServ(detalleOferta.getOferta().getIdOferta().intValue());
            response.sendRedirect("accesoEncargado.html?ope=nopub&sta=true&tipo=offer");
        } catch (Exception e) {
            response.sendRedirect("accesoEncargado.html?ope=nopub&sta=false&tipo=offer");
            System.err.println("Error en OfertaServlet -> publicarOferta() " + e.getMessage());
        }
    }

    private void publicarOferta(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idOferta = Integer.parseInt(request.getParameter("inputIdOferta").trim());
        try {
            DetalleOferta detalleOferta = listadoDetalleOferta().stream().filter((x) -> x.getDetalleOfertaPK().getIdDetOferta().intValue() == idOferta).findFirst().orElse(null);
            publicarOferta_1(detalleOferta.getOferta().getIdOferta().intValue());
            response.sendRedirect("accesoEncargado.html?ope=pub&sta=true&tipo=offer");
        } catch (Exception e) {
            response.sendRedirect("accesoEncargado.html?ope=pub&sta=false&tipo=offer");
            System.err.println("Error en OfertaServlet -> publicarOferta() " + e.getMessage());
        }
    }

    private void returnListOfertas(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("Content-Type: application/json");
        listaJson = new JSONArray();
        List<DetalleOferta> listODetalle = listadoDetalleOferta();
        if (listODetalle != null) {
            for (DetalleOferta dtof : listODetalle) {
                if (dtof != null) {
                    jObj = new JSONObject();
                    jObj.put("idof", dtof.getDetalleOfertaPK().getIdDetOferta().intValue());
                    jObj.put("nombre", dtof.getOferta().getNombre());
                    jObj.put("estado", dtof.getOferta().getEstadoIdEstado());
                    jObj.put("idcat", dtof.getProducto().getCategoriaIdCategoria().getIdCategoria().intValue());
                    jObj.put("desc", dtof.getOferta().getDescripcion());
                    jObj.put("precio_normal", dtof.getOferta().getPrecioNormal());
                    jObj.put("idprod", dtof.getProducto().getIdProducto().intValue());
                    jObj.put("precio_oferta", dtof.getOferta().getPrecioOferta());
                    jObj.put("num_visitas", dtof.getOferta().getNumeroVisitas());
                    jObj.put("min_compras", dtof.getOferta().getMinimoCompra());
                    jObj.put("max_compras", dtof.getOferta().getMaximoCompra());
                    jObj.put("estado", dtof.getOferta().getEstadoIdEstado().getIdEstado());
                    jObj.put("ruta_img", dtof.getProducto().getImagen());
                    DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    String fechaCupon = sdf.format(new Date()).toString();
                    jObj.put("fecha", fechaCupon);
                    Ofertalocal oferLoc = listadoOfertaLocal().stream().filter((ofl) -> ofl.getOferta().getIdOferta().intValue() == dtof.getOferta().getIdOferta().intValue()).findFirst().orElse(null);
                    int id_local = oferLoc == null ? 0 : oferLoc.getLocal().getIdLocal().intValue();
                    jObj.put("id_local", id_local);
                    listaJson.add(jObj);
                }
            }
        }
        out.println(listaJson);
    }

    private void actualizarferta(HttpServletRequest request, HttpServletResponse response, List<FileItem> items) throws FileUploadException, IOException, Exception {
        try {
            int idOfertaa = 0, cantMax = 0, idProducto = 0, idProducto_input = 0, precioOferta = 0, idTienda = 0;
            String nombreOferta = null, desOfert = null;
            for (FileItem item : items) {
                if (item.isFormField()) {
                    System.err.println(item.getFieldName());
                    switch (item.getFieldName()) {
                        case "idOferta2":
                            idOfertaa = Integer.parseInt(item.getString().trim());
                            break;
                        case "nombreOferta2":
                            nombreOferta = item.getString().trim();
                            break;
                        case "descripcionOferta2":
                            desOfert = item.getString().trim();
                            break;
                        case "selectProducto2":
                            System.err.println("Entro al case del Select");
                            idProducto = Integer.parseInt(item.getString().trim());
                            break;
                        case "idProducto":
                            System.err.println("Entro al case del id Prodcutos");
                            idProducto_input = Integer.parseInt(item.getString().trim());
                            break;
                        case "txtPrecioOferta2":
                            precioOferta = Integer.parseInt(item.getString().trim());
                            break;
                        case "selectTiendas2":
                            idTienda = Integer.parseInt(item.getString().trim());
                            break;
                        case "txtCantMaxima2":
                            cantMax = Integer.parseInt(item.getString().trim());
                            break;
                    }
                }
            }
            idProducto = idProducto_input;
            List<Producto> lista = listadoProductos();
            int idpro = idProducto;
            Producto p = lista.stream().filter((x) -> x.getIdProducto().intValue() == idpro).findFirst().orElse(null);
            GregorianCalendar fechaHoy = new GregorianCalendar();
            fechaHoy.setTime(new Date());
            XMLGregorianCalendar fechaHoyXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(fechaHoy);
            int valor = idOfertaa;
            DetalleOferta dto = listadoDetalleOferta().stream().filter((x) -> x.getDetalleOfertaPK().getIdDetOferta().intValue() == valor).findFirst().orElse(null);
            modificarOferta(dto.getOferta().getIdOferta().intValue(), nombreOferta.trim(), desOfert.trim(), precioOferta, 0, cantMax, fechaHoyXml);

            response.sendRedirect("accesoEncargado.html?ope=mod&sta=true&tipo=offer");
        } catch (Exception e) {
            response.sendRedirect("accesoEncargado.html?ope=mod&sta=false&tipo=offer");
            System.err.println("Error en OfertaServlet -> MoficarOferta() " + e.getMessage());
        }
    }

    private void crearOferta(HttpServletRequest request, HttpServletResponse response, List<FileItem> items) throws FileUploadException, IOException, Exception {
        try {
            int cantMax = 0, idProducto = 0, precioOferta = 0, idTienda = 0;
            String nombreOferta = null, desOfert = null;
            for (FileItem item : items) {
                if (item.isFormField()) {
                    System.err.println(item.getFieldName());
                    switch (item.getFieldName()) {
                        case "nombreOferta":
                            nombreOferta = item.getString().trim();
                            break;
                        case "descripcionOferta":
                            desOfert = item.getString().trim();
                            break;
                        case "selectProducto":
                            idProducto = Integer.parseInt(item.getString().trim());
                            break;
                        case "txtPrecioOferta":
                            precioOferta = Integer.parseInt(item.getString().trim());
                            break;
                        case "selectTiendas":
                            idTienda = Integer.parseInt(item.getString().trim());
                            break;
                        case "txtCantMaxima":
                            cantMax = Integer.parseInt(item.getString().trim());
                            break;
                    }
                }
            }
            List<Producto> lista = listadoProductos();
            int idpro = idProducto;
            Producto p = lista.stream().filter((x) -> x.getIdProducto().intValue() == idpro).findFirst().orElse(null);
            GregorianCalendar fechaHoy = new GregorianCalendar();
            fechaHoy.setTime(new Date());
            XMLGregorianCalendar fechaHoyXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(fechaHoy);
            crearOferta(0, nombreOferta.trim(), desOfert.trim(), p.getPrecio().intValue(), precioOferta, 0, 1, cantMax, fechaHoyXml, fechaHoyXml, 2);
            Oferta lastOferta = Collections.max(listadoOferta(), Comparator.comparing(Oferta::getIdOferta));
            crearOfertaLocal(0, desOfert, lastOferta.getIdOferta().intValue(), idTienda);
            crearDetalleOferta(0, idProducto, lastOferta.getIdOferta().intValue());

            response.sendRedirect("accesoEncargado.html?ope=add&sta=true&tipo=offer");
        } catch (Exception e) {
            response.sendRedirect("accesoEncargado.html?ope=add&sta=false&tipo=offer");
            System.err.println("Error en OfertaServlet -> crearOferta() " + e.getMessage());
        }
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
        } catch (Exception ex) {
            Logger.getLogger(OfertaServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (Exception ex) {
            Logger.getLogger(OfertaServlet.class.getName()).log(Level.SEVERE, null, ex);
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

    private String modificarProducto(int id, java.lang.String nombre, java.lang.String descripcion, int precio, javax.xml.datatype.XMLGregorianCalendar fechaInicio, javax.xml.datatype.XMLGregorianCalendar fechaActualizacion, java.lang.String rutaImagen, int idCagegoria) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ProductoService port = service.getProductoServicePort();
        return port.modificarProducto(id, nombre, descripcion, precio, fechaInicio, fechaActualizacion, rutaImagen, idCagegoria);
    }

    private java.util.List<servicios.Producto> listadoProductos() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ProductoService port = service.getProductoServicePort();
        return port.listadoProductos();
    }

    private String crearOferta(int id, java.lang.String nombre, java.lang.String descripcion, int precioNormal, int precioOferta, int numeroVisitas, int minCompras, int maxCompras, javax.xml.datatype.XMLGregorianCalendar fechaInicio, javax.xml.datatype.XMLGregorianCalendar fechaActulizacion, int estadoId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.OfertaService port = service_1.getOfertaServicePort();
        return port.crearOferta(id, nombre, descripcion, precioNormal, precioOferta, numeroVisitas, minCompras, maxCompras, fechaInicio, fechaActulizacion, estadoId);
    }

    private String crearOfertaLocal(int id, java.lang.String descripcion, int ofertaId, int localId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.OfertaLocalService port = service_2.getOfertaLocalServicePort();
        return port.crearOfertaLocal(id, descripcion, ofertaId, localId);
    }

    private java.util.List<servicios.Ofertalocal> listadoOfertaLocal() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.OfertaLocalService port = service_2.getOfertaLocalServicePort();
        return port.listadoOfertaLocal();
    }

    private java.util.List<servicios.Oferta> listadoOferta() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.OfertaService port = service_1.getOfertaServicePort();
        return port.listadoOferta();
    }

    private String crearDetalleOferta(int idDetalleOferta, int productoId, int ofertaId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.DetalleOfertaService port = service_3.getDetalleOfertaServicePort();
        return port.crearDetalleOferta(idDetalleOferta, productoId, ofertaId);
    }

    private java.util.List<servicios.DetalleOferta> listadoDetalleOferta() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.DetalleOfertaService port = service_3.getDetalleOfertaServicePort();
        return port.listadoDetalleOferta();
    }

    private String modificarOferta(int id, java.lang.String nombre, java.lang.String descripcion, int precioOferta, int minCompras, int maxCompras, javax.xml.datatype.XMLGregorianCalendar fechaActulizacion) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.OfertaService port = service_1.getOfertaServicePort();
        return port.modificarOferta(id, nombre, descripcion, precioOferta, minCompras, maxCompras, fechaActulizacion);
    }

    private String publicarOferta_1(int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.OfertaService port = service_1.getOfertaServicePort();
        return port.publicarOferta(id);
    }

    private String dejarDePublicarOfertaServ(int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.OfertaService port = service_1.getOfertaServicePort();
        return port.dejarDePublicarOferta(id);
    }

}
