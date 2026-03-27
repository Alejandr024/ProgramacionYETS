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
public class InvertirPalabra {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra: ");
        
        String word = sc.nextLine();
        
         reverseWord(word);
        
         sc.close();
    }//end main    
    
    
    
    static String reverseWord( String word){
        String ReverseWord= "";
        
        int contador = word.length();
        
        
        
        for(int i = contador; i>0; i--){
            ReverseWord = ReverseWord + Character.toLowerCase(word.charAt(i-1));
        }
        
        if(word.equalsIgnoreCase(ReverseWord)){
            System.out.println("La palabra " + word + " es un palindromo.");
        }else{
            System.out.println("Palabra invertida: " + ReverseWord);
        }            
        return ReverseWord;
    }//end reverseWord
}//end class
