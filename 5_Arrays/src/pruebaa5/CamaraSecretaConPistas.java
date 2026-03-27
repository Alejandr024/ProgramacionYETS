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
public class CamaraSecretaConPistas {

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
        
        for(int i=0; i<combinacion.length; i++){
            System.out.println("Ingrese un numero de la posicion " + (i+1) + " que espera para la combinacion cuya longitud es de " + 
                    combinacion.length + "(Solo tiene los digitos 1,2,3,4 y 5).");
            
            password[i]= sc.nextInt();
        
            while(password[i]!=combinacion[i]){
                
                if(password[i]<=combinacion[i]){
                    System.out.println("Tu numero es menor al de la combinacion, por favor vuelva a intentarlo para hallarlo.");
                    password[i]= sc.nextInt();
                }else if(password[i]>=combinacion[i]){
                System.out.println("Tu numero es mayor al de la combinacion, por favor vuelva a intentarlo para hallarlo.");
                password[i]= sc.nextInt();
                }
                }if(password[i]==combinacion[i]){
                System.out.println("Tu numero es correcto al de la combinacion, puede continuar.");
            }
        }
        
        System.out.println("La combinacion es: " + Arrays.toString(combinacion));
        
        
        return combinacion;
    }//end combinacion
    
}//end class