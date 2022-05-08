
import controller.ControladorHospital;
import controller.DatabaseConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cita;
import model.Doctor;


public class CitasActivas extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        System.out.println("this is a get method");
        PrintWriter out = resp.getWriter();
        
            DatabaseConnection db = new DatabaseConnection();
            Connection con = db.getConnection();
            
        try {
            ControladorHospital.getInstance(con).setUsuarioActivo(null);
        } catch (SQLException ex) {
            Logger.getLogger(CitasActivas.class.getName()).log(Level.SEVERE, null, ex);
        }

        out.print("<html><head><link rel=\"stylesheet\" href=\"SignIn.css\"></head>");
        
        resp.sendRedirect("/Servlet-uno/index.jsp");
        
        out.print("</html>");
      
    }
    
}