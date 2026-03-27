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
public class EliminarRepetidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {5,6,7,8};
        int [] c = {9,10,11,12};
        int [] d = {13,14,15,16};
        
        int[][] e= {a,b,c,d};
        
        for(int i=0; i<e.length;i++){
//            e[i]= Arrays.copyOf(e[i], e[i].length - i); se puede usar 
//            siempre y cuando  no lo pida
              for(int j =0; j<i;j++){//Crear otro bucle para eliminar las 
                  //columnas cuando incrementa
                  e[i]= eliminarLast(e[i]);//pasa la fila en concreto
              }
        }
        
        System.out.println(Arrays.deepToString(e));
    }//end main
    
    
    static int[]eliminarLast(int [] array){
        int [] arrayAux= new int [array.length-1];
        
        for(int i =0; i<arrayAux.length;i++){
            arrayAux[i]= array[i];
        }
        
       return arrayAux;
    }
    
    
}//end class