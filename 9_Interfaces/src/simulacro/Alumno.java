package simulacro;


public class Alumno {

    private  String nombre;
    private  String apellido;
      String instituto;
    protected String ciclo;
    protected double distancia;

    public Alumno(String nombre, String apellido, String instituto, String ciclo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.instituto = instituto;
        this.ciclo = ciclo;
        distancia = 0.;
    }
    
    
    public String toString(){
        return String.format("Alumno: %s, %s; Instituto: %s; Ciclo: %s", getNombre(), getApellido(), instituto, ciclo);
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

    
    
    
}//end class