package escribeTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P_10_09_EscribirTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Grabador de Archivos de texto ---");
        System.out.println("Escribe el contenido que quieras guardar. (Escribe la palabra \"fin\" para dejar de escribir y guardar lo escrito.)");
        
        
        try (BufferedWriter out = new BufferedWriter(new FileWriter("Salida.txt", true));){
            System.out.print("> ");
            String words= sc.nextLine();
            // Bucle centinela: se repite hasta que la línea sea exactamente "fin"
            while(!words.equalsIgnoreCase("fin")){
            out.write(words);
            out.newLine();
            System.out.print("> ");
            words=sc.nextLine();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        System.out.println("Fichero \"Salida.txt\" guardado correctamente.");

    }//end main

}//end class
