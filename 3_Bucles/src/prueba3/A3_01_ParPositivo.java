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
public class A3_01_ParPositivo {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        int number;
        
        
        do {
            System.out.println("Ingrese un número: ");
               
        number = sc.nextInt();
            if(number%2==0){
                System.out.print("El número es par.");
            }
            if(number > 0){
                System.out.println("El número es positivo.");
            }
            System.out.println(" Su cuadrado es: " + Math.pow(number, 2) + ".");  
        }while(number != 0);
    }//end main
}//end class
