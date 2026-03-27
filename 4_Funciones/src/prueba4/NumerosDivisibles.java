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
public class NumerosDivisibles {

    static boolean divisible(int n1, int n2){
        
        boolean valor= false;
        
        int maximo = n1>n2? n1:n2;
        int minimo = n1<n2? n1:n2;
        
            if(n1%n2==0){
            valor = true;    
        }
        
        System.out.print("¿" + maximo + " es divible por " + minimo + "? ");
        return valor;
        
    }//end divisible
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: ");
        int n1 = sc.nextInt();
        
        
        System.out.print("Ingrese otro numero entero: ");
        int n2 = sc.nextInt();
        
        System.out.println(divisible(n1,n2));
    }//end main    
}//end clas
