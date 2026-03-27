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
public class NumeroNatural {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número natural: ");
        
        int numberMax = sc.nextInt();
        
        int contador = 0;
         while (contador<numberMax){
           System.out.print(contador + ", ");
           contador++;
           if(contador==numberMax){
               System.out.print(contador +".\n");
           }
        }
    }//end main
}//end class
