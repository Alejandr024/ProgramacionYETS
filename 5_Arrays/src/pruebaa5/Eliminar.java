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
public class Eliminar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longfilas= (int) (Math.random()*4)+1;
        
        int longcolumn= (int) (Math.random()*10)+1;
        
        
        int [][] array= new int [longfilas][longcolumn];
        
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                array[i][j]= (int) (Math.random()*10)+1;
            }
        }
        System.out.println(Arrays.deepToString(array));
    
        int valor= (int) (Math.random()*5)+5;
        
        System.out.println("Valor: " + valor);
        
        
        for(int i=0;i<array.length;i++){
            array[i]= eliminarMayores(array[i],valor);
        }
        
        
        System.out.println("Array sin los mayores: " + Arrays.deepToString(array));
        
    }//end main
    
    
    static int[] eliminarMayores(int [] array, int valor){
        int contador=0;
        
        for(int num: array){
            if(num<valor){
                contador++;
            }
        }
        
        int[] arrayAux= new int[contador];
        

        int i=0;
        for(int num:array){    
            if(num<valor){
                arrayAux[i]=num;
                i++;
            }
        }
        return arrayAux;
    }
    
    
    
}//end class
