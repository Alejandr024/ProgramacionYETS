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
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduce un número entrero: ");       
        int number = sc.nextInt();
        int fact = 1;
        
        for (int i = 1; i <= number; i++) {
            fact *=i;
        }
        System.out.println("El factorial de " + number + " es " + fact);
        
    }//end main
}//end class
