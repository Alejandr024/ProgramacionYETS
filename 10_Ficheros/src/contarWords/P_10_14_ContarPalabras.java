package contarWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P_10_14_ContarPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contadorPalabra = 0;
        int contadorChar = 0;//No cuentan los espacios como caracter
        int contadorLinea = 0;

        // Try-with-resources para asegurar el cierre automático del archivo
        try (BufferedReader in = new BufferedReader(new FileReader("contarPalabras.txt"))) {
            String linea = in.readLine();
            while (linea != null) {
                contadorLinea++;
                Scanner s = new Scanner(linea);
                while (s.hasNext()) {//verifica si tiene un elemento igueinte disponible para leer o recorrer
                    contadorPalabra++;
                    String palabra = s.next();
                    contadorChar += palabra.length();
                }
                linea = in.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        System.out.println("Numero de lineas: " + contadorLinea);
        System.out.println("Numero de caracteres: " + contadorChar);
        System.out.println("Numero de palabras: " + contadorPalabra);

    }//end main

}//end class
