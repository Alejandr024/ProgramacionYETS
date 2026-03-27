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
public class SobrecargaFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
        System.out.print("Ingrese un numero entero: ");
        int n1 = sc.nextInt();
        
        System.out.print("Ingrese otro numero entero: ");
        int n2 = sc.nextInt();
        
        System.out.print("Ingrese un numero real: ");
        double number_real = sc.nextDouble();
        
        
        System.out.print("Ingrese otro numero real: ");
        double number_real2 = sc.nextDouble();

        sc.nextLine(); // Limpiar el buffer
        
        System.out.print("Ingrese una palabra: ");
        String word = sc.nextLine();
        
        System.out.print("Ingrese otra palabra: ");
        String word2 = sc.nextLine();
        
        
        sumar(n1,n2);
        
        sumar(number_real,number_real2);
        
        sumar(word,word2);
        
        sc.close();
    }//end main
    
    
    static int sumar(int n1, int n2){
        int resultado = n1+n2;
        
        System.out.println("El resultado de " + n1 + " + " + n2 + " es: " + resultado);
        
        return resultado;
    }//end sumar
    
    static double sumar(double n1, double n2){
        double resultado = n1+n2;
        
        System.out.println("El resultado de " + n1 + " + " + n2 + " es: " + resultado);
        
        return resultado;
    }//end sumar


    static String sumar(String n1, String n2){
        String resultado = n1+ " " + n2;
        
        System.out.println("El resultado de " + n1 + " + " + n2 + " es: " + resultado);
        
        return resultado;
    }//end sumar    
    
}//end class
