package ejemploFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P_10_03BufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///       FileReader in = null;//nombre fichero a leer
        Scanner sc= new Scanner(System.in);
        
        BufferedReader inBuffer = null;

        /*ejemplo de pedida de fichero al cliente
        System.out.print("Introduce el nombre del fichero a leer:");
        //se puede poner la direccion del fichero. Por otro lado, hay que poner de forma correcta el nombre del fichero con o sin la direccion.
        String fichero= sc.nextLine();
        */
        
        String texto = "";
        try {
            //fichero.txt debe estar en la carpeta del pryecto (si no poner ruta completa)

            //in = new FileReader("HolaMundo.txt"); evito instanciar un objeto extra
            inBuffer = new BufferedReader(new FileReader("Holamundo.txt"/*ficherp*/));
            String linea = inBuffer.readLine();
            while (linea != null) {
                texto += linea + "\n";
                linea = inBuffer.readLine();
            }
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
        System.out.println(texto);

    }//end main

}//end class
