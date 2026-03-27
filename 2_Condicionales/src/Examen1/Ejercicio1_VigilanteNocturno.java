package Examen1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alejandro Miguel Gómez González
 */
public class Ejercicio1_VigilanteNocturno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la hora actual (solo el valor entre 0-23): "
                + "");//Le pedimos al usuario que introdzca una hora entre 0 y 
            //23.

        int hour = entrada.nextInt();//Le damos la oportunidad a que diga la hora.
        
        System.out.println("Su hora es: " + hour);//comprobamos que está bien 
        //introducido.
        
        if(hour>=24){//Si la hora es menos de 24 horas, saltará un error, el cual 
            //indica que puso la hora mal.
            System.out.println("Error. El valor debe estar entre 0 y 23.");
        }
        
        switch(hour){//Anazilar los posibles escenarios por medio de un switch, 
            //haciendolo más cómodo y visible.
            case 7, 8, 9, 10, 11 -> System.out.println("Buenos días.");
            case 12, 13, 14, 15, 16, 17, 18, 19, 20-> System.out.println("Buenas tardes.");
            case 21, 22, 23, 1, 2, 3, 4, 5, 6  -> System.out.println("Buenas noches.");
            case 0 -> System.out.println("Buenas noches, bienvenido a un nuevo día.");
        }
    }//end main
}//end class
