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
public class numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero por pantalla: ");
        int number= sc.nextInt();
        System.out.println(number);
        
        
        if(0<=number){
            boolean espositiva= true;
            
            System.out.println("¿El número es positivo? " + espositiva);
        } else{
            boolean espositiva= false;
            
            System.out.println("¿El número es positivo? " + espositiva);
        }
        
        System.out.print("Introduzca otro número entero por pantalla: ");
        int number2= sc.nextInt();
        System.out.println(number2);
        
        
        if(number2%2==0){
            boolean espar= true;
            System.out.println("¿El número es par? " + espar);
        } else{
            boolean espar= false;
            System.out.println("¿El número es par? " + espar);
        }
        
        boolean condicion;
        
        if(number<0 && number2%2==0) condicion= true;
        else condicion = false;
        System.out.println("Primer valor negativo y 2º par: " + condicion);
        
        if(number>0 && number2%3==0) condicion= true;
        else condicion = false;
        System.out.println("Primer valor positivo y 2º impar: " + condicion);
                
    }//end main
}//end class