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
public class PedirFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día (entre 1 y 31): ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el mes (entre 1 y 12): ");
        int mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();
        
         int diaDelMes;
        
         diaDelMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };
        
        if(diaDelMes == 0){
            System.out.println("Fecha incorrecta, en concreto el mes.");
        } else if (dia>=1 && dia<=diaDelMes){
            System.out.println("La fecha es: " + dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("Fecha incorrecta, en concreto el día.");
       } 
    }// End main
}// End class
