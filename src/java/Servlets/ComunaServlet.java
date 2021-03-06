/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import servicios.Ciudad;
import servicios.CiudadService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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
public class ComunaServlet extends HttpServlet {
    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MisOfertasWebService/CiudadService.wsdl")
    private CiudadService_Service service;
    
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
//        String accion = request.getParameter("accion");
//        System.err.println("ComunaServlet -> " + accion);
//        switch (accion) {
//            case "listaComunas":
//                returnListComunas(request, response);
//                break;
//            default:
//                System.err.println("Fue al Defaul en CategoriaServlet");
//                returnListComunas(request, response);
//                break;
//        }
        returnListComunas(request, response);
    }
    
    private void returnListComunas(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
//        response.setContentType("Content-Type: application/json");
        response.setContentType("text/html;charset=UTF-8");
        listaJson = new JSONArray();
        Comparator<Ciudad> comp = (c1, c2) -> c1.getNombre().compareToIgnoreCase(c2.getNombre());
        List<Ciudad> list = listadoCiudades().stream().sorted(comp).collect(Collectors.toList());
        if (list != null) {
            for (Ciudad cat : list) {
                if (cat != null) {
                    jObj = new JSONObject();
                    jObj.put("nombre", cat.getNombre());
                    jObj.put("idcom", cat.getIdCiudad().toString());
                    jObj.put("idreg", cat.getRegionIdRegion().getIdRegion().intValue());
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

    private java.util.List<servicios.Ciudad> listadoCiudades() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.CiudadService port = service.getCiudadServicePort();
        return port.listadoCiudades();
    }
    
}
