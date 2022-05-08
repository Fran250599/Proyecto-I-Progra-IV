
package view;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class CitaAgendada extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        PrintWriter out = resp.getWriter();

        out.print("<html><head><link rel=\"stylesheet\" href=\"SignIn.css\"></head>");
        
        resp.sendRedirect("/Servlet-uno/CitaAgendada.jsp");
        
        out.print("</html>");
      
    }
    
}