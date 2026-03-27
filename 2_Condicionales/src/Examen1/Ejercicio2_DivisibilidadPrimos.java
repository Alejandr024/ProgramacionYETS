/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen1;

import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gómez González
 */
public class Ejercicio2_DivisibilidadPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
       System.out.println("Introduce un número decimal: ");// Le pedimos al 
       //usuario que introzuca un valor decimal.
       
       float decimal_number = entrada.nextFloat();// Le damos la portunidad de
       //intoroducirlo.
       
       System.out.println("Su número decimal es: " + decimal_number);
       //comprobamos que esté correcto.

       
       int number = (int) decimal_number;//Truncamos el decimal.

       String primo= "";
       
        primo += (number%2==0)? " Es primo de 2.\n":"";
        //Analizamos si el numero truncado es divisible por 2 por medio de un 
        //operador ternario.
        primo += (number%3==0)? " Es primo de 3.\n":"";
        //Analizamos si el numero truncado es divisible por 3 por medio de un 
        //operador ternario.
        
        primo += (number%5==0)? " Es primo de 5.\n":"";
        //Analizamos si el numero truncado es divisible por 5 por medio de un 
        //operador ternario.
        
        primo += (number%7==0)? " Es primo de 7.\n":"";       
        //Analizamos si el numero truncado es divisible por 7 por medio de un 
        //operador ternario.
       
        
        boolean divisiblesTodos = (number%2==0 && number%3==0 && number%5==0 && number%7==0);
        
        if(divisiblesTodos){
            primo+=" Es un número especial.";
        } else if (number%2!=0 && number%3!=0 && number%5!=0 && number%7!=0){
            primo+=" Es candidato a primo.";
        }
           System.out.println(primo);
           //comprobamos si el numero es primo de todos.
    }//end main
}//end class
