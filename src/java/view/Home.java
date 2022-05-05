package view;

import controller.ControladorDoctor;
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

public class Home extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        try {

            PrintWriter out = resp.getWriter();
            DatabaseConnection db = new DatabaseConnection();
            Connection con = db.getConnection();

            doctors = ControladorDoctor.getInstance(con).getDoctors();
            pacientes = ControladorPaciente.getInstance(con).getPacientes();

            boolean loginSuccessful = false;

            if (db.getConnection() != null) {

                if (!doctors.isEmpty()) {
                    for (Doctor d : doctors) {
                        if (d.getId().equals(req.getParameter("username"))) {
                            if (d.getPassword().equals(req.getParameter("password"))) {

                                out.print("<html><head><link rel=\"stylesheet\" href=\"Home.css\"></head>");

                                resp.sendRedirect("/Servlet-uno/HomeDoctor.jsp");

                                out.print("</html>");

                                //Usuario actual 
                                //User = new User<Doctor>();
                                loginSuccessful = true;
                            }
                        }
                    }

                }
                if (!pacientes.isEmpty()) {
                    for (Paciente p : pacientes) {
                        if (p.getId().equals(req.getParameter("username"))) {
                            if (p.getPassword().equals(req.getParameter("password"))) {

                                out.print("<html><head><link rel=\"stylesheet\" href=\"Home.css\"></head>");

                                resp.sendRedirect("/Servlet-uno/HomePatient.jsp");

                                out.print("</html>");

                                loginSuccessful = true;

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

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    ArrayList<Doctor> doctors;
    ArrayList<Paciente> pacientes;
}
