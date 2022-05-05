package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Doctor;
import model.dao.DAODoctor;

public class ControladorDoctor {
    
    public ControladorDoctor(Connection con){
        this.con = con;
    }
    
    
    public void agregarDoctor(Doctor d){
        DAODoctor.addDoctor(con, d.getId(), d.getName(), d.getPassword());
    }
    
    
    public static ControladorDoctor getInstance(Connection con){  
        
        if(instance == null){
            return new ControladorDoctor(con);
        }       
        return instance;
    }
    
    public ArrayList<Doctor> getDoctors() throws SQLException {
        return DAODoctor.getDoctors(con);
    }
    
    private final Connection con;
    private static ControladorDoctor instance;
}
