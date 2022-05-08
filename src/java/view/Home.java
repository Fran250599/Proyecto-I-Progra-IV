package view;

import controller.ControladorDoctor;
import controller.ControladorHospital;
import controller.ControladorPaciente;
import controller.DatabaseConnection;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doctor;
import model.Paciente;
import model.Usuario;

public class Home extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        try {

            PrintWriter out = resp.getWriter();
            DatabaseConnection db = new DatabaseConnection();
            Connection con = db.getConnection();
            
            ControladorHospital controlador = ControladorHospital.getInstance(con);
            ControladorHospital.getInstance(con).init(con);
            

            ArrayList<Doctor> doctors = controlador.getDoctores();
            ArrayList<Paciente> pacientes = controlador.getPacientes();
            
            boolean loginSuccessful = false;
            if(ControladorHospital.getInstance(con).getUsuarioActivo() != null){ 
                loginSuccessful = true;
                
                Usuario usuarioActivo = ControladorHospital.getInstance(con).getUsuarioActivo();
                
                if(usuarioActivo instanceof Doctor){
                    out.print("<html><head><link rel=\"stylesheet\" href=\"Home.css\"></head>");

                    resp.sendRedirect("/Servlet-uno/HomeDoctor.jsp");

                    out.print("</html>");
                }else{
                    out.print("<html><head><link rel=\"stylesheet\" href=\"Home.css\"></head>");

                                resp.sendRedirect("/Servlet-uno/HomePatient.jsp");

                                out.print("</html>");
                }
            }else{

            if (db.getConnection() != null) {

                if (!doctors.isEmpty()) {
                    for (Doctor d : doctors) {
                        if (d.getId().equals(req.getParameter("username"))) {
                            if (d.getPassword().equals(req.getParameter("password"))) {

                                out.print("<html><head><link rel=\"stylesheet\" href=\"Home.css\"></head>");

                                resp.sendRedirect("/Servlet-uno/HomeDoctor.jsp");

                                out.print("</html>");

                                loginSuccessful = true;
                                
                                Usuario doctor = d;
                                ControladorHospital.getInstance(con).setUsuarioActivo(doctor);
                                return;
                            }
                        }
                    }

                }
                if (!pacientes.isEmpty()) {
                    for (Paciente p : pacientes) {
                        String username = req.getParameter("username");
                        String password = req.getParameter("password");
                        
                        
                        if (p.getId().equals(username)) {
                            if (p.getPassword().equals(password)) {

                                out.print("<html><head><link rel=\"stylesheet\" href=\"Home.css\"></head>");

                                resp.sendRedirect("/Servlet-uno/HomePatient.jsp");

                                out.print("</html>");

                                loginSuccessful = true;
                                
                                Paciente paciente = p;
                                paciente.setId(username);
                                paciente.setPassword(password);
                                
                                ControladorHospital.getInstance(con).setUsuarioActivo(paciente);
                                return;
                            }
                        }
                    }
                }

                if (loginSuccessful == false) {
                    out.print("<html><head><link rel=\"stylesheet\" href=\"SignIn.css\"></head>");
                    resp.sendRedirect("/Servlet-uno/index.jsp");
                    out.print("</html>");
                }
                
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
