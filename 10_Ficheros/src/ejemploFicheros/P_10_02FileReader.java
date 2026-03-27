package ejemploFicheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P_10_02FileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader in = null;//nombre fichero a leer

        String texto = "";
        try {
            in = new FileReader("HolaMundo.txt");
            int c = in.read();
            while (c != -1) {
                texto += (char) c;
                c = in.read();
            }

        } catch (IOException ex) {
            System.out.println("Excepcion: " + ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);

    }//end main

}//end class
