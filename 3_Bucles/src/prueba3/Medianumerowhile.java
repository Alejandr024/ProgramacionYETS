/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;

import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class Medianumerowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduce 10 números, para luego mostrar la media: ");   
         int number = 0;
         int suma = 0;
         int contador_number = 0;
         
        
         while(contador_number<10){
             number= sc.nextInt();
             suma+=number;
             
             contador_number++;
            }
         
         float media= (float) suma/contador_number;
         
         System.out.println("La media de los 10 número es de: " + media + ".");
    }//end main
}//end class
