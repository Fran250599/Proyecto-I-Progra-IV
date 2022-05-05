package view;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;



public class ShowProfile extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        PrintWriter out = resp.getWriter();
        
        out.print("<html><head><link rel=\"stylesheet\" href=\"Profile.css\"></head>");
        
        resp.sendRedirect("/Servlet-uno/Profile.jsp");
        
        out.print("</html>");
      
    }
    
}
