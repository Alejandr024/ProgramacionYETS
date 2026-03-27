package ejemploFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P10_EscribirTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter("Ficheros/QuijoteWrite.txt", true));

            String cadena = "En un lugar de la Mancha";

            for (int i = 0; i < cadena.length(); i++) {
                out.write(cadena.charAt(i));
            }
            out.newLine();
            cadena = "de cuyo nombre no quiero acordarme.";
            out.write(cadena);
        } catch (IOException ex) {
            System.out.println("Error al escribir el codigo: " + ex.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                    System.out.println("El fichero se ha creado correctamente.");
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

    }//end main

}//end class
