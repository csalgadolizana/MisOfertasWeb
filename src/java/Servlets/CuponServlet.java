/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.BarcodePDF417;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC-Cristopher
 */
public class CuponServlet extends HttpServlet {

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
            throws ServletException, IOException, FileNotFoundException, DocumentException {
        String accion = request.getParameter("accion");
        System.err.println("CuponServlet -> " + accion);
        switch (accion) {
            case "registrarVisita":
                crarCupon(request, response);
                break;
            case "parsearHTML":
                crarHTMLtoPDF(request, response);
                break;
            default:
                System.err.println("Fue al Defaul en CuponServlet");
                break;
        }
    }

    private void crarHTMLtoPDF(HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, DocumentException, BadElementException, IOException {
        Document document = new Document();
        FileOutputStream archivo = new FileOutputStream("C:\\Users\\PC-Cristopher\\Documents\\NetBeansProjects\\MisOfertasWeb\\web\\cupones\\cupon2.pdf");
        PdfWriter writer = PdfWriter.getInstance(document, archivo);
        document.open();

        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream("C:\\Users\\PC-Cristopher\\Documents\\NetBeansProjects\\MisOfertasWeb\\web\\cupon.html"));

        String code = "675-FH-A12";

        PdfContentByte cb = writer.getDirectContent();
        PdfPTable table = new PdfPTable(1);
//        table.addCell("Change baseline:");
        Barcode128 code128 = new Barcode128();
        code128.setBaseline(-1);
        code128.setSize(10);
        code128.setCode(code);
//        code128.setCodeType(Barcode128.CODE128);
        Image code128Image = code128.createImageWithBarcode(cb, null, null);
        PdfPCell cell = new PdfPCell(code128Image);
        cell.setBorder(0);
//        table.addCell(cell);

//        table.addCell("Add text and bar code separately:");
        cell.setBorder(0);
        code128 = new Barcode128();
        code128.setFont(null);
        code128.setCode("asdaffgfhf");
        code128.setCodeType(Barcode128.CODE128);
//        code128.setCodeType(Barcode.EAN13);
        code128.setSize(30);
        code128.setCode("Hola mundo");
        code128.setCode("19220903k");
        code128Image = code128.createImageWithBarcode(cb, null, null);
        code128Image.setBorder(2);
        cell = new PdfPCell();
        cell.addElement(new Phrase("Cliente : Juancho Perroni"));
        cell.addElement(code128Image);
        cell.setBorder(0);
        table.setWidthPercentage(50);
        table.addCell(cell);

//        document.add(code128Image);
        document.add(table);

        document.close();
    }

    private void crarCupon(HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, DocumentException, BadElementException, IOException {
        Document document = new Document();
        FileOutputStream archivo = new FileOutputStream("C:\\Users\\PC-Cristopher\\Documents\\NetBeansProjects\\MisOfertasWeb\\web\\cupones\\cupon.pdf");
        PdfWriter writer = PdfWriter.getInstance(document, archivo);
        document.open();

        //codigo de imagen
//        Image image = Image.getInstance("carta.png");
//        documento.add(image);
        //fin codigo de imagen
        PdfContentByte cb = writer.getDirectContent();
        BaseFont bf = BaseFont.createFont(BaseFont.COURIER_BOLD, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
        cb.setFontAndSize(bf, 12);
        cb.beginText();
        cb.setTextMatrix(50, 590);
        cb.showText("Hola mundo");
        cb.setTextMatrix(50, 560);
        cb.showText("Perroni");
        cb.setTextMatrix(50, 530);
        cb.showText("<div class=\"textLayer\" style=\"width: 1014px; height: 1318px;\"><div style=\"left: 96.8333px; top: 152.283px; font-size: 23.3333px; font-family: sans-serif; transform: scaleX(0.995746);\">BOLETIN DE CARGA ACADEMICA</div><div style=\"left: 474.833px; top: 152.283px; font-size: 23.3333px; font-family: sans-serif; transform: scaleX(1.03779);\">2do Sem.</div><div style=\"left: 616.583px; top: 152.283px; font-size: 23.3333px; font-family: sans-serif; transform: scaleX(1.13056);\">2017</div><div style=\"left: 96.8333px; top: 189.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Alumno:</div><div style=\"left: 191.333px; top: 189.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">SALGADO, CRISTOPHER ANTONIO</div><div style=\"left: 522.083px; top: 189.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Rut:</div><div style=\"left: 616.583px; top: 189.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">19220903-K</div><div style=\"left: 96.8333px; top: 209.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Carrera:</div><div style=\"left: 238.583px; top: 209.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">INGENIERÍA EN INFORMÁTICA</div><div style=\"left: 569.333px; top: 209.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">N°1446102</div><div style=\"left: 96.8333px; top: 229.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Jornada:</div><div style=\"left: 238.583px; top: 229.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Diurno</div><div style=\"left: 285.833px; top: 269.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Horario de Clases</div><div style=\"left: 607.083px; top: 23.8333px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Dirección de Docencia</div><div style=\"left: 607.083px; top: 43.8333px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Fecha emisión 03.11.2017</div><div style=\"left: 18.9167px; top: 90px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">SEDE: PUENTE ALTO</div><div style=\"left: 18.9167px; top: 110px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">N°SEDE: 13</div><div style=\"left: 28.3333px; top: 312.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Módulo</div><div style=\"left: 28.3333px; top: 332.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Horario</div><div style=\"left: 143.167px; top: 312.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Lunes</div><div style=\"left: 276.833px; top: 312.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Martes</div><div style=\"left: 402.5px; top: 312.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Miércoles</div><div style=\"left: 537.167px; top: 312.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Jueves</div><div style=\"left: 678.917px; top: 312.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Viernes</div><div style=\"left: 811.167px; top: 312.083px; font-size: 20px; font-family: monospace; transform: scaleX(1);\">Sábado</div><div class=\"endOfContent\"></div></div>");
        cb.setTextMatrix(100, 500);
        cb.showText("Curao");

//        PdfPTable table = new PdfPTable(4);
//        table.setWidthPercentage(100);
//        for (int i = 0; i < 3; i++) {
//            table.addCell(createBarcode(writer, String.format("%08d", i)));
//        }
//        documento.add(table);
//        PdfContentByte cb = writer.getDirectContent();
//        Image img = createBarcode(cb, "This is a 2D barcode", 1, 1,writer);
//        documento.add(new Paragraph(String.format("This barcode measures %s by %s user units", img.getScaledWidth(), img.getScaledHeight())));
//        documento.add(img);
//        img = createBarcode(cb, "This is NOT a raster image", 3, 3,writer);
//        documento.add(new Paragraph(String.format("This barcode measures %s by %s user units", img.getScaledWidth(), img.getScaledHeight())));
//        documento.add(img);
//        img = createBarcode(cb, "This is vector data drawn on a PDF page", 1, 3);
//        documento.add(new Paragraph(String.format("This barcode measures %s by %s user units", img.getScaledWidth(), img.getScaledHeight())));
//        documento.add(img);
        String code = "675-FH-A12";

//        PdfContentByte cb = writer.getDirectContent();
        PdfPTable table = new PdfPTable(1);
//        table.addCell("Change baseline:");
        Barcode128 code128 = new Barcode128();
        code128.setBaseline(-1);
        code128.setSize(30);
        code128.setCode(code);
//        code128.setCodeType(Barcode128.CODE128);
        Image code128Image = code128.createImageWithBarcode(cb, null, null);
        PdfPCell cell = new PdfPCell(code128Image);
        cell.setBorder(0);
//        table.addCell(cell);

//        table.addCell("Add text and bar code separately:");
        cell.setBorder(0);
        code128 = new Barcode128();
        code128.setFont(null);
        code128.setCode("asdaffgfhf");
        code128.setCodeType(Barcode128.CODE128);
//        code128.setCodeType(Barcode.EAN13);
        code128.setSize(30);
        code128.setCode("Hola mundo");
        code128.setCode("19220903k");
        code128Image = code128.createImageWithBarcode(cb, null, null);
        code128Image.setBorder(2);
        cell = new PdfPCell();
        cell.addElement(new Phrase("PO #: " + code));
        cell.addElement(code128Image);
        cell.setBorder(0);
        table.addCell(cell);

//        document.add(code128Image);
        document.add(table);

        cb.endText();

        document.close();

    }

    public Image createBarcode(PdfContentByte cb, String text, float mh, float mw, PdfWriter writer) throws BadElementException {
        BarcodeEAN pf = new BarcodeEAN();
//        pf.setText("BarcodePDF417 barcode");
        pf.setCodeType(Barcode.EAN8);
        pf.setCode("19220903k");
        Rectangle size = pf.getBarcodeSize();
        PdfTemplate template = cb.createTemplate(mw * size.getWidth(), mh * size.getHeight());
//        pf.placeBarcode(template, BaseColor.BLACK, mh, mw);
        pf.createImageWithBarcode(writer.getDirectContent(), BaseColor.BLACK, BaseColor.GRAY);
        return Image.getInstance(template);
    }

    public static PdfPCell createBarcode(PdfWriter writer, String code) throws DocumentException, IOException {
        BarcodeEAN barcode = new BarcodeEAN();
        barcode.setCodeType(Barcode.EAN8);
        barcode.setCode("19220903k");
        PdfPCell cell = new PdfPCell(barcode.createImageWithBarcode(writer.getDirectContent(), BaseColor.BLACK, BaseColor.GRAY), true);
        cell.setPadding(10);
        return cell;
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
            throws ServletException, IOException, FileNotFoundException {
        try {
            processRequest(request, response);
        } catch (DocumentException ex) {
            Logger.getLogger(CuponServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            throws ServletException, IOException, FileNotFoundException {
        try {
            processRequest(request, response);
        } catch (DocumentException ex) {
            Logger.getLogger(CuponServlet.class.getName()).log(Level.SEVERE, null, ex);
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

}
