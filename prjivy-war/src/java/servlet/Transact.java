/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entities.Applications;
import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;
import models.ApplicationsFacade;

/**
 *
 * @author Gulshat
 */
public class Transact extends HttpServlet {

    @EJB
    private ApplicationsFacade applicationsFacade;

    
     @Resource
    UserTransaction transaction;
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Transact</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Transact at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String fn = request.getParameter("fn");
      String ln = request.getParameter("ln");
      String uni = request.getParameter("uni");
      String program = request.getParameter("prog");
      String email = request.getParameter("email");
      String num = request.getParameter("num");
      
      try {
                transaction.begin();
                Applications appl = new Applications();
                appl.setFname(fn);
                appl.setLname(ln);
                appl.setUni(uni);
                appl.setEmail(email);
                appl.setProg(program);
                appl.setNum(num);
                applicationsFacade.create(appl);
                transaction.commit();
                response.sendRedirect("index.html");
            } catch (Exception e) {
                try {
                   
                    this.transaction.rollback();
                     response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Transact</title>");            
            out.println("</head>");
            out.println("<body>");out.println("<script>");
                    out.println("alert('Wrong data!')");
                    out.println("</script>");
            out.println("</body>");
            out.println("</html>");
       
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/application.html");
                    rd.include(request, response);
                } catch (Exception ex) {
                }
                System.out.println(e.getMessage());
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
