/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;
import java.util.Arrays;


/**
 *
 * @author alej3
 */
public class SUmaDe10Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud=10;
        
        int [] array= new int[longitud];
        
        for(int i=0; i<array.length;i++){
            array[i]=(int) (Math.random()*100)+1;
        }
        System.out.println("El array generado es: " + Arrays.toString(array));
        
        System.out.println("La suma de todos los elementos del array es: " + sumaArray(array));
        
        
    }//end main
    
    
    
    static int sumaArray(int []array){
        int resultado=0;
        
        
        for(int i=0; i<array.length;i++){
            resultado+=array[i];
        }
        
        return resultado;
    }
}//end class