/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Services.Cliente;
import Services.Persona;
import Services.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.simple.JSONObject;

/**
 *
 * @author PC-Cristopher
 */
public class UsuarioServlet extends HttpServlet {

    JSONObject jObj;

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
        System.err.println("ClienteServlet ->" + accion);
        switch (accion) {
            case "getDataSession":
                getMyData(request, response);
                break;
            case "destroySession":
                destroySession(request, response);
                break;
            default:
//                response.sendRedirect("index.html");
                break;
        }
    }

    private void destroySession(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(true);
        session.invalidate();
        jObj = new JSONObject();
        jObj.put("sesion", "destroyed");
        PrintWriter out = response.getWriter();
        response.setContentType("Content-Type: application/json");
        out.println(jObj);
    }

    private void getMyData(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(true);
        Cliente cliente = (Cliente) session.getAttribute("cliente");
        Usuario usuario = (Usuario) session.getAttribute("trabajador");
        jObj = new JSONObject();
        if (cliente != null) {
            System.out.println("cliente " + cliente.getPersonaIdpersona().getNombre());
            jObj.put("sesion", "1");
            jObj.put("nombre", cliente.getPersonaIdpersona().getNombre());
            jObj.put("correo", cliente.getPersonaIdpersona().getApellidos());
            jObj.put("rut", cliente.getPersonaIdpersona().getRut());
            jObj.put("apellido", cliente.getPersonaIdpersona().getApellidos());
            jObj.put("sexo", cliente.getPersonaIdpersona().getSexoIdSexo().getIdSexo().intValue());
            jObj.put("correo", cliente.getCorreo());
            jObj.put("telefono", cliente.getTelefono().intValue());
            jObj.put("aceptaInformativo", cliente.getAceptaInformativo());
            System.out.println("aceptaInformativo " + cliente.getAceptaInformativo());
            jObj.put("idCiudad", cliente.getCiudadIdCiudad().getIdCiudad().intValue());
            DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fecha = cliente.getFechaNacimiento().toGregorianCalendar().getTime();
            jObj.put("fecha", sdf.format(fecha));
        } else {
            if (usuario != null) {
                jObj.put("sesion", "1");
                jObj.put("nombre", usuario.getPersonaIdpersona().getNombre());
                jObj.put("correo", usuario.getPersonaIdpersona().getApellidos());
                jObj.put("sexo", usuario.getPersonaIdpersona().getSexoIdSexo().getIdSexo().intValue());
                jObj.put("correo", usuario.getCorreo());
            } else {
                jObj.put("sesion", "nula");
            }
        }
//        jObj.put("correo", cliente.getPersonaIdpersona().getNombre() + "");
//        jObj.put("correo", usuario.getPersonaIdpersona().getNombre() + "");
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

}
