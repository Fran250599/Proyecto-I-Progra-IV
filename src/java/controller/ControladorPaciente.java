/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Paciente;
import model.dao.DAOPaciente;


public class ControladorPaciente {
    public ControladorPaciente(Connection con){
        this.con = con;
    }
    
    
    public void agregarPaciente(Paciente d){
        DAOPaciente.addPatient(con, d.getId(), d.getName(), d.getPassword());
    }
    
    
    public static ControladorPaciente getInstance(Connection con){  
        
        if(instance == null){
            return new ControladorPaciente(con);
        }       
        return instance;
    }
    
    public ArrayList<Paciente> getPacientes() throws SQLException {
        return DAOPaciente.getPacientes(con);
    }
    
    
    
    private Connection con;
    private static ControladorPaciente instance;
}
