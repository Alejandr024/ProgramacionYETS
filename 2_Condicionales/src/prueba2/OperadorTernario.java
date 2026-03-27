/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba2;

import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int number = sc.nextInt();
        
        String respuesta = (number%5==0)? " es mútiplo de 5.":" no es mútliplo de 5.";
        System.out.println("El número " + number + respuesta);
    }
}
