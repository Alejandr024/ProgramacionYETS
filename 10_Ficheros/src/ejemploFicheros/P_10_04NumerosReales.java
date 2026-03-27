package ejemploFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P_10_04NumerosReales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        BufferedReader inBuffer = null;

        try {
            inBuffer = new BufferedReader(new FileReader("NumerosReales.txt"));
            String linea = inBuffer.readLine();
            String[] subcadenas = linea.split(":");
            System.out.println("Dimension del Array: " + subcadenas.length);
            for (int i = 0; i < subcadenas.length; i++) {
                System.out.print(subcadenas[i] + ": ");
                //convertir string a int
                media += Double.valueOf(subcadenas[i]);
            }
            media = media / subcadenas.length;
            System.out.println("\nMedia: " + media);
            //casos si el fichero no existe, esta corrupto, etc.
        } catch (IOException ex) {
            System.out.println("Excepcion: " + ex.getMessage());
        } finally {//accion que se hace al final
            if (inBuffer != null) {
                try {
                    inBuffer.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }//end main

}//end class
