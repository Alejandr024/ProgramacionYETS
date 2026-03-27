package simulacro;

/**
 *
 * @author Alejandro <alej3839@gmail.com>
 */
public interface FCT extends Instituto{
    
    public final String region = "CANARIAS";
    
    void asignarEmpresa(AlumnoSegundo alumno, String empresa);
    
    String obtenerEmpresa(AlumnoSegundo alumno);
    
}//end interface