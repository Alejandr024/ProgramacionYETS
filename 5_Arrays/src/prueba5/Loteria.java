/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;


import java.util.Arrays;
/**
 *
 * @author jvega
 */
public class Loteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Combinación ganadora (Debo generarlo con un random)
       
       int[] ganadora = {1,5,8,9,17,49};
       
       // leo por teclado mi apuesta
       
       int [] miApuesta = {1,8,17,33,42,48};
       
       int[] aciertos = new int[0];

        for (int i = 0; i < miApuesta.length; i++) {
            if (search(ganadora, miApuesta[i])) {
                aciertos = add(aciertos, miApuesta[i]);
            }
             // 
// externalizo en método búsqueda
//            for (int j = 0; j < ganadora.length; j++) {
//                if (miApuesta[i] == ganadora[j]) {
//                    aciertos = add(aciertos, ganadora[j]);
//                }
//            }
        }
       System.out.println("Aciertos " + Arrays.toString(aciertos));
       
        
    } // end Main
    
     static int [] add (int [] array, int valor) {
        //Creo un array con un elemento más que el que sepasa por argumento
        int[] matrizaux = new int[array.length +1];
        // Copio todos los elementos de array en la nueva matriz matrizaux
        for (int i =0; i< array.length; i++) {
            matrizaux[i] = array[i];
        }
        // me queda libre la ultima posicion de matrizaux y la relleno con "valor"
        matrizaux[matrizaux.length-1] = valor;
        // Devuelvo un matriz con los mismo elementos que array + el elmento valor en la ultima posición
        return matrizaux;
    }
     
     
     // Metodo búsqueda: Busca si un valor está en una matriz
     static boolean search(int [] ganadora , int valor) {
         boolean acierto = false;
         for (int j = 0; j < ganadora.length; j++) {
              if (valor  == ganadora[j]) {
                    acierto = true;
                    break;
                }
            }
         return acierto;
     }
     
    
} // en Class
