/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Daw1
 */
public class ArrayDosDimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      int [][] pantalla= new int [](numero de filas) [](numero de columnas);
        
        int [][] matriz2D= {{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i=0; i<matriz2D.length;i++){
            System.out.println("Fila numero "+ i + ": "+ Arrays.toString(matriz2D[i]));
        }
        //si ponemos matriz2D[0], recorremos las columnas, si no ponemos nada, recorremos las filas.
        
        
        for(int i = 0; i<matriz2D.length; i++){
            for(int j =0; j<matriz2D[i].length;j++){
                System.out.print(matriz2D[i][j] + " ");
            }
            System.out.println("");
        }
            
        System.out.println(Arrays.deepToString(matriz2D));
        
        
    }//end main
}//end class