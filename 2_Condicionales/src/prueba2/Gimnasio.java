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
public class Gimnasio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su edad de entre 15-50 años: ");
        int age = sc.nextInt();
        
        if(age<15){
            System.out.println("Este gimnasio no permite a personas menores de "
                    + "15 años.");
        }else {
          System.out.print("¿Usted sufre de alguna lesión?: (indíquelo en true o "
                + "false): ");
        }        
        boolean lesion = sc.nextBoolean();
        
        if((15<=age && age<25) && lesion==true){
            System.out.println("Su tarifa es de 18 euros, pues incluye una "
                    + "asisencia guiada en los ejercicios por su lesión.");
        } else if( (15<=age && age<=25) && lesion==false){
            System.out.println("Su tarifa es de 15 euros.");
        }
        
        if((25<=age && age<50) && lesion==true){
            System.out.println("Su tarifa es de 33 euros, pues incluye una "
                    + "asisencia guiada en los ejercicios por su lesión.");
        } else if((25<=age && age<50) && lesion==false){
            System.out.println("Su tarifa es de 30 euros.");
        }
        
        if(age>=50 && lesion==true){
            System.out.println("Su tarifa es de 30 euros, pues incluye una "
                    + "asisencia guiada en los ejercicios por su lesión.");
        } else if( age>=50 && lesion==false){
            System.out.println("Su tarifa es de 27 euros.");
        }
    }
}