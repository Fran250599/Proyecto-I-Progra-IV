package view;

import controller.ControladorHospital;
import controller.DatabaseConnection;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Login extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        System.out.println("this is a get method");
        PrintWriter out = resp.getWriter();
        
            DatabaseConnection db = new DatabaseConnection();
            Connection con = db.getConnection();
            
        try {
            ControladorHospital.getInstance(con).setUsuarioActivo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        out.print("<html><head><link rel=\"stylesheet\" href=\"SignIn.css\"></head>");
        
        resp.sendRedirect("/Servlet-uno/index.jsp");
        
        out.print("</html>");
      
    }
    
}
