/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import servicios.Cliente;
import servicios.DetalleOferta;
import servicios.DetalleOfertaService_Service;
import servicios.OfertaVisitaService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;
import org.apache.commons.codec.digest.DigestUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author PC-Cristopher
 */
public class OfertaVisitaServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_21823/MisOfertasWebService/DetalleOfertaService.wsdl")
    private DetalleOfertaService_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_21823/MisOfertasWebService/OfertaVisitaService.wsdl")
    private OfertaVisitaService service;

    JSONObject jObj;
    JSONArray listaJson;

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
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        System.err.println("OfertaVisitaServlet -> " + accion);

        System.err.println("_______________________________________________________________________________________");
        String textoSinEncriptar = "sergio";
        textoSinEncriptar = "Perroni";
        String textoEncriptadoConMD5 = DigestUtils.md5Hex(textoSinEncriptar);
        String textoEncriptadoConSha512Hex = DigestUtils.sha512Hex(textoSinEncriptar);
        String textoEncriptadoConSHA = DigestUtils.sha1Hex(textoSinEncriptar);
        System.err.println("Texto Encriptado con MD5        : " + textoEncriptadoConMD5);
        System.err.println("Texto Encriptado con sha512Hex  : " + textoEncriptadoConSha512Hex);
        System.out.println("Texto Encriptado con SHA        : " + textoEncriptadoConSHA);
        System.err.println();
        System.err.println("_______________________________________________________________________________________");
        switch (accion) {
            case "registrarVisita":
                registrarVisita(request, response);
                break;
            default:
                System.err.println("Fue al Defaul en OfertaVisitaServlet");
                break;
        }
    }

    private void registrarVisita(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            jObj = new JSONObject();
            int idOferta = Integer.parseInt(request.getParameter("idDetalleOferta").trim());
            DetalleOferta dt = listadoDetalleOferta().stream().filter((x) -> x.getDetalleOfertaPK().getIdDetOferta().intValue() == idOferta).findFirst().orElse(null);
            GregorianCalendar fechaHoy = new GregorianCalendar();
            fechaHoy.setTime(new Date());
            XMLGregorianCalendar fechaHoyXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(fechaHoy);
            HttpSession session = request.getSession(true);
            Cliente cliente = (Cliente) session.getAttribute("cliente");
            crearOfertaVisitas(fechaHoyXml, cliente.getIdCliente().intValue(), dt.getOferta().getIdOferta().intValue());
            jObj.put("status", "ok");
        } catch (Exception e) {
            jObj.put("status", "fail");
            jObj.put("details", e.getMessage());
//            response.sendRedirect("accesoEncargado.html?ope=pub&sta=false&tipo=offer");
//            System.err.println("Error en OfertaServlet -> publicarOferta() " + e.getMessage());
        }
        PrintWriter out = response.getWriter();
        response.setContentType("Content-Type: application/json");
        out.println(jObj);
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
        processRequest(request, response);
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
        processRequest(request, response);
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

    private String crearOfertaVisitas(javax.xml.datatype.XMLGregorianCalendar fechaVista, int idCliente, int idOferta) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.OfertaVistaService port = service.getOfertaVistaServicePort();
        return port.crearOfertaVisitas(fechaVista, idCliente, idOferta);
    }

    private java.util.List<servicios.DetalleOferta> listadoDetalleOferta() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.DetalleOfertaService port = service_1.getDetalleOfertaServicePort();
        return port.listadoDetalleOferta();
    }

}
