/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba2;

import java.util.Scanner;

/**
 *
 * @author Alejandro Gómez
 */
public class ParyMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int numero = sc.nextInt();
//        int resto = 3 - numero%3;
        
        if ((numero%2==0) && (numero%3==0)){
            System.out.println("El número es par y múltiplo de 3");
        } else if ((numero%2==0) && (numero%3!=0)) {
            System.out.println("El número es par, pero no múltiplo de 3");
        } else if ((numero%2!=0) &&(numero%3==0)) {
            System.out.println("El número no es par, pero sí múltiplo de 3");
        } else {
            System.out.println("El número no es par ni múltiplo de 3");
        }
    }// End main
}// End class
