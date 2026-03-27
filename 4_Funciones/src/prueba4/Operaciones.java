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
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero real: ");
        double number = sc.nextDouble();
        
        System.out.println("¿Cuantas veces quiere repetir la operacion?");
        int repeat = sc.nextInt();
        
        System.out.println("""
                           Que operacion quieres?
                           1: Sumar
                           2: Restar
                           3: Multiplicacion
                           4: Division""");
        
        int respuesta= sc.nextInt();
        
        
        
        switch(respuesta){
            case 1->sumar(number, repeat);
            
            case 2->restar(number, repeat);
            
            case 3->multiplicacion(number, repeat);
            
            case 4->division(number, repeat);
            
            default->System.out.println("Opcion incorrecta, vuelva a "
                    + "intentarlo mas tarde.");
        }
        
        sc.close();
    }//end main
    
    
    
    static double sumar(double number, int repeat){
        double resultado= number;
        
        for(int i=1; i<=repeat; i++){
            resultado += 5; 
            System.out.println("Paso " + i + ": " + resultado);
        }
        
        System.out.print("El resultado de " + number + " + 5 repetido " + repeat
        + " veces es " + resultado);
        return resultado;
    }//end sumar
    
    
    static double restar(double number, int repeat){
        double resultado= number;
        
        for(int i=1; i<=repeat; i++){
            resultado -= 5; 
            System.out.println("Paso " + i + ": " + resultado);
        }
        System.out.print("El resultado de " + number + " - 5 repetido " + repeat
        + " veces es " + resultado);
        return resultado;
    }//end restar
        
        
        
    static double multiplicacion(double number, int repeat){
        double resultado= number;
        
        for(int i=1; i<=repeat; i++){
            resultado *= 5; 
            System.out.println("Paso " + i + ": " + resultado);
        }
        System.out.print("El resultado de " + number + " x 5 repetido " + repeat
        + " veces es " + resultado);
        return resultado;
    }//end multiplicacion
    
    
    
      static double division(double number, int repeat){
        double resultado= number;
        
        for(int i=1; i<=repeat; i++){
            resultado /= 5; 
            System.out.println("Paso " + i + ": " + resultado);
        }
        System.out.print("El resultado de " + number + " entre 5 repetido " + repeat
        + " veces es " + resultado);
        return resultado;
    }//end division
}//end class