/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;

import java.util.Scanner;

/**
 *HAce programa que imprima un triángulo de asteriodes de base inicial (ejj 
 * base=5)
 *          * * * * *
 *          * * * *
 *          * * *
 *          * *
 *          *
 * @author Alejandro Gómez
 */
public class BuclesAnidadosDependientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un nñumero entero y positivo: ");
        int n = sc.nextInt();
        
        for(int i= 1; i<=n; i++){
            for(int j= 1; j<=i; j++){
                 System.out.print("* ");
            for(int k=1; k<=j; k++){
                System.out.print(" ");  
            }
            }  
            System.out.println(" ");
        }     
    }//end main
}//end class
