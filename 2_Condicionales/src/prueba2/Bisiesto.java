
package prueba2;
import java.util.Scanner;
/**
 *
 * @author jvega
 */
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int anio = scanner.nextInt();
        boolean bisiesto = false;

        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    bisiesto = true;
                } 
            } else {
               bisiesto = true;
            }
        } 
        System.out.println("¿El año " + anio + " es bisiesto? " + bisiesto); 
    }
    
}
