
package model;


public class Doctor extends Usuario {

    public Doctor(String id, String name, String password) {
        
        super(id, name, password);
        this.id = id;
        this.password = password;
        this.name= name;
        
    }
    
    
    private String id;
    private String name;
    private String password;

}
