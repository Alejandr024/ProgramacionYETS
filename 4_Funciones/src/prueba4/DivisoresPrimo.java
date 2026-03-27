/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba4;

import java.util.Scanner;
import static prueba4.NumerosPrimos.esprimo;

/**
 *
 * @author Daw1
 */
public class DivisoresPrimo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero para comprobar si es primo: ");
        
        int number = sc.nextInt();
        
        System.out.println("¿El numero " + number + " es primo? " + primo(number));
        
        
    System.out.println("\nEl numero de divisores primos de " + number + " es: " + divisoresPrimos(number));
        
        
    }//end main
    
    static boolean primo(int number){
        boolean resultado = true;
        
        
        
        for(int i = 2; i<number; i++){
                if(number%i==0){
                resultado = false;
                break;
                }
            }
        
        return resultado;
    }//end primo
    
    static int divisoresPrimos(int number){
        int contadorPrimo =0;
        
        System.out.print("Divisores de " + number + ": ");
        for(int i = 2; i<number; i++){
            if(number%i==0){
                System.out.print(i +" ");
                if(primo(i)){
                    contadorPrimo++;
                }
            }
        }
        
       return contadorPrimo; 
    }//end DivisoresPrimos 
}//end class