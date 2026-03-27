package ficheros_Objetos;

/**
 *
 * @author Daw1
 */
public class Contacto {
    private String name;
    private String lastName;
    private String telefono= "No definido";
    private String dni;
    int edad;
    
    
    public Contacto(String name, String lastName, String dni, String telefono, int edad){
        this.name= name;
        this.lastName= lastName;
        this.telefono= telefono;
        this.dni= dni;
        this.edad= edad;
    }
    
    public Contacto(String name, String lastName, String dni, int edad){
        this.name= name;
        this.lastName= lastName;
        this.telefono= "No definido";
        this.dni= dni;
        this.edad= edad;
    }
    
    public String toString(){
        String resultado="ID: " + getName() + " " + getLastName() + ".\nDNI: " + dni + ".\nTelefono: " + getTelefono() + "\nEdad: " + edad+ ".\n";
        
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
    
}//end class