package ejemploFicheros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class FormatoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Integer n = leerEntero();

        System.out.println("Entero leido es: " + n + ".");
    }//end main

    static Integer leerEntero() {
        // revisar, bucle infinito si lo declaro  Scanner sc= new Scanner(System.in);
        Integer resultado = -1;
        while (true) {

            try {
                System.out.print("Introduce un entero: ");
                resultado = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
                System.out.println("El numero introducido no es un entero.");
            }
        }
        return resultado;

    }//end leerEntero

}//end class
