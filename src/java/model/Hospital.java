package model;

import java.util.ArrayList;


public class Hospital {

    public Hospital(){
        this.doctores = new ArrayList();
        this.pacientes = new ArrayList();
        this.administradores = new ArrayList();
        this.usuarios = new ArrayList();
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

    private ArrayList<Usuario> usuarios;
    private ArrayList<Doctor> doctores;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Administrador> administradores;
    
}
