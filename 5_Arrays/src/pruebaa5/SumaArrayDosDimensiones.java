/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class SumaArrayDosDimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] []a = {{1,2,3},{4,5,6}};
        int[][] b= {{6,5,4},{3,2,1}};
        
        int[][]c=new int [2][3];
        
        for(int i=0; i<a.length;i++){
            c[i]=sumaArrays(a[i],b[i]);
        }
        
        System.out.println("Suma de vectores: " + Arrays.deepToString(c));
        
    }//end main
/*
    int[][]a=new int [2][8][3];
    a[1][7].length=3;->vector de dimension 3 
    a[0].length=8;->array de dimension 8
    a.lengtg=2-> filas del array
    */

    static int [] sumaArrays(int[]a, int []b){

       int []c= new int[0];
       
       if(a.length==b.length){
           c= new int [a.length];
           for(int i=0; i<a.length;i++){
              c[i]= a[i]+b[i];
           }
       }else{
           System.out.println("Operaciones incorrectas, diferenete dimensiones.");
       }
                
       return c;
    }//end suma
}//end class