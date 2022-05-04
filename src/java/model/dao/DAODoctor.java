
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Doctor;


public class DAODoctor {

  
    
    
    
    public static void addDoctor(Connection con, String id, String name, String password) {
        try {
            PreparedStatement stmt = con.prepareStatement("INSERT INTO proyecto.doctors (cedula, name, password) VALUES ('" +id +"','" + name +"','" + password + "');");

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
    
    public static ArrayList<Doctor> getDoctors(Connection con) throws SQLException{
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM proyecto.doctors");
        Doctor d = new Doctor();
        
        ArrayList<Doctor> doctors = new ArrayList<>();
        
        while(result.next()){
            
            d.setId(result.getString(2));
            d.setName(result.getString(3));
            d.setPassword(result.getString(4));
            
            doctors.add(d);
        }
        
        
        return doctors;
        
    }
    
    
    
}



    

   