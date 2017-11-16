/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

//import Services.Region;
//import Services.RegionService_Service;
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
import servicios.Region;
import servicios.RegionService_Service;

/**
 *
 * @author PC-Cristopher
 */
public class RegionServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MisOfertasWebService/RegionService.wsdl")
    private RegionService_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MisOfertasWebService/RegionService.wsdl")
    private RegionService_Service service;

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
//        System.err.println("RegionServlet -> " + accion);
//        switch (accion) {
//            case "listaRegiones":
//                returnListRegiones(request, response);
//                break;
//            default:
//                System.err.println("Fue al Defaul en CategoriaServlet");
//                returnListRegiones(request, response);
//                break;
//        }
        returnListRegiones(request, response);
    }

    private void returnListRegiones(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
//        response.setContentType("Content-Type: application/json");
//        response.setContentType("Content-Type: text/html; charset=ISO-8859-15");
        response.setContentType("text/html;charset=UTF-8");
        listaJson = new JSONArray();
        List<Region> list = listadoRegiones();
        if (list != null) {
            for (Region cat : list) {
                if (cat != null) {
                    jObj = new JSONObject();
                    jObj.put("nombre", cat.getNombre().toString());
                    jObj.put("idreg", cat.getIdRegion().intValue());
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

//    private java.util.List<Services.Region> listadoRegiones() {
//        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
//        // If the calling of port operations may lead to race condition some synchronization is required.
//        Services.RegionService port = service.getRegionServicePort();
//        return port.listadoRegiones();

    private java.util.List<servicios.Region> listadoRegiones() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.RegionService port = service_1.getRegionServicePort();
        return port.listadoRegiones();
    }
    

}
