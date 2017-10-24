/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Services.Producto;
import Services.ProductoService_Service;
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
public class ProductoServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_17225/MisOfertasWebService/ProductoService.wsdl")
    private ProductoService_Service service;
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

    private void returnListProductos(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
                    jObj.put("precio", pro.getPrecio().intValue());
                    listaJson.add(jObj);
                }
            }
        }
        out.println(listaJson);
    }

    private java.util.List<Services.Producto> listadoProductos() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Services.ProductoService port = service.getProductoServicePort();
        return port.listadoProductos();
    }
    
}
