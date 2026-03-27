package ordenNatural;

/**
 *
 * @author Alejandro <alej3839@gmail.com>
 */
public class Alumno implements Comparable {
    private String nombre;
    private String apellido;
    private int edad;

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10s  %-10d", getNombre(), getApellido(), getEdad());
    }

    @Override
    public int compareTo(Object o) {
        Alumno auxAlumno=(Alumno)o;
        int resultado= (this.apellido.compareTo(auxAlumno.apellido));
        if(this.apellido.equals(auxAlumno.apellido)){
            return -(this.edad-auxAlumno.edad);
        }
        return resultado;
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