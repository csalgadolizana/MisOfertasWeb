/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import WSDL.Usuario;
import WSDL.UsuarioService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author PC-Cristopher
 */
public class UsuarioServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_17225/WSMisOfertas/UsuarioService.wsdl")
    private UsuarioService_Service service;

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

        String username = request.getParameter("username");
        String contrasena = request.getParameter("password");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsuarioServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuarioServlet at " + username + "</h1>");
            out.println("<h1>Servlet UsuarioServlet at " + contrasena + "</h1>");
            out.println("<h1>Servlet UsuarioServlet at " + request.getContextPath() + "</h1>");
            Usuario us = autenticacion(username, contrasena) == null ? (Usuario) request.getAttribute("usuario") : autenticacion(username, contrasena);
            out.println("<h1>Nombre at " + us.getNombre() + "</h1>");
            out.println("<h1>Servlet UsuarioServlet at " + us.getApellidos() + "</h1>");
            out.println("<h1>Servlet UsuarioServlet at " + us.getTipousuario() + "</h1>");
            out.println("<h1>Servlet UsuarioServlet at " + us.getCargo() + "</h1>");
//            out.println("<h1>Servlet UsuarioServlet at " + redirect(us, request, response) + "</h1>");
            redirect(us, request, response);
//            for (Usuario listadoUsuario : ) {
            //                out.println("<h1>Servlet UsuarioServlet at " + listadoUsuario.getNombre() + "</h1>");
            //                out.println("<h1>Servlet UsuarioServlet at " + listadoUsuario.getTelefono() + "</h1>");
            //            }
            out.println("</body>");
            out.println("</html>");
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

    private java.util.List<WSDL.Usuario> listadoUsuarios() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        WSDL.UsuarioService port = service.getUsuarioServicePort();
        return port.listadoUsuarios();
    }

    private Usuario autenticacion(java.lang.String nombre, java.lang.String contrasena) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        WSDL.UsuarioService port = service.getUsuarioServicePort();
        return port.autenticacion(nombre, contrasena);
    }

    private void redirect(Usuario usuario, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Link = "/";
        switch (usuario.getTipousuario().intValue()) {
            //Usuario de tipo Cliente
            case 1:
//                response.sendRedirect("dsf");
                request.setAttribute("cliente", usuario);
                Link = Link + "accesoCliente";
                break;
            //Usuario de tipo Encargado de tienda
            case 2:
                request.setAttribute("encargado", usuario);
                Link = Link + "accesoEncargado";
                break;
            default:
                request.setAttribute("usuario", "asdas");
                Link = Link + "index";
                break;
        }
//        return Link + ".html";
        request.getRequestDispatcher(Link + ".html").forward(request, response);
    }

}
