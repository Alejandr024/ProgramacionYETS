package prueba;

import java.util.Scanner;


/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia: ");
        float radio = entrada.nextFloat();
        float longi = (float) (2*Math.PI*radio);
        float area =  (float) (Math.PI*Math.pow(radio, 2));
        System.out.println("La longitud de la circunferencia es de " + longi + ". Además, su área es de " + area + ".");
   }
    
}