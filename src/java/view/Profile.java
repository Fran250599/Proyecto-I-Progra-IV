package view;

import controller.ControladorDoctor;
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
import model.Doctor;



public class Profile extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        
        
        try {
            if(ControladorHospital.getInstance(con).getUsuarioActivo() != null){
                
                Doctor d = (Doctor) ControladorHospital.getInstance(con).getUsuarioActivo();
                
                String especialidad = req.getParameter("speciality");
                String costoConsulta = req.getParameter("cost");
                String ubicacion = req.getParameter("ubication");    
                String bio = req.getParameter("bio");

                String horario = "fsfee";
                String frecuencia = "afaw";
        
                
                d.setEspecialidad(especialidad);
                d.setCostoConsulta(costoConsulta);
                d.setUbicacion(ubicacion);
                d.setBio(bio);
                d.setHorario(horario);
                d.setFrecuencia(frecuencia);
                
                ControladorDoctor.getInstance(con).updateDoctor(d);
                
                PrintWriter out = resp.getWriter();
                
                out.print("<html><head><link rel=\"stylesheet\" href=\"SignIn.css\"></head>");
        
                resp.sendRedirect("/Servlet-uno/HomeDoctor.jsp");
        
                out.print("</html>");
                
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
