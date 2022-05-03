
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DAODoctor {

    public DAODoctor(Connection con) {
        loadDatabase(con);
    }
    
    public static Boolean loadDatabase(Connection con) {
        try {           
            PreparedStatement stmtDoctors;
            
            stmtDoctors = con.prepareStatement("CREATE TABLE proyecto.doctors(idDoctors VARCHAR(45), name varchar (45), password VARCHAR(45))");
            stmtDoctors.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.print("Unable to connect");
            System.out.println("SQLException: " + ex.getMessage());
            return false;
        }
    }
    
    public void addDoctor(Connection con, String id, String name, String password) {
        try {
            PreparedStatement stmt = con.prepareStatement("INSERT INTO proyecto.doctors VALUES ('" +id +"','" + name +"','" + password + "');");

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
    
    
    
    
    public static DAODoctor getInstance(Connection con) {
        if (instance == null) {
            return new DAODoctor(con);
        }
        return instance;
    }

    private static DAODoctor instance;
}
