package com.login;


import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Home extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        
        PrintWriter out = resp.getWriter();
        
        out.print("<html><head><link rel=\"stylesheet\" href=\"Home.css\"></head>");
        
        resp.sendRedirect("/Servlet-uno/HomeDoctor.html");
        
        out.print("</html>");
      
        
    }
    
}
