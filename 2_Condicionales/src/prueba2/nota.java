/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba2;

import java.util.Scanner;

/**
 *
 * @author alej3
 */
public class nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrse una nota entre 0 y 10, ambos inclusive: ");
        double nota = sc.nextDouble();
        
     if( 0>nota || nota >10){
         System.out.println("Nota no válida");
     }
     
     
          
     switch((int) nota){
         case 0,1,2,3,4 -> System.out.println("Suspenso");
         case 5,6 -> System.out.println("Aprobado");
         case 7,8 -> System.out.println("Notable");
         case 9-> System.out.println("Sobresaliente");
         case 10->System.out.println("Matrícula de honor, felicidades!");
     }
     
     
    }//end main
}//end class
