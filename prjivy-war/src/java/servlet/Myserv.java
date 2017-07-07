/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entities.Faculties;
import entities.Universities;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.FacultiesFacade;
import models.ProgramsFacade;
import models.UniversitiesFacade;

/**
 *
 * @author Gulshat
 */
public class Myserv extends HttpServlet {

    @EJB
    private ProgramsFacade programsFacade;

    @EJB
    private FacultiesFacade facultiesFacade;

    @EJB
    private UniversitiesFacade universitiesFacade;
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id");
        Universities uni= universitiesFacade.find(new Integer(id));
        String name = uni.getName();
        String descr = uni.getDescription();
        int numOfStudents = uni.getNumofstudents();
        int numOfInterStud = uni.getNumofinternationalstud();
        int stuff = uni.getStufftotal();
        int internStuff = uni.getStuffinternational();
        int age = uni.getAge();
        int size = uni.getSize();
        String status = uni.getStatus(); 
        List<Faculties>f=facultiesFacade.findAll();       
        
        
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("id", id);
        session.setAttribute("age", age);
        session.setAttribute("descr", descr);
        session.setAttribute("interStudNum", numOfInterStud );
        session.setAttribute("studNum", numOfStudents);
        session.setAttribute("size", size);
        session.setAttribute("staffNum", stuff);
        session.setAttribute("iStuff", internStuff);
        session.setAttribute("status", status);
        session.setAttribute("image", "images/"+id+".jpg");
        for(int i=0; i<8; i+=4){
        session.setAttribute("faculty"+i, f.get(i).getName());
        session.setAttribute("program"+i, programsFacade.find(new Integer(i+1)).getName());
 
        }
        response.sendRedirect("welcome.jsp");
        
        
       
        
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
