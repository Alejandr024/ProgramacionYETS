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
public class NUmeromaximo {

    static int maximo(int n1, int n2){
        int maximo = 0;
        
        if(n1==n2){
            System.out.println("Ambos son iguales");
        }else{
            maximo = n1 > n2 ? n1 : n2;
        }
        
        return maximo;
    }//enda maximo
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: ");
        int n1 = sc.nextInt();
        
        System.out.print("Ingrese otro numero entero: ");
        int n2 = sc.nextInt();
        
        int resultado = maximo(n1,n2); 
        System.out.println(resultado);
    }//end main
}//end class