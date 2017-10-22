/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Services.Cliente;
import Services.ClienteService_Service;
import Services.Persona;
import Services.PersonaService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;
import org.json.simple.JSONObject;

/**
 *
 * @author PC-Cristopher
 */
public class ClienteServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_17225/MisOfertasWebService/ClienteService.wsdl")
    private ClienteService_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_17225/MisOfertasWebService/PersonaService.wsdl")
    private PersonaService_Service service;

    String correo, pass1, pass2;
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
            throws ServletException, IOException, DatatypeConfigurationException, ParseException {
//        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
//        response.setContentType("Content-Type: application/json");
        String btnAccion = request.getParameter("btnAccion");
        System.err.println(btnAccion);
        switch (btnAccion) {
            case "primerRegistro":
                returnToFormRegister(request, response);
                break;
            case "segundoRegistro":
                registrarPersonaCliente(request, response);
                break;
            case "quieroDatos":
                returnRegister(request, response);
                break;
            case "comprobarCorreo":
                existeCorreo(request, response);
                break;
            case "iniciarSesion":
                inicioSesion(request, response);
                break;
            default:
                returnRegister(request, response);
                break;
        }

        /* TODO output your page here. You may use following sample code. */
//        out.println(jObj);
    }

    public void inicioSesion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        correo = request.getParameter("mail");
        pass1 = request.getParameter("pass");
        Cliente cli = autenticacion(correo, pass1);
        jObj = new JSONObject();
//        En el caso de no encontrar nada retornará 0 en estado
        jObj.put("estado", cli.getIdCliente().floatValue());
        PrintWriter out = response.getWriter();
        response.setContentType("Content-Type: application/json");
        out.println(jObj);
    }

    public void existeCorreo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        correo = request.getParameter("mail");
        Cliente cli = listadoClientes().stream().filter((c) -> c.getCorreo().equals(correo.trim().toLowerCase())).findAny().orElse(null);
        jObj = new JSONObject();
        if (cli == null) {
//            if (correo.trim() != "" && pass1.trim() != "" && pass2.trim() != "") {
            jObj.put("correo", "");
//            }
        } else {
//            if (correo.trim() != "" && pass1.trim() != "" && pass2.trim() != "") {
            jObj.put("correo", cli.getCorreo());
//            }
        }
        PrintWriter out = response.getWriter();
        response.setContentType("Content-Type: application/json");
        out.println(jObj);

    }

    public void returnToFormRegister(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        correo = request.getParameter("txtCorreoRegistro");
        pass1 = request.getParameter("txtContrasenaRegistro");
        pass2 = request.getParameter("txtContrasenaRegistro2");
        jObj = new JSONObject();
        if (correo.trim() != "" && pass1.trim() != "" && pass2.trim() != "") {
            jObj.put("correo", correo.trim());
            jObj.put("password1", pass1);
            jObj.put("password2", pass1);
        }
        response.sendRedirect("registrarCliente.html");
    }

    public void registrarPersonaCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, DatatypeConfigurationException, ParseException {
        String nombre, apellidos, rut;
        Date fechaNac;
        int sexo, telefono, recibirNoticias, ciudad;
        correo = request.getParameter("txtCorreo").trim().toLowerCase();
        pass1 = request.getParameter("txtPasswd");
        pass2 = request.getParameter("txtPasswd2");
        nombre = request.getParameter("txtNombre");
        apellidos = request.getParameter("txtApellido");
        rut = request.getParameter("txtRut");
        System.err.println("Fecha naci" + request.getParameter("txtFechaNacimiento"));
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        fechaNac = sdf.parse(request.getParameter("txtFechaNacimiento"));

        sexo = Integer.parseInt(request.getParameter("selectSexo"));
        telefono = Integer.parseInt(request.getParameter("txtTelefono"));
        recibirNoticias = (request.getParameter("checAceptaInformativo") == null) ? 0 : 1;
        ciudad = Integer.parseInt(request.getParameter("selectCiudades"));
//        System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        crearPersona(0, nombre, apellidos, rut, sexo);
//        System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        GregorianCalendar c = new GregorianCalendar();
//        System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        GregorianCalendar fechaHoy = new GregorianCalendar();
//        System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        try {
            fechaHoy.setTime(new Date());
//            System.err.println("La fecha que está pasando es ");
//            System.err.println(new Date());
//            System.err.println(fechaHoy);
            c.setTime(fechaNac);
            System.err.println("Fecha naci " + c);
        } catch (Exception e) {
            System.err.println("Error<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println(e.getMessage());
            c.setTime(new Date());
            System.err.println("Error<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        }
        XMLGregorianCalendar fecha = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        XMLGregorianCalendar fechaHoyXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(fechaHoy);

        Persona p = Collections.max(listadoPersonas(), Comparator.comparing(Persona::getIdpersona));

        String ret = crearCliente(0, fecha, correo, pass1, telefono, recibirNoticias + "", fechaHoyXml, fechaHoyXml, ciudad, 1, p.getIdpersona().intValue());
        System.err.println(ret);
        jObj = new JSONObject();
        if (correo.trim() != "" && pass1.trim() != "" && pass2.trim() != "") {
            jObj.put("id", correo.trim());
            jObj.put("correo", correo);
            jObj.put("nombre", nombre);
        }
        response.sendRedirect("registrarCliente.html");
    }

    public void returnRegister(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
        try {
            processRequest(request, response);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
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

    private String crearPersona(int id, java.lang.String nombre, java.lang.String apellido, java.lang.String rut, int sexo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Services.PersonaService port = service.getPersonaServicePort();
        return port.crearPersona(id, nombre, apellido, rut, sexo);
    }

    private java.util.List<Services.Persona> listadoPersonas() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Services.PersonaService port = service.getPersonaServicePort();
        return port.listadoPersonas();
    }

    private String crearCliente(int id, javax.xml.datatype.XMLGregorianCalendar fechaNacimiento, java.lang.String correo, java.lang.String password, int telefono, java.lang.String aceptaInformativo, javax.xml.datatype.XMLGregorianCalendar fechaInicio, javax.xml.datatype.XMLGregorianCalendar fechaActualizacion, int idCiudad, int idEstado, int idPersona) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Services.ClienteService port = service_1.getClienteServicePort();
        return port.crearCliente(id, fechaNacimiento, correo, password, telefono, aceptaInformativo, fechaInicio, fechaActualizacion, idCiudad, idEstado, idPersona);
    }

    private java.util.List<Services.Cliente> listadoClientes() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Services.ClienteService port = service_1.getClienteServicePort();
        return port.listadoClientes();
    }

    private Cliente autenticacion(java.lang.String correo, java.lang.String contrasena) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Services.ClienteService port = service_1.getClienteServicePort();
        return port.autenticacion(correo, contrasena);
    }

}
