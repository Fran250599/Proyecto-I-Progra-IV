/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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


public class CitaServlet extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        System.out.println("this is a get method");
        PrintWriter out = response.getWriter();
        

   
        DatabaseConnection db = new  DatabaseConnection();
        Connection con = db.getConnection();
        
        try {
            ArrayList<Doctor> doctors = ControladorHospital.getInstance(con).getDoctores();
            ArrayList<String> names = new ArrayList<>();
            
            for(Doctor d : doctors){
                
                names.add(d.getName());
            }

            request.setAttribute("doctorsNames", names);
            getServletConfig().getServletContext().getRequestDispatcher("/NuevaCita.jsp").forward(request,response);

            
        } catch (SQLException ex) {
            Logger.getLogger(CitaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        

           /*out.print("<html><head><link rel=\"stylesheet\" href=\"SignIn.css\"></head>");
        
        response.sendRedirect("/Servlet-uno/NuevaCita.jsp");
        
        out.print("</html>");*/   
        
        
        
    }
    
    
    public ArrayList<String> printSelect(HttpServletResponse response) throws IOException{
        PrintWriter out = response.getWriter();
        
        
        ArrayList<String> list = new ArrayList();
        
        list.add("ola");
        list.add("buenas noches");
        list.add("sus caras");
        
        
        
        /*<label>Tipo de usuario:</label>
                        <select  name="typeOfUser">
                            <option value="Doctor">Doctor</option>
                            <option value="Paciente">Paciente</option>
                            
                        </select>*/
        
        
        for(String s : list){
            out.print("<option value=='"+s + "'");
            
            
        }
        return list;
    }
}