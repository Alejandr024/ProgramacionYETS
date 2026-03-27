package prueba7;

/**
 *
 * @author Daw1
 */
public class Contacto {
    private String name;
    private String lastName;
    private String telefono= "No definido";
    private String email;
    boolean isBloqueado;
    
    
    public Contacto(String name, String lastName, String telefono, String email, boolean isBloqueado){
        this.name= name;
        this.lastName= lastName;
        this.telefono= telefono;
        this.email= email;
        this.isBloqueado= isBloqueado;
    }
    
    public Contacto(String name, String lastName, String email, boolean isBloqueado){
        this.name= name;
        this.lastName= lastName;
        this.telefono= "No definido";
        this.email= email;
        this.isBloqueado= isBloqueado;
    }
    
    public String toString(){
        String resultado="ID: " + getName() + " " + getLastName() + ".\nTelefono: " + getTelefono() + ".\nEmail: " + getEmail() + ".\nEsta bloqueado? " + isBloqueado + ".\n";
        
        return resultado;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    
    public boolean equal(Contacto c){
        boolean igual=false;
        
        if(name.equals(c.name) && lastName.equals(c.lastName)){
            igual=true;
        }
        
        return igual;
    }
    
    
    
}//end class