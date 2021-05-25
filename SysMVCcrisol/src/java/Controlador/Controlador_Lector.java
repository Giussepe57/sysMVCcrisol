/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Lector;
import Modelo.Modelo_Lector;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Documentos
 */
public class Controlador_Lector extends HttpServlet {

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
            out.println("<title>Servlet Controlador_Lector</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_Lector at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher vista = null;
        String opcion = request.getParameter("op");
        Modelo_Lector obj = new Modelo_Lector();
        switch(opcion){
            case "1":
                vista = request.getRequestDispatcher("Vista/Lector/Vista_Lector.jsp");
                break;
            case "2":
                vista = request.getRequestDispatcher("Vista/Lector/Vista_IngLector.jsp");
                break;
            case "3":
                int xid_lec = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("idLector", xid_lec);
                vista = request.getRequestDispatcher("Vista/Lector/Vista_EdiLector.jsp");
                break;
            
            case "Grabar":
                String xnom = request.getParameter("txtNom");
                String xape = request.getParameter("txtApe");
                String xdni = request.getParameter("txtDni");
                int xdis = Integer.parseInt(request.getParameter("txtIdDis"));
                String xfec = request.getParameter("txtFec");
                String xest = request.getParameter("txtEst");
                
                Lector obj_lec = new Lector();
                
                obj_lec.setNom(xnom);
                obj_lec.setApe(xape);
                obj_lec.setDni(xdni);
                obj_lec.setIdDis(xdis);
                obj_lec.setFec(xfec);
                obj_lec.setEst(xest);
                
                obj.IngresarLector(obj_lec);
                
                vista = request.getRequestDispatcher("Vista/Lector/Vista_Lector.jsp");
                break;
                
            case "4":
                int xid =Integer.parseInt(request.getParameter("id"));
                obj.EliminarLector(xid);
                vista = request.getRequestDispatcher("Vista/Lector/Vista_Lector.jsp");
                break;
        }
        vista.forward(request, response);
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
        /*RequestDispatcher vista = null;
        String opcion = request.getParameter("op");
        Modelo_Lector obj = new Modelo_Lector();
        switch(opcion){
            case "3":
                String xnom = request.getParameter("txtNom");
                String xape = request.getParameter("txtApe");
                String xdni = request.getParameter("txtDni");
                int xid = Integer.parseInt(request.getParameter("txtIdDis"));
                String xfec = request.getParameter("txtFec");
                String xest = request.getParameter("txtEst");
                
                Lector obj_lec = new Lector();
                
                obj_lec.setNom(xnom);
                obj_lec.setApe(xape);
                obj_lec.setDni(xdni);
                obj_lec.setIdDis(xid);
                obj_lec.setFec(xfec);
                obj_lec.setFec(xfec);
                obj.IngresarLector(obj_lec);
                
                vista = request.getRequestDispatcher("Vista/Lector/Vista_Lector.jsp");
                break;*/
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
