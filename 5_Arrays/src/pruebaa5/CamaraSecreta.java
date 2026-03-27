/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class CamaraSecreta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Ingrese la longitud de la combinacion: ");
        
        int n= sc.nextInt();
        
        int [] resultado= combinacion(n);
        
        System.out.println(resultado);
    }//end main
    
    static  int [] combinacion(int n){
        Scanner sc= new Scanner(System.in);
        
        int [] password= new int[n];
        
        int[] combinacion= new int[n];
        
        for(int i =0; i<combinacion.length; i++){
            combinacion[i]= (int) ((Math.random()*5) +1);
        }
        int contador=0;
        
        
        for(int i=0; i<combinacion.length; i++){
            System.out.println("Ingrese un numero de la posicion " + (i+1) + "que espera para la combinacion cuya longitud es de " + 
                combinacion.length);

            password[i]= sc.nextInt();
        
            if(password[i]==combinacion[i]){
                contador++;
            }
        }
        
        
        
        if(contador==1){
            System.out.println("Has acertado "+ contador +" numero de los " + n +" posibles.");
        } else if(contador==combinacion.length){
            System.out.println("Has acertado todos los numeros posibles. Felicidades!");
        }else{
            System.out.println("Has acertado "+ contador +" numeros de los " + n + " posibles.");
        }
        
        System.out.println("La combinacion es: " + Arrays.toString(combinacion));
        
        return combinacion;
    }
    
    
}//end class