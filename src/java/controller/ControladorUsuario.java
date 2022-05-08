
package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;
import model.dao.DAOUsuario;


public class ControladorUsuario {
    
    private ControladorUsuario(Connection con){
        this.con = con;
    }
    
    
    public void agregarUsuario(Usuario d){
        DAOUsuario.addUsuario(con, d.getId(), d.getName(), d.getPassword());
    }
    
    
    public static ControladorUsuario getInstance(Connection con){  
        
        if(instance == null){
            return new ControladorUsuario(con);
        }       
        return instance;
    }
    
    public ArrayList<Usuario> getUsuarios() throws SQLException {
        return DAOUsuario.getUsuarios(con);
    }
    
    private final Connection con;
    private static ControladorUsuario instance;
}
