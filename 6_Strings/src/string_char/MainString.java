/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_char;
import java.util.Scanner;
/**
 *
 * @author Daw1
 */
public class MainString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                       
        Scanner sc = new Scanner(System.in);
        
//        String frase= "Hola mundo";
//        
//        char[] arrayCaracteres= {'J','o','s','e'};
//        
//        System.out.println(arrayCaracteres);//detecta que es un String
//        
//        int age =20;
//        double altura=1.74;
//        
//        String cadena= new String(arrayCaracteres);
//        
//        System.out.println(cadena);
//        
//        
////        cadena= String.valueOf(age);
////        
////        System.out.println(cadena + altura);
//        
//        
//        String cadenaFormateada= String.format("%s tiene %d y mide %.2f metros.", cadena, age, altura);
//        
//        System.out.println(cadenaFormateada);


        String cadena1= "Pepe y Juan";
        String cadena2= "pepe";
        
//        boolean respuesta= cadena1.equalsIgnoreCase(cadena2);
//        dd
//        System.out.printf("La cadena: \"%s\" tiene %d elementos.\n", cadena1, cadena1.length());
        
        // Caracter en una posicion "i" de un String
        
        System.out.println(cadena1.charAt(4));
        
        sc.close();
    }
    
}
