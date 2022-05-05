package model;

public class Usuario<T>{

    public Usuario(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    protected String id;
    protected String name;
    protected String password;

}
