/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba4;

import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class NumeroExponencial {

    static int potencia( int base, int exp){
         int resultado = 1;
        
        for(int i = 1; i<=exp; i++){
            resultado*=base;
        }
        
        return resultado;
    }//end potencia
    
    
        static double potencia( double base, int exp){
         double resultado = 1;
        
        for(int i = 1; i<=exp; i++){
            resultado*=base;
        }
        
        return resultado;
    }//end potencia
    
        static double potencia( double base){
         return base*base;
    }//end potencia
    
        
        static int potencia( int base){
         return base*base;
    }//end potencia
    
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Indica la base: ");
        double base = sc.nextInt();
        
        System.out.println("¿Quieres indicar el exponencial");
        boolean indicar = sc.nextBoolean();
        
        if(indicar){
        System.out.print("Indica el exponencial: ");
        int exp = sc.nextInt();    
        System.out.println(base + " elevado a " + exp + " da " + potencia(base,exp) + ".");
        
        }else{
        int exp=2;
            System.out.println(base + " elevado a " + exp + " da " + potencia(base));
        }
        
        
        
    }//end main
}//end class
