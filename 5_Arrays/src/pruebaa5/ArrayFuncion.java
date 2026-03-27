/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;
import java.util.Scanner;
import java.util.Arrays;
/**Funcion que devuelva una matriz con un elemento mas que la matriz que se le 
 * pasa como argumento
 *
 * @author Daw1
 */
public class ArrayFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String[] arrayString= {"Pepe"};
        
        arrayString = anadir(arrayString, "Jose");

        System.out.println("Arrays de nombres: " + Arrays.toString(arrayString));
    }//end main
    
    
    static String[] anadir(String[]matriz, String nombre){
        String[]auxArray = new String[matriz.length+1];
        
        
        for(int i = 0; i<matriz.length; i++){
          auxArray[i]=matriz[i];  
        }
        auxArray[auxArray.length-1]= nombre;
        return auxArray;
    }//end anadir
    
    //sobrecarga para añadir arrays de numeros
    
    
    static int[] anadir(int[]matriz, int nombre){
        int[]auxArray = new int[matriz.length+1];
        
        
        for(int i = 0; i<matriz.length; i++){
          auxArray[i]=matriz[i];  
        }
        auxArray[auxArray.length-1]= nombre;
        return auxArray;
    }//end anadir
    
    
}//end class
