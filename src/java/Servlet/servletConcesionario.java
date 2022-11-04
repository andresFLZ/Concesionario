/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Auto;
import Logica.Sucursal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
public class servletConcesionario extends HttpServlet {
    
    static Sucursal s;
    static ArrayList <Auto> autosD = new ArrayList();
    
    public static void liskov(int autosDisponibles, Sucursal sucursal){
        autosD = sucursal.generarAutosDisponibles(autosDisponibles);
        s = sucursal;
    }

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
        
        Sucursal sucursal = Sucursal.getInstance();
        int autosDisponibles = ThreadLocalRandom.current().nextInt(1, 15);
        liskov(autosDisponibles, sucursal);
        sucursal.setNombre(request.getParameter("concesionario"));
        Iterator it = autosD.iterator();
        int i=0;
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link id=\"style\" href=\"css/estilosConcesionario.css\" "
                    + "rel=\"stylesheet\" type='text/css'>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; "
                    + "charset=UTF-8\">");
            out.println("<title>Concesionario</title>");            
            out.println("</head>");
            out.println("<body class=\"body\">");
            out.println("<div class=\"divs\">");
            out.println("<p class=\"p\">"+s.getNombre()+"</p>");
            out.println("En este concesionario hay "+s.getAutosDisponibles()+" autos "
                    + "disponibles");
            out.println("<br><br>");
            out.println("<table border=\"1\" style=\"margin: 0 auto;\">");
            out.println("<tr>");
            out.println("<td colspan=\"5\"><b class=\"azul\">Autos disponibles"
                    + "</b></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><b>Vehículo</b></td>");
            out.println("<td><b>Gama</b></td>");
            out.println("<td><b>Cantidad</b></td>");
            out.println("<td><b>precio</b></td>");
            out.println("<td><b>Color</b></td>");
            out.println("</tr>");
            while(it.hasNext()){
                out.println("<tr>");
                out.println("<td>"+autosD.get(i).getNombre()+"</td>");
                out.println("<td>"+autosD.get(i).getGama()+"</td>");
                out.println("<td>"+autosD.get(i).getCantidad()+"</td>");
                out.println("<td>"+autosD.get(i).getPrecio()+"</td>");
                out.println("<td>"+autosD.get(i).getColor()+"</td>");
                out.println("</tr>");
                i++;
            }
            out.println("<br><br>");
            out.println("<br><br>");
            out.println("</table>");
            out.println("</div>");
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

}
