package copiaTexto;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P_10_08_CopiaFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del fichero a copiar.");
        String original = sc.nextLine();
        String copy = "copia_de_" + original;

        /* * USO DE TRY-WITH-RESOURCES:
         * Declaramos los objetos 'in' y 'out' dentro del paréntesis del try. 
         * Al hacerlo así, Java garantiza que ambos se cerrarán automáticamente 
         * al finalizar el bloque, eliminando la necesidad de un bloque 'finally' 
         * y llamadas manuales a .close().
         */
        try (
                BufferedReader in = new BufferedReader(new FileReader(original)); BufferedWriter out = new BufferedWriter(new FileWriter(copy));) {
            String linea;

            linea = in.readLine();

            while (linea != null) {
                out.write(linea);

                System.out.println("Copiando " + linea);

                linea = in.readLine();
                if (linea != null) {
                    out.newLine();
                }
            }
            System.out.println("\nFchero duplicado con exito como: " + copy);
        } catch (IOException ex) {
            System.out.println("Error durante la copia: " + ex.getMessage());
        }

    }//end main

}//end class
