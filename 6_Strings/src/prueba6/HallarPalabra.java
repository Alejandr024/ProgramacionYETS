/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba6;
import java.util.Scanner;
import java.util.Arrays;

/**
 *Hallar las veces que sale una palabra en una frase
 * @author Daw1
 */
public class HallarPalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in,"windows-1252");
        
        System.out.print("Ingrese una frase: ");
        
        String frase= sc.nextLine();
        
        System.out.print("¿Qué palabra quieres saber la cantidad de veces aparece en la frase?: ");
        
        String word= sc.nextLine();
        

         
         int contador=0;
         
         
         int pos= frase.indexOf(word, 2);

         
         while(pos!=-1){
             contador++;
             pos= frase.indexOf(word, pos + 1);//esto haces que avance la posicion para que busque en toda la frase
         }
         
         

         
         
//         System.out.printf("La palabra \"%s\" está contenida en la frase \"%s\"? %s\n", word, frase, frase.contains(word));

         System.out.printf("La palabra \"%s\" aparece %d veces.\n", word, contador);
         
         
         String[] separaciones= frase.split(word);
         
         System.out.printf("La palabra \"%s\" aparece %d veces.\n", word, separaciones.length-1);
         
         
    }//end main
    
}//end class