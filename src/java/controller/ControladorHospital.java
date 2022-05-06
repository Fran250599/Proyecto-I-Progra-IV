package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Administrador;
import model.Doctor;
import model.Hospital;
import model.Paciente;
import model.Usuario;

public class ControladorHospital {


    
    public void nuevoUsuario(Usuario usuario) {

        ArrayList<Usuario> usuarios = hospital.getUsuarios();

        if (usuarios.isEmpty()) {
            ControladorUsuario.getInstance(con).agregarUsuario(usuario);
            usuarios.add(usuario);
        } 

        if (usuario instanceof Doctor) {
            ControladorDoctor.getInstance(this.con).agregarDoctor((Doctor) usuario);
            hospital.getDoctores().add((Doctor) usuario);
        } else if (usuario instanceof Paciente) {
            ControladorPaciente.getInstance(this.con).agregarPaciente((Paciente) usuario);
            hospital.getPacientes().add((Paciente) usuario);
        }
    }

    public ArrayList<Doctor> getDoctores() throws SQLException {
        hospital.setDoctores(ControladorDoctor.getInstance(this.con).getDoctors());

        return ControladorDoctor.getInstance(this.con).getDoctors();
    }

    public ArrayList<Paciente> getPacientes() throws SQLException {
        return ControladorPaciente.getInstance(this.con).getPacientes();
    }

    public boolean setUsuarioActivo(Usuario usuario) throws SQLException {

         if (usuario instanceof Doctor) {
            ArrayList<Doctor> doctores = hospital.getDoctores();
            for (Doctor d : doctores) {
                String id1 = d.getId();
                String id2 = ((Doctor) usuario).getId();

                String password1 = d.getPassword();
                String password2 = ((Doctor) usuario).getPassword();
                if (id1.equals(id2)) {
                    if (password1.equals(password2)) {
                        this.usuarioActivo = d;
                        return true;
                    }
                }
            }
        } else if (usuario instanceof Paciente) {
            ArrayList<Paciente> pacientes = hospital.getPacientes();
            for (Paciente p : pacientes) {
                String id1 = p.getId();
                String id2 = ((Paciente) usuario).getId();

                String password1 = p.getPassword();
                String password2 = ((Paciente) usuario).getPassword();

                if (id1.equals(id2)) {
                    if (password1.equals(password2)) {
                        this.usuarioActivo = p;
                        return true;
                    }
                }
            }
        } else if (usuario instanceof Administrador) {
        }else{
            this.usuarioActivo = null;
        }
        return false;
    }

    public Usuario getUsuarioActivo() {

        return this.usuarioActivo;
    }

    

    public Hospital getHospital() {
        return hospital;
    }



    public void init(Connection con) throws SQLException{
        this.hospital = new Hospital(con);
        this.con = con;
    }

    
    public static ControladorHospital getInstance(Connection con) throws SQLException {
        if (instance == null) {
            
            
            return instance = new ControladorHospital();
            
        } else {
            return instance;
        }
    }
    
    private Connection con;
    private Hospital hospital;
    private Usuario usuarioActivo;
    private static ControladorHospital instance;

}
