
package model;


public class Doctor {

    public Doctor(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Doctor() {
        this.id = "";
        this.name ="";
        this.password= "";
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String id;
    private String name;
    private String password;
}