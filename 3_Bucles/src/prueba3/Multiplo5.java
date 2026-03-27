/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;

/**
 *
 * @author Daw1
 */
public class Multiplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        int multiplo5 = 5* contador;
        
        
        while (multiplo5<100){
            /*
            Imprimre el 5*0 principalmente, luego suma al contador uno más, 
            para luego multiplicarlo por 95 hasta que el último múltiplo sea 95 
            */
           System.out.println(multiplo5);
           contador++;
           multiplo5= 5*contador; 
        }
        
        
    }//end main
}//end class
