/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba2;

import java.util.Scanner;

/**
 *
 * @author alej3
 */
public class cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                         Saldo inicial: 1000 euros.
                         Opciones:
                         1: ingresar
                         2: retirar 
                         3: salir
                         """);
        
        double saldo = 1000;
        int answer = sc.nextInt();
        
        if (0>=answer || answer>3){
            System.out.println("Opción incorrecta, vuelva a intentarlo más "
                    + "tarde.");
        }
        
        if(answer==1){
            System.out.print("¿Cuanto quieres ingresar? (el mínimo de ingreso "
                    + "es de 0,1 euros.)");
            
            double ingres= sc.nextDouble();
            if (ingres<=0.09){
            System.out.print("El ingreso es a partir de 0,1 euros.");
        }else{
            double total= saldo+ ingres;
            System.out.print("Has inrgresado "+ ingres + " euros. El saldo "
                    + "total en el banco es de: " + total + " euros.");
            }  
        }
        
        if(answer==2){
            System.out.print("¿Cuanto quieres retirar? (el mínimo de retiro "
                    + "es de 0,1 euros, y no puedes retirar más de lo que "
                    + "tienes.");
            
            double retire= sc.nextDouble();
            if (retire<=0.09 || retire >=saldo){
            System.out.print("El retiro es a partir de 0,1 euros, y no puede "
                    + "pasarse más del saldo actual.");
        }else{
            double total2= saldo-retire;
            System.out.println("Has retirado " + retire + " euros. El saldo "
                    + "total en el banco es de: " + total2 + " euros.");
            } 
        }
        
        if(answer==3){
            System.out.println("¡Que tenga un buen día!");
        }
    }// end main
}//end calss