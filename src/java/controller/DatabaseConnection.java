/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author XPC
 */
public class DatabaseConnection {
    
    public DatabaseConnection(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();

            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
            
            createTables();
     
        }catch(ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException | SQLException ex){
            System.out.print("Unable to connect");
        }
    }
    private void createTables() {
        createDoctorsTable();
        createPatientsTable();
    }
    
    private void createDoctorsTable(){
        try {           
            
            PreparedStatement stmtDoctors;
            
            stmtDoctors = con.prepareStatement(
                     "CREATE TABLE proyecto.doctors (" +
"                       id varchar(45) NOT NULL," +
"                       name varchar(45)," +
"                       password varchar(45)," +
"                       PRIMARY KEY (id)" +
");         ");
            stmtDoctors.executeUpdate();
        
        } catch (SQLException ex) {
            System.out.print("Unable to connect");
            System.out.println("SQLException: " + ex.getMessage());
        }
        
    }
    private void createPatientsTable(){
        try {                      

            PreparedStatement stmtPatients;

            stmtPatients = con.prepareStatement(
                    "CREATE TABLE proyecto.patients("
                            + "id VARCHAR(45) NOT NULL, "
                            + "name varchar (45), "
                            + "password VARCHAR(45),"
                            +"PRIMARY KEY (id)" +");");
            stmtPatients.executeUpdate();

        } catch (SQLException ex) {
            System.out.print("Unable to connect");
            System.out.println("SQLException: " + ex.getMessage());
        }
        
    }
    
    
    public Connection getConnection(){
        return con;
    }
    
    private Connection con;
    
}
