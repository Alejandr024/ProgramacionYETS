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
public class EliminarValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array= {1,-5,7,-5,8,-5,6};
       
       int [] arrayNueva= new int[0];
       
       int valor=-5;
       
       for(int i =0; i<array.length;i++){
           if(array[i]!=valor){
               arrayNueva= add(arrayNueva, array[i]);
           }
       }
       
        System.out.println("Array sin el " + valor + ": " + Arrays.toString(arrayNueva));
       
    }//end main
    
    
    static int[] add(int[] agenda, int valor){
        
        int[] agendaAux= new int [agenda.length + 1];
        
        for(int i = 0; i<agenda.length; i++){
            agendaAux[i]=agenda[i];
            }
        agendaAux[agendaAux.length - 1]= valor;
        
        
        return agendaAux;
    }//end add
    
    
}//end class