/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;
import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class OrdenarArrayDosDimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] array = {{3,1,2},{-1,0,1},{0,5,3}};
        
        
        for(int i=0; i<array.length;i++){
            ordenar(array[i]);
        }
        System.out.println(Arrays.deepToString(array)); 
        
        
        
    }//end main
    
    
    static void ordenar(int[] array){
        int min;

        for(int i = 0; i< array.length; i++){
            //La "j" me indica que cada vez voy ordenandor los elemento que me quedan del array, 
            //la posicion "i" me indica a partir de qué indice estan ordenados.
            for(int j = i; j< array.length; j++){
            min = array[i];
            if(min>array[j]){
                array[i]= array[j];
                array[j]= min;
                min= array[i];
                }
            }
        }
    }//end ordenar
    
    
}//end class