
package arrays;

import java.util.Arrays;

/**
 *
 * @author Administrador
 */
public class EliminarRepetidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {5,6,7,8};
        int [] c = {9,10,11,12};
        int[] d = {13,14,15,16};        
        int [][] e = {a,b,c,d}; 
        
        for (int i=0; i< e.length;i++) {
            //e[i] = Arrays.copyOf(e[i], e[i].length -i);
            for (int j = 0; j < i; j++  ) {
                e[i] = eliminarLast(e[i]);
            }
        }
               
        
//        
//        int[] aux = {1};
//        
//        e[0] = aux;
        
        System.out.println("array bidimensional:" + Arrays.deepToString(e));
    } // end Main
    
    // Elimina el último elemento de un vector
    static int[] eliminarLast (int[] matriz) {
        int [] matrizAux = new int[matriz.length -1];   
        for (int i =0; i <matrizAux.length; i++) {
            matrizAux[i] = matriz[i];
        }      
        return matrizAux;
    } 
    
    
    
} // end Class
