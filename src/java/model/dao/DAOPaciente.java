package model.dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Paciente;

public class DAOPaciente {
  
    
    public static void addPatient(Connection con, String id, String name, String password) {
        try {
            PreparedStatement stmt = con.prepareStatement("INSERT INTO proyecto.patients VALUES ('" +id +"','" + name +"','" + password + "');");
            int status = stmt.executeUpdate();
            if (status != 0) {
                System.out.println("Successfully added");
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    
    
    public static ArrayList<Paciente> getPacientes(Connection con) throws SQLException{
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM proyecto.patients");
        
        
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        while(result.next()){
            String id = result.getString(1);
            String name = result.getString(2);
            String password = result.getString(3);
        
            Paciente p = new Paciente(id, name, password);
            
            pacientes.add(p);
        }
        
        
        return pacientes;
        
    }


   
}
