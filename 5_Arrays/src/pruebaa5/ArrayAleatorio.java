/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;

import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Daw1
 */
public class ArrayAleatorio {

    public static void main(String[] args) {
        Random rm = new Random();
        int[] arrayRandom= new int [10];
        int suma = 0;
        for (int i = 0; i<arrayRandom.length; i++){
            arrayRandom[i]= rm.nextInt(1,100);
            suma+=arrayRandom[i];
        }
           
            System.out.println("Array formado por números aleatorios: " +
                    Arrays.toString(arrayRandom));
            
            System.out.println("Suma de todos los números del array: " + suma);
        }//end main
}//end class
