/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Services.Cliente;
import Services.Local;
import Services.LocalService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author PC-Cristopher
 */
public class LocalServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MisOfertasWebService/LocalService.wsdl")
    private LocalService_Service service;

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
        response.setContentType("text/html;charset=UTF-8");
//        String accion = request.getParameter("accion");
////        System.err.println(accion);
//        switch (accion) {
//            case "listaLocales":
//                returnListLocales(request, response);
//                break;
//            default:
//                System.err.println("Fue al Defaul en LocalServlet");
////                existeCorreo(request, response);
//                break;
//        }
        returnListLocales(request, response);
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

    private void returnListLocales(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("Content-Type: application/json");
        List<Local> list = listadoLocal();
        listaJson = new JSONArray();
        if (list != null) {
            for (Local loc : list) {
                if (loc != null) {
                    jObj = new JSONObject();
                    jObj.put("nombre", loc.getNombre());
                    jObj.put("idl", loc.getIdLocal().toString());
                    jObj.put("idcom", loc.getCiudadIdCiudad().getIdCiudad().intValue());
                    jObj.put("idreg", loc.getCiudadIdCiudad().getRegionIdRegion().getIdRegion().intValue());
                    listaJson.add(jObj);
                }
            }
        }
        response.setContentType("text/html;charset=UTF-8");
        out.println(listaJson);
    }

    private java.util.List<Services.Local> listadoLocal() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Services.LocalService port = service.getLocalServicePort();
        return port.listadoLocal();
    }

}
