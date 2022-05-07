
package model;



public class Doctor extends Usuario {

    public Doctor(String id, String name, String password) {
        
        super(id, name, password);
        this.id = id;
        this.password = password;
        this.name= name;
        
    }

    public Doctor(String name, String id, String password, String espcialidad, String costoConsulta, String ubicacion, String horario, String frecuencia, String bio) {
        super(id, name, password);
        this.name = name;
        this.id = id;
        this.password = password;
        this.especialidad = espcialidad;
        this.costoConsulta = costoConsulta;
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.frecuencia = frecuencia;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspcialidad(String espcialidad) {
        this.especialidad = espcialidad;
    }

    public String getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(String costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    String name;
    String id;
    String password;
    
    
    //Extra
    String especialidad;
    String costoConsulta;
    String ubicacion;
    String horario;
    String frecuencia;
    String bio;



}
