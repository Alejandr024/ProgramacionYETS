/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba4;

import java.util.Scanner;

/**
 *
 * @author alej3
 */
public class A4_10_PotenciaRealYEnteraRecursiva {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exp= 0;
        
        
        System.out.print("Introduce la base: ");  
        double base = sc.nextDouble();
          
        do{
            System.out.print("Introduce el exponente: ");  
            exp = sc.nextInt();
        }while (exp < 0);
           
           
           System.out.println("Potencia interativa: " + potenciaInterativa(base,exp));
           
         
           System.out.println("Potencia recursiva: " + potenciaRecursiva(base,exp));
    }//end main
    
    static double potenciaInterativa(double base, int exp){
        double resultado = 1;
        
        for ( int i = 1; i<= exp; i++){
            resultado*=base;
        }
        
        return resultado;
    }//end potenciaInterativa
     
    static double potenciaRecursiva(double base, int exp){
        double resultado;
        
        
        if(exp==0){
            return 1;
        }else if (exp==1){
            return base;
        }else{
           return resultado = base * potenciaRecursiva(base, exp -1); 
        }
    }//end potenciaRecursiva
}//end class
