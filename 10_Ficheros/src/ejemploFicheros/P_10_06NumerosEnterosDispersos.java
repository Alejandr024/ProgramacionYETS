package ejemploFicheros;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P_10_06NumerosEnterosDispersos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileInputStream flujo = null;

        int contador = 0;
        double suma = 0;

        try {
            flujo = new FileInputStream("NumerosRealesSinFormato.txt");
            Scanner sc = new Scanner(flujo);//simula una entrada el flujo
            while (sc.hasNext()) {
                int n = sc.nextInt();
                System.out.println(n + " ");
                suma += n;
                contador++;
            }

            System.out.printf("Media: %.2f\n", ((double) suma / contador));
        } catch (IOException ex) {//casos si el fichero no existe, esta corrupto, etc.
            System.out.println("Excepcion: " + ex.getMessage());
        }//No hay que poner el finally, si se pone, no imprime o no lee el while de abajo

    }//end main

}//end class
