/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba4;

/**
 *  Diseñar una función recursiva que calcule el enésimo término de la serie de
 * Fibonacci. En esta serie el enésimo valor se calcula sumando los dos valores
 * anteriores de la serie. Es decir: fibonacci(n) = fibonacci(n - 1) +
 * fibonacci(n - 2) fibonacci(O) = 1 fibonacci(l) = 1
 * @author Daw1
 */
public class A4_12_Fibonacci {
    
    public static void main(String[] args) {
        int number = 7;
        
        System.out.println(number);
        
        System.out.println("los coeficientes menores que "+ number + ": ");
        for(int i = 0; i<= number; i++){
            System.out.print(fibonacci(i) + " ");
        }
        
    }//end main
    
    
    static int fibonacci(int number){
        int valor = 0;
        
        if(number==0 || number == 1){
            return 1;
        }else{
            valor = fibonacci(number-1)+ fibonacci(number-2);
        }
        return valor;
    }//end fibonacci
}//end class