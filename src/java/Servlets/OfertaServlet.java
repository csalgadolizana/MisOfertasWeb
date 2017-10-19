/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author PC-Cristopher
 */
public class OfertaServlet extends HttpServlet {

    private String rutaFiles;
    private String rutaForDB;
    private final String rutaForDBDefaul = "folder\\img\\Usuarios\\";
    private final String rutaDefaulRaiz = "D:\\trabajoHotelyCentro\\web\\";

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OfertaServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OfertaServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    private void btnCrear(HttpServletRequest request, HttpServletResponse response, List<FileItem> items) throws FileUploadException, IOException, Exception {
        int intputNumeroHabitacion = 0, intputMetrosCuadrados = 0, intputPrecioDia = 0, intputPrecioNoche = 0, intputCantPersonas = 0;
        HttpSession session = request.getSession();
//        usuario = (Usuario) session.getAttribute("usuario");
//        rutaFiles = rutaDefaulRaiz + rutaForDBDefaul + usuario.getIdUsuario() + "-" + usuario.getUsername();
//        rutaForDB = rutaForDBDefaul + usuario.getIdUsuario() + "-" + usuario.getUsername() + "\\";
        File file = new File(rutaFiles);
        if (!file.exists()) {
            System.err.println("Directory is not created!");
            if (file.mkdir()) {
                System.err.println("Directory is created!");
            } else {
                System.err.println("Failed to create directory!");
            }
        }
        String intputNombreSucursal = "", intputDireccion = "";
        int intputTelefono = 0;
        for (FileItem item : items) {
            System.err.println("+++++++ entro for");
            if (item.isFormField()) {
                switch (item.getFieldName()) {
                    case "intputNumeroHabitacion":
                        intputNumeroHabitacion = Integer.parseInt(item.getString());
                        System.err.println("intputNumeroHabitacion : " + intputNumeroHabitacion);
                        break;
                    case "intputMetrosCuadrados":
                        intputMetrosCuadrados = Integer.parseInt(item.getString());
                        System.err.println("intputMetrosCuadrados : " + intputMetrosCuadrados);
                        break;
                    case "intputPrecioDia":
                        intputPrecioDia = Integer.parseInt(item.getString());
                        System.err.println("intputPrecioDia : " + intputPrecioDia);
                        break;
                    case "intputPrecioNoche":
                        intputPrecioNoche = Integer.parseInt(item.getString());
                        System.err.println("intputPrecioNoche : " + intputPrecioNoche);
                        break;
                    case "intputCantPersonas":
                        intputCantPersonas = Integer.parseInt(item.getString());
                        System.err.println("intputCantPersonas : " + intputCantPersonas);
                        break;
                }
            } else {
                if (item.getFieldName().equals("inputImagen")) {
                    System.err.println("+++++++ item.getFieldName().equals(\"inputImagen\")");
                    System.err.println("____----_- " + rutaFiles);

                }
                System.err.println("+++++++ itfgdf");
                String fieldname = item.getFieldName();
                String conte = item.getContentType();
                String filename = FilenameUtils.getName(item.getName());
                System.err.println("************fieldname : " + fieldname + " fieldvalue : " + filename + " conte : " + conte);
                InputStream filecontent = item.getInputStream();
                File f = new File(rutaFiles, item.getName());
                rutaForDB = rutaForDB + item.getName();
                System.out.println("Ruta 11 :  " + rutaFiles);
                System.out.println("Ruta 22 :  " + rutaForDB);
                item.write(f);
                Thread.sleep(2000);
            }
        }
//        habitacionDAO = new HabitacionDAO();
        try {
            //empresa = (Empresa) session.getAttribute("empresa");
//            habitacion = new Habitacion(intputNumeroHabitacion, intputMetrosCuadrados, intputPrecioDia, intputPrecioNoche, intputCantPersonas, 1, rutaForDB);
//            habitacionDAO.grabar(habitacion);
//            List<Habitacion> lis = habitacionDAO.listar();
//            modelAndView.setViewName("MantenedorAdministrador");
//            if (lis != null) {
////                modelAndView.addObject("lis", lis);
//                request.setAttribute("listEmpresa", lis);
//            } else {
////                modelAndView.getModel().put("errorMensaje", "Datos incorectos");
////                modelAndView.setViewName("error");
//            }
        } catch (Exception e) {
            System.err.println("Error : " + e.getMessage() + "  ++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
        System.out.println("*******************RETORNOOOOOOO------------------------------------------------------------------");
//        return modelAndView;
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
