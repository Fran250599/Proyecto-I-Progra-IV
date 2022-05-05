package model.dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class DAOPaciente {

    public DAOPaciente(Connection con) {
        loadDatabase(con);
    }

    public static Boolean loadDatabase(Connection con) {
        try {
            PreparedStatement stmtPatients;

             stmtPatients = con.prepareStatement("CREATE TABLE proyecto.patients(idDoctors VARCHAR(45), name varchar (45), password VARCHAR(45))");
            stmtPatients.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.print("Unable to connect");
            System.out.println("SQLException: " + ex.getMessage());
            return false;
        }
    }

    
    
    public void addPatient(Connection con, String id, String name, String password) {
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

    public static DAOPaciente getInstance(Connection con) {
        if (instance == null) {
            return new DAOPaciente(con);
        }
        return instance;
    }

    private static DAOPaciente instance;

   
}