package view.registration;

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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doctor;
import model.Paciente;
import model.Usuario;

public class Registration extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            PrintWriter out = resp.getWriter();
            boolean validation = false;

            DatabaseConnection db = new DatabaseConnection();
            Connection con = db.getConnection();
            ControladorHospital.getInstance(con).init(con);
            
       

            if (ControladorHospital.getInstance(con).getUsuarioActivo() != null) {

                validation = true;
                
                Doctor d = (Doctor) ControladorHospital.getInstance(con).getUsuarioActivo();
                
                
                req.setAttribute("doctor", d);
                getServletConfig().getServletContext().getRequestDispatcher("/Profile.jsp").forward(req,resp);
              

            } else {

                String password = req.getParameter("password");
                String passwordConfirm = req.getParameter("passwordConfirm");

                if (password.equals(passwordConfirm) && !password.equals("")&& !req.getParameter("nombre").equals("") && !req.getParameter("id").equals("")) {
                    
                    String nombre = req.getParameter("nombre");
                    String id = req.getParameter("id");

                    String selection = req.getParameter("typeOfUser");

                    if ("Doctor".equals(selection)) {

                        Usuario doctor = new Doctor(id, nombre, password,"","","","","","");
                        ControladorHospital.getInstance(con).nuevoUsuario(doctor);

                        ControladorHospital.getInstance(con).setUsuarioActivo(doctor);

                        req.setAttribute("doctor", doctor);
                        getServletConfig().getServletContext().getRequestDispatcher("/Profile.jsp").forward(req,resp);

                        validation = true;
                    } else {
                        Usuario paciente = new Paciente(id, nombre, password);
                        ControladorHospital.getInstance(con).nuevoUsuario(paciente);

                        ControladorHospital.getInstance(con).setUsuarioActivo(paciente);

                        out.print("<html><head><link rel=\"stylesheet\" href=\"SignIn.css\"></head>");
                        resp.sendRedirect("/Servlet-uno/HomePatient.jsp");
                        out.print("</html>");

                        validation = true;
                    }

                }
                
            }

            if (validation == false) {
                out.print("<html><head><link rel=\"stylesheet\" href=\"SignIn.css\"></head>");

                resp.sendRedirect("/Servlet-uno/SignUp.jsp");

                out.print("</html>");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
