package ejercicioChatiGpt;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private int edad;

    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %-12s\n Apellido: %-12s\n Edad: %-10d\n", getNombre(), getApellido(), getEdad());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

}//end class
