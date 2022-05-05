package view;

import controller.ControladorDoctor;
import controller.DatabaseConnection;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doctor;

public class HomeDoctor extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter();

        out.print("<html><head><link rel=\"stylesheet\" href=\"Home.css\"></head>");

        resp.sendRedirect("/Servlet-uno/HomeDoctor.jsp");

        out.print("</html>");


        DatabaseConnection db = new DatabaseConnection();

        if(db.getConnection() != null){
            
            ControladorDoctor.getInstance(db.getConnection()).agregarDoctor(new Doctor("soy"," un", "doctor"));
            
            
                ControladorDoctor.getInstance(db.getConnection()).getDoctors();
            
            
        }
    }

    
    
}