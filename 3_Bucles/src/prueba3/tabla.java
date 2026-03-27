/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;

import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class tabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //tabla de multiplicar de todo
        /*
        Le pedimos varias cosas al usuario: en primer lugar, se le pide desde 
        donde quiere que imprima la tabla y hasta donde.
        Por otro lado, le pedimos desde donde quiere que imprima el tamaño de la
        tabla y hasta donde.
        */
        System.out.println("¿Desde qué numero quieres que imprima la tabla de "
                + "multiplicar?");
        int inicio_i = sc.nextInt(); 
        
        System.out.println("¿Hasta qué numero quieres que imprima la tabla de "
                + "multiplicar?");
        int tabla_i= sc.nextInt();
        System.out.println("Imprimirá desde el " + inicio_i + " hasta el " + tabla_i);
        
        
        System.out.println("¿Desde qué numero quieres que imprima el tamaño de la"
                + "tabla de multiplicar?: ");
        int inicio_k = sc.nextInt();
        
        System.out.println("¿Qué tamaño quieres para la tabla (es decir, hasta "
                + "multiplicar por 20): ");
        
        int tamano_k= sc.nextInt();
        System.out.println("Imprimirá desde el "+ inicio_k + "hasta el " + tamano_k);
        
        for(int i = inicio_i; i<=tabla_i; i++){
              System.out.println("Tabla del " + i +":");
            for(int k = inicio_k; k<=tamano_k; k++){
                System.out.println( i + " * " + k +"= " + (i*k));
            }
          }
    }
    
}
