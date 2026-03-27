
package prueba6;
import java.util.Arrays;
/**
 *
 * @author Daw1
 */
public class Split {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String text= "En un lugar de la mancha cuyo nombre no quiero acordarme, Hoy es jueves, Mañana es viernes, pasado sabado";
        
        String[] palabras= text.split(", ");
        
        System.out.println(Arrays.toString(palabras));
    }//end main
}//end class