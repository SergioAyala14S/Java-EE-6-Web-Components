/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl314.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import sl314.model.League;

/**
 * Web application lifecycle listener.
 *
 * @author ayala-14s
 */
public class SoccerApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //System.out.println("---->Se inicia Soccer Web App");
//        String leagueName=sce.getServletContext().getInitParameter("currentLeagueName");
//        String yearLeague=sce.getServletContext().getInitParameter("currentYear");
//        
//        int year=Integer.parseInt(yearLeague);
//        League currentLeague=new League(year, leagueName);
//        sce.getServletContext().setAttribute("currentLeague", currentLeague);
        
        String leageName= sce.getServletContext().getInitParameter("currentLeagueName");
       String yearLeage= sce.getServletContext().getInitParameter("currentYear");
       int year=Integer.parseInt(yearLeage);
       League currentLeague=new League(year, leageName);
       sce.getServletContext().setAttribute("currentLeague",currentLeague);
        
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //System.out.println("----->Se cierra Soccer Web App");
        
        
    }
}
