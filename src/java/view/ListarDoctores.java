
package view;

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
import model.Doctor;


public class ListarDoctores extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        System.out.println("this is a get method");
        PrintWriter out = resp.getWriter();
        
            DatabaseConnection db = new DatabaseConnection();
            Connection con = db.getConnection();
            
        try {
            ArrayList<Doctor> doctors = ControladorHospital.getInstance(con).getDoctores();
            
            ArrayList<Doctor> doctorsInfo = new ArrayList();
            
            for(Doctor d : doctors){
                
                if(!d.getEspecialidad().equals(" ")){
                    if(!d.getUbicacion().equals(" ")){
                        
                        
                        doctorsInfo.add(d);
                        
                    }
                }
                
            }
            
            
            req.setAttribute("doctorsInfo", doctorsInfo);
            getServletConfig().getServletContext().getRequestDispatcher("/Doctors.jsp").forward(req,resp);

            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

   
      
    }
    
}