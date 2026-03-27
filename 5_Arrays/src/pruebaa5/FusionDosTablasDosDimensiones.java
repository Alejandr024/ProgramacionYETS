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
public class FusionDosTablasDosDimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] a= {{1,2,3,-3},{3,4,5,0},{-1,3,4,8}};
    
        int[][]b= {{6,7},{5,-2},{3,3}};
        
        int[][]c= fusion(a,b);
        System.out.println("Orden de los arrays de dos dimensiones por fila: \n" +
                Arrays.deepToString(c));
    }//end main
    
    static int[] fusion(int[]a, int[]b){
        
        int []c = new int [a.length+b.length];
        //copio los valores de a en c
        
        for(int i =0; i<a.length;i++){
            c[i]=a[i];
            for(int j =0; j<b.length;j++){
            c[j+a.length]= b[j];// empieza justo cuando en el principio del array de b
            }
        }
        
        
//        for (int i = 0; i < c.length; i++) {
//            for (int j = 0; j < c.length - i - 1; j++) {
//                if (c[j] > c[j + 1]) {
//                    int [c[j], c[j + 1]] = [c[j + 1], c[j]];
//                }
//            }
//        }

        Arrays.sort(c);
        return c;
    }//end fusion
    
    
    static int[][] fusion(int[][]a,int [][]b){
        int[][] c= new int [0][0];
        
        if(a.length==b.length){
            c= new int [a.length][a.length+b.length];
        }else{
            c= new int [a.length+b.length][a.length+b.length];
        }
        
        for(int i= 0; i<c.length;i++){
            c[i]=fusion(a[i], b[i]);
        }
        
        return c;
    }//end fusion
}//end class
