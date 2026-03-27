
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class A5_09_NotasConcurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota = 0;
        int[] participantes = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la nota del concursante " + (i+1) + ": ");
            participantes[i] = teclado.nextInt();
        }
        
        do {
             
             System.out.print("Introduce la nota del concursante: ");
             nota = teclado.nextInt();
             if (nota >= 0) { 
                 participantes = Arrays.copyOf(participantes, participantes.length+1);
                 participantes[participantes.length-1] = nota;
             }
        
        } while(nota >= 0);
        
        System.out.println("Notas participantes: " + Arrays.toString(participantes));
        
        
    }
    
}
