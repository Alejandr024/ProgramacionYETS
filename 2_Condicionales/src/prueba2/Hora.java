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
public class Hora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora (mayor o igual que 0 y menor que 24): ");
        int hour = sc.nextInt();
        System.out.println("Introduce los minutos (mayor o igual que 0 y menor que 60): ");
        int minutes = sc.nextInt();
        System.out.println("Introduce los segundos (mayor o igual que 0 y menor que 60): ");
        int seconds = sc.nextInt();
        
        seconds++;
        
        if (seconds > 59) {
            seconds = 00;
            minutes++;
            
            if(minutes>59){
               minutes =00;
               hour++;
               
            if (hour>23){
                hour=0;
            }
            }
        }   
        System.out.println("La hora un segundo después es: " + hour + " horas " + 
                minutes + " minutos " + seconds + " segundos."); 
    }//End main
}// End class
