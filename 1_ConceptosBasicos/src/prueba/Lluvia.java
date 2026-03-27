/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;
import java.util.Scanner;

/**
 *
 * @author Alejandro Gómez
 */
public class Lluvia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("¿Está lloviendo? ");
             boolean lluvia = entrada.nextBoolean();
        System.out.println("¿Terminaste tu tarea? ");
             boolean tarea = entrada.nextBoolean();
        System.out.println("¿Tienes que ir a la biblioteca? ");
             boolean biblio = entrada.nextBoolean();
        
        boolean calle = !lluvia && tarea || biblio;
        
        System.out.println("¿Puede o necesita salir a la calle? " + calle);
    }
    
}
