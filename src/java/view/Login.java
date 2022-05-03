package view;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;



public class Login extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        System.out.println("this is a get method");
        PrintWriter out = resp.getWriter();
        
        out.print("<html><head><link rel=\"stylesheet\" href=\"SignIn.css\"></head>");
        
        resp.sendRedirect("/Servlet-uno/index.jsp");
        
        out.print("</html>");
      
    }
    
}
