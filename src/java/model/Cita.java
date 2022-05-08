package model;

import java.util.ArrayList;

public class Cita {

    public String getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(String DoctorID) {
        this.DoctorID = DoctorID;
    }

    public String getPacienteName() {
        return pacienteName;
    }

    public void setPacienteName(String pacienteName) {
        this.pacienteName = pacienteName;
    }

    public String getPacienteID() {
        return pacienteID;
    }

    public void setPacienteID(String pacienteID) {
        this.pacienteID = pacienteID;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    
    
    //Llave primaria
    int id;
    //llave foranea
    String DoctorID;
    
    String pacienteName;
    String pacienteID;
    
    String fecha;
    String hora;
    boolean estado; //False es pendiente - True Cita lista
}
