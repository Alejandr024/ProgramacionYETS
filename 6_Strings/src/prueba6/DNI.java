/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba6;
import java.util.Scanner;
import java.util.Arrays;
/**
 * 
 * @author Daw1
 */
public class DNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Introduce tu DNI: ");
        
        String cadena= sc.nextLine();
        
        
//        boolean number=true;
        char[] dni= cadena.toCharArray();
        
        for(int i=0; i<dni.length;i++){
           
        }
        System.out.println(dni);
    
    
    
    }//end main
    
}//end class