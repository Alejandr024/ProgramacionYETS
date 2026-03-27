package ejemploFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P_10_05NumerosRealesLinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=0;
        double suma = 0;
        BufferedReader inBuffer = null;

        try {
            inBuffer = new BufferedReader(new FileReader("NumerosRealesLinea.txt"));
            String linea = inBuffer.readLine();
            String[] subcadenas = linea.split("\n");
            while(linea!=null){
                contador++;
                System.out.println(linea);
                suma+=Double.valueOf(linea);
                linea = inBuffer.readLine();
            }
            System.out.println("Suma total: " + suma + ".");
            System.out.println("Media: " + suma/contador);
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
