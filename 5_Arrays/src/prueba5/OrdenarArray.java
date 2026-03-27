
package arrays;

import  java.util.Arrays;
/**
 * Ordenar un array en orden creciente de valores (del mas chico al más grande)
 * @author jvega
 */
public class OrdenarArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] matriz = {3,-5, 17, 0, 16 ,-23, 17};  
        //System.out.println("Referencia matriz: " + matriz);
        ordenar(matriz);
        System.out.println("Matriz ordenada de forma creciente: " + Arrays.toString(matriz));
        
        int[] matriz2 = {1,-5, 1, 0, 15 ,-3, 15,2,3,4,5,6};
        ordenar(matriz2);
        System.out.println("Matriz ordenada de forma creciente: " + Arrays.toString(matriz2));
        
        
        
        
    } // end Main
    
    static void ordenar (int[] array) {
       //System.out.println("Referencia array: " + array);
        int min;
        for (int i = 0; i < array.length; i++) {
            // La j me indica que cada vez voy ordenando los elementos que mequedan
            //del array, la posición "i" me indica a partir de que indice están ordenados
            for (int j = i; j < array.length; j++) {
                min = array[i];
                if (min > array[j]) {
                    array[i] = array[j];
                    array[j] = min;
                    min = array[i];
                }
            }
        }
        
    }
    
} // end Class
