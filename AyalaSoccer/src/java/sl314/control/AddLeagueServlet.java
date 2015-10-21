/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl314.control;

import java.io.IOException;
import static java.lang.System.out;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sl314.model.League;

/**
 *
 * @author Livs
 */
public class AddLeagueServlet extends HttpServlet {

    List errorMsgs = new LinkedList();

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
        int year = 0;
        String yearStr = request.getParameter("year");
        try {
            
            year = Integer.parseInt(yearStr);
        } catch (NumberFormatException e) {
            errorMsgs.add("The year field must be a positive integer");
        }
        if (!errorMsgs.isEmpty()) {
            RequestDispatcher view =request.getRequestDispatcher("error_page.jsp");
            view.forward(request, response); 
           return;
        }
        String name = null;
        
            League league = new League(year, name);

       
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

//        int year;
//        String season, title;
//        try {
//            League liga = new League();
//            String yearStr = request.getParameter("year");
//            year = Integer.parseInt(yearStr);
//
//            season = request.getParameter("season");
//            title = request.getParameter("title");
//            //    League league = new League(year, season, title);
//        } catch (NumberFormatException nfe) {
//            errorMsgs.add("The year field must be a positive integer.");
//        } catch (NullPointerException e) {
//            errorMsgs.add("Please select a league season.");
//            errorMsgs.add("Please enter the title of the league.");
//        }
  

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
