package ejemploAlumno;

/**
 *
 * @author Daw1
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1= new Persona("Jose", 123456789);
        
        Alumno alumno1= new Alumno("2ºBACH C", "Antonio",12345677);
        
        Repetidor repetidor1= new Repetidor(2, "2ºBACH A", "Piñero", 122222222);
        
        System.out.println(persona1);
        
        System.out.println(alumno1);

        System.out.println(repetidor1);
    }//end main
    
}//End class