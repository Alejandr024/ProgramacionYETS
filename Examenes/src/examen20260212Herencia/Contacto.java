package examen20260212Herencia;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private int telefono;

    public Contacto(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
  
    public boolean equal(Contacto c){
        boolean igual=false;
        
        if(getNombre().equals(c.getNombre()) && getApellido().equals(c.getApellido()) && getTelefono()==c.getTelefono()){
            igual=true;
        }
        
        return igual;
    }

    @Override
    public String toString() {
        return String.format("%-10s \t%-10s \t%-10d\n", getNombre(), getApellido(), getTelefono());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
}//end class