/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;

/**Asignar un array de enteros que contenga los numeros de los meses
 *
 * @author Daw1
 */
public class ArrayEnteros {


    public static void main(String[] args) {
        
        int[] meses = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        
        String[] mesesStr = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", 
        "Junio","Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        
        for (int i = 0;  i<meses.length; i++){
            System.out.println( mesesStr[i] + " " + meses[i] + "\n");
        }
        
        
        String[] mesesBackUp = new String [mesesStr.length];
        
        
        System.out.println(mesesBackUp);
        
        
        
        
    }//end main
}//end  class
