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

    public ControladorHospital(Connection con) {
        this.usuarioActivo = null;
        this.hospital = new Hospital();
        this.con = con;
    }

    public void nuevoUsuario(Usuario usuario) {

        ArrayList<Usuario> usuarios = hospital.getUsuarios();

        if (usuarios.isEmpty()) {
            ControladorUsuario.getInstance(con).agregarUsuario(usuario);
            usuarios.add(usuario);
        } else {
            for (Usuario u : usuarios) {

                if (u.getId() != usuario.getId()) {

                    ControladorUsuario.getInstance(con).agregarUsuario(usuario);
                    if (u.getName() != usuario.getName()) {
                        usuarios.add(usuario);
                    }
                }
            }
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
            ArrayList<Doctor> doctores = ControladorDoctor.getInstance(this.con).getDoctors();

            for (Doctor d : doctores) {
                String id1 = d.getId();
                String id2 = ((Doctor) usuario).getPassword();

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
            ArrayList<Paciente> pacientes = ControladorPaciente.getInstance(this.con).getPacientes();

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
        }
        return false;
    }

    public Usuario getUsuarioActivo() {

        return this.usuarioActivo;
    }

    public static ControladorHospital getInstance(Connection con) {
        if (instance != null) {
            return instance;
        } else {
            return new ControladorHospital(con);
        }
    }

    private final Connection con;
    private Hospital hospital;
    private Usuario usuarioActivo;
    private static ControladorHospital instance;

}
