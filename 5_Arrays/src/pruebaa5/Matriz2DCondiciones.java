/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alej3
 */
public class Matriz2DCondiciones {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int tabla[][] = {
            {2, 4, 6, 8},
            {5, 10, 15, 20},
            {3, 9, 12, 18},
            {7, 2, 14, 21}
        };
        
        
        System.out.println(Arrays.deepToString(filtrarMatriz(tabla)));
        
    }//end main
    
    static int [][] filtrarMatriz(int[][] array){
        int [][] resultado= new int[array.length][array.length];
        

        for(int i=0; i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
            resultado[i][j]=array[i][j];     
            }
            }


        for(int i=0; i<resultado.length;i++){
            for(int j=0;j<resultado[i].length;j++){
                
                if(resultado[i][j]%2==0){
                resultado[i][j]=-1;
            }
            }
        }
        
        
        return resultado;
    }
    
    
    
}//end class