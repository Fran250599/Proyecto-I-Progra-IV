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
import model.Paciente;


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
            
            Paciente paciente = (Paciente) ControladorHospital.getInstance(con).getUsuarioActivo();

            request.setAttribute("pacient", paciente);
            request.setAttribute("doctorsNames", names);
            getServletConfig().getServletContext().getRequestDispatcher("/NuevaCita.jsp").forward(request,response);

            
        } catch (SQLException ex) {
            Logger.getLogger(CitaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    
}