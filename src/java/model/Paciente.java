
package model;


public class Paciente extends Usuario
{

    public Paciente(String id, String name, String password) {
        super(id, name, password);
        this.id = id;
        this.name = name;
        this.password = password;
    }

}
