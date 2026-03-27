package prueba;

import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Absoluto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número real: ");
        float numero = entrada.nextFloat();
        
        float absoluto = Math.abs(numero);
        
        System.out.println("El valor absoluto de su número es: " + absoluto);
    }
    
}
