package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.dao.DAODoctor;
import model.dao.DAOPaciente;
import model.dao.DAOUsuario;


public final class Hospital {

    public Hospital(Connection con) throws SQLException{
        this.doctores = DAODoctor.getDoctors(con);
        this.pacientes = DAOPaciente.getPacientes(con);
        this.administradores = new ArrayList();
        this.usuarios = DAOUsuario.getUsuarios(con);
        this.usuarioActivo = null;
    }
    
    
    
    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    private Usuario usuarioActivo;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Doctor> doctores;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Administrador> administradores;
    
}
