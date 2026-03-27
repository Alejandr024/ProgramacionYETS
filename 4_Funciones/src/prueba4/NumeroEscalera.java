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
public class NumeroEscalera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: ");
        
        int number = sc.nextInt();
        
        escalera(number);
        
        sc.close();
    }//end main
    
    
    
    
    static void escalera(int number){
       
        for(int i = 1; i<=number; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }//end escalera
}//end class
