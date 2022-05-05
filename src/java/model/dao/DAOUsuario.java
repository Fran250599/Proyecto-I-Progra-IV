package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Usuario;

public class DAOUsuario {
  
    
    public static void addUsuario(Connection con, String id, String name, String password) {
        try {
            PreparedStatement stmt = con.prepareStatement("INSERT INTO proyecto.users VALUES ('" +id +"','" + name +"','" + password + "');");
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
    
    
    public static ArrayList<Usuario> getUsuarios(Connection con) throws SQLException{
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM proyecto.patients");
      
        
        ArrayList<Usuario> pacientes = new ArrayList<>();
        
        while(result.next()){
            
            String id = result.getString(1);
            String name = result.getString(2);
            String password = result.getString(3);
            
            Usuario u = new Usuario(id,name,password);
            
            pacientes.add(u);
        }
        
        
        return pacientes;
        
    }


   
}
