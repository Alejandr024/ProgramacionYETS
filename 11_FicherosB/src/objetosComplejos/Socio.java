package objetosComplejos;

import java.io.Serializable;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Socio implements Serializable{
    String dni;
    String nombre;

    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Socio{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
    
    
    
}//end class