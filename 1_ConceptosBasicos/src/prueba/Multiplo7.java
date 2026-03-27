package prueba;

import java.util.Scanner;
/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Multiplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número entero ");
        int numero = entrada.nextInt();
        int resto = 7 - numero%7;
        int total = numero + resto;
        
        System.out.println("Su valor le falta " + resto + " para ser múltiplo de 7. Por tanto, se suman entre ellos y da " + total + ".");
    }  
}
