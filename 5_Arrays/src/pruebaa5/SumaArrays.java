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
public class SumaArrays {

    /**Calcular dos array, teneindo en cuenta:
     * 
     * a(1,2,3,4,5)
     * b(5,4,3,2,1)
     * total=(6,6,6,6,6)
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] a = {1,2,3,4,5};
        int[]b= {5,4,3,2,1};
        
        int[]c=sumaArrays(a,b);
        
        System.out.println("Suma de vectores: " + Arrays.toString(c));
        
    }//end main


    static int [] sumaArrays(int[]a, int []b){

       int []c= new int[0];
       
       if(a.length==b.length){
           c= new int [a.length];
           for(int i=0; i<a.length;i++){
                c[i] = a[i]+b[i];  
           }
       }else{
           System.out.println("Operaciones incorrectas, diferenete dimensiones.");
       }
                
       return c;
    }//end suma
}//end class
