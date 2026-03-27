/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class MayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca su edad en años: ");
        int edad = entrada.nextInt();
        boolean adulto = (edad-18) >=0;
        System.out.println("¿Es mayor de edad? " + adulto);
    }
    
}
