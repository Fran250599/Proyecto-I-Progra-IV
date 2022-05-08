
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
import model.Cita;
import model.Doctor;
import model.Paciente;


public class CitaServlet2 extends HttpServlet {
        @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        System.out.println("this is a get method");
        PrintWriter out = resp.getWriter();
        
            DatabaseConnection db = new DatabaseConnection();
            Connection con = db.getConnection();
            
            
            try {
                ArrayList<Doctor> doctors = ControladorHospital.getInstance(con).getDoctores();
                Paciente paciente = (Paciente) ControladorHospital.getInstance(con).getUsuarioActivo();
                
                String nombreDoctor = req.getParameter("doctorName");
                
                for(Doctor d : doctors){
                    
                    if(d.getName().equals(nombreDoctor)){
                        
                        Cita cita = new Cita();
                        cita.setDoctorID(d.getName());
                        cita.setPacienteID(paciente.getId());
                        cita.setPacienteName(paciente.getName());
                        
                        d.getCitas().add(cita);
                        
                        
                        ArrayList<Cita> citas = d.getCitas();
                        for(Cita c : citas){
                            if(c.equals(cita)){
                                int idCita = citas.indexOf(c) + 1;
                                c.setId(idCita);
                            }
                        }
                        
                        System.out.print("Success");
                        
                        String localidad = d.getUbicacion();
                        String costo = d.getCostoConsulta();
                        
                        req.setAttribute("localidad", localidad);
                        req.setAttribute("costo", costo);
                        getServletConfig().getServletContext().getRequestDispatcher("/NuevaCita2.jsp").forward(req,resp);
                        return;
                  
                    }
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(CitaServlet2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
               
    }
}
