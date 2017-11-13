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
import Services.Usuario;
import Services.UsuarioService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_17225/MisOfertasWebService/UsuarioService.wsdl")
    private UsuarioService_Service service_2;

//    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_17225/WSMisOfertas/UsuarioService.wsdl")
//    private UsuarioService_Service service_2;
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
        response.setContentType("text/html;charset=UTF-8");
        String btnAccion = request.getParameter("btnAccion");
        System.err.println("ClienteServlet ->" + btnAccion);
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
            case "getDataClient":
                returnClient(request, response);
                break;
            default:
                existeCorreo(request, response);
                break;
        }
    }

    public void inicioSesion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        correo = request.getParameter("mail");
        pass1 = request.getParameter("pass");
        Cliente cli = autenticacion(correo, pass1);
        jObj = new JSONObject();
//        En el caso de no encontrar nada retornará 0 en estado
        int idCliente = cli.getIdCliente().intValue();
        System.err.println("el id es -> " + idCliente);
        HttpSession session = request.getSession();
        if (idCliente == 0) {
            Usuario us = autenticarTrabajador(correo, pass1);
            if (us.getIdUsuario().intValue() != 0) {
                jObj.put("estado", us.getIdUsuario().intValue() + "");
                jObj.put("redirect", "accesoEncargado.html?d=" + us.getIdUsuario().intValue() + "");
                System.err.println("Redirect");
                PrintWriter out = response.getWriter();
                response.setContentType("Content-Type: application/json");
                out.println(jObj);
                session.setAttribute("trabajador", us);
            }
        } else {
            jObj.put("estado", idCliente);
            PrintWriter out = response.getWriter();
            response.setContentType("Content-Type: application/json");
            out.println(jObj);
            session.setAttribute("cliente", cli);
        }
        session.setMaxInactiveInterval(1000);
    }

    public void returnClient(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idClie = Integer.parseInt(request.getParameter("idcli"));
        Cliente cli = listadoClientes().stream().filter((c) -> c.getIdCliente().intValue() == idClie).findAny().orElse(null);
        jObj = new JSONObject();
        if (cli == null) {
            jObj.put("correo", "");
        } else {
            jObj.put("correo", cli.getCorreo());
        }
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
            Usuario us = listadoUsuarios().stream().filter((u) -> u.getCorreo().equals(correo.trim().toLowerCase())).findAny().orElse(null);
            if (us != null && us.getCargoIdcargo().getIdcargo().intValue() == 3) {
                jObj.put("correo", us.getCorreo());
            } else {
                jObj.put("correo", "");
            }
        } else {
            jObj.put("correo", cli.getCorreo());
            jObj.put("idcli", cli.getIdCliente().intValue());
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
        crearPersona(0, nombre, apellidos, rut, sexo);
        GregorianCalendar c = new GregorianCalendar();
        GregorianCalendar fechaHoy = new GregorianCalendar();
        try {
            fechaHoy.setTime(new Date());
            c.setTime(fechaNac);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            c.setTime(new Date());
        }
        XMLGregorianCalendar fecha = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        XMLGregorianCalendar fechaHoyXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(fechaHoy);

        Persona p = Collections.max(listadoPersonas(), Comparator.comparing(Persona::getIdpersona));
        Cliente clitemp = Collections.max(listadoClientes(), Comparator.comparing(Cliente::getIdCliente));

        String ret = crearCliente(clitemp.getIdCliente().intValue() + 1, fecha, correo, pass1, telefono, recibirNoticias + "", fechaHoyXml, fechaHoyXml, ciudad, 1, p.getIdpersona().intValue());

        Cliente cli = Collections.max(listadoClientes(), Comparator.comparing(Cliente::getIdCliente));
        System.err.println(ret);
        jObj = new JSONObject();
        if (correo.trim() != "" && pass1.trim() != "" && pass2.trim() != "") {
            jObj.put("id", correo.trim());
            jObj.put("correo", correo);
            jObj.put("nombre", nombre);
        }
        HttpSession session = request.getSession(true);
        session.setAttribute("cliente", cli);
        response.sendRedirect("accesoCliente.html?d=" + cli.getIdCliente().toString());
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
        return (Cliente) port.autenticacion(correo, contrasena);
    }

    private Usuario autenticarTrabajador(java.lang.String correo, java.lang.String contrasena) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Services.UsuarioService port = service_2.getUsuarioServicePort();
        return port.autenticarTrabajador(correo, contrasena);
    }

    private java.util.List<Services.Usuario> listadoUsuarios() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Services.UsuarioService port = service_2.getUsuarioServicePort();
        return port.listadoUsuarios();
    }

    }
