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
public class NumeroCasiCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un número decimal, para saber es casi-cero: ");
        double number = sc.nextDouble();
        
        if (-1<number && 1>number && number!=0) {
            System.out.println("El número es un casi cero.");
        } else if (number==0) {
            System.out.println("El número no es un casi cero, pues es 0.");
        } else {
            System.out.println("El número no es un casi cero.");
        }
        
        
    }// End Main
}// End Clas
