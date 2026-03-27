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
public class Examen_11_11_2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el numero para calcular multiplos de 5 menores que dicho numero: ");
    
        int number = sc.nextInt();
        
        
        multiplosIterativo(number);


    System.out.print("Multiplos de 5 menores que "+ number + " de forma recursiva: ");

    multiplosRecursivo(number);
    
    
    multiplosRecursivo(number, 5);

    
    }//end main
    
    
    //Funcion multiplos de 5 menores ue un numero n
    static void multiplosIterativo(int number){    
        System.out.println("Multiplos de 5 menores que "+ number + ": ");
        
        for(int i =1 ; i<number; i++){
            if(i%5==0){
                System.out.println(i + " ");
            }
        }
    }//end multiploIteraivo
    
    
        //Funcion recursiva multiplos de 5 menores ue un numero n
    static void multiplosRecursivo(int number){    
        
        if(number==0){
            System.out.println("");
        }else{
//            multiplosRecursivo(number-1); lo hace creciente.
            if(number%5==0){
            System.out.print(number + " ");
            }
            multiplosRecursivo(number-1);
        }
    }//end multiploRecursivo




    // FUncion recursivo con sobrecarga recursiva

    static void multiplosRecursivo(int number, int m){    
    if(number==0){
            System.out.println("");
        }else{
            if(number%m==0){
                System.out.print(number + " ");
            }
            multiplosRecursivo(number-1, m);
        }
    }
}//end class
