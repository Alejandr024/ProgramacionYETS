/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba4;

import java.util.Scanner;


/**
 *
 * @author alej3
 */
public class Contar_vocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
        System.out.println("Ingrese una palabra: ");
        
        String word= sc.nextLine();
        
        palabra(word);
        
        sc.close();
    }//end main
    
    
    
    static int palabra(String word){
        int contador= 0;
        
        for(int i = 0; i < word.length(); i++){
            char c = Character.toLowerCase(word.charAt(i));
            
            switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                contador++;
                break;
            }
        }
        
        System.out.println("El numero de vocales que hay en la palabra '"+ word +"' es " + contador + ".");
        return contador;
        }//end palabra
    }//end class
