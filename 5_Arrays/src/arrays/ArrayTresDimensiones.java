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
public class ArrayTresDimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][][] matriz3D={{{1,2},{3,4}},
                            {{5,6},{7,8}},
                            {{9,10},{11,12}}};
        
//        System.out.println(Arrays.deepToString(matriz3D));
        
       for(int i = 0; i<matriz3D.length; i++){
            for(int j =0; j<matriz3D[i].length;j++){
                for(int k=0; k<matriz3D[i][j].length;k++){
                System.out.print(matriz3D[i][j][k] + " ");    
                }
                System.out.println("");//diferenciar cada bloque
            }
            System.out.println("");
        }
        
    }//end main   
}//end class
