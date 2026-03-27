/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class Recursividad {

    /**
     * Factorial recursivo
     */
    public static void main(String[] args) {
       
        
        System.out.println("El facotrial de 5 es " + factorialR(5));
        
        
    }//end main
   
    
    static int factorialR(int number){
        int resultado = 1;
        if (number==1){
            resultado = 1;
        }else{
           resultado = number*factorialR(number-1); //formula factorial
        }
        
        
        return resultado;
    }
    
    
}//end class
