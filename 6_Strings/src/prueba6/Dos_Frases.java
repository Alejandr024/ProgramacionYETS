/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba6;
import java.util.Scanner;
/**
 *
 * @author Daw1
 */
public class Dos_Frases {

    /**INtroduci dos frases, y decir cual es más corta
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in, "windows-1252");
        
        System.out.print("Ingrese una frase: ");
        
        String frase1= sc.nextLine();
        
        System.out.print("Ingrese otra frase: ");
        
        String frase2= sc.nextLine();
        
        String maximo= "";
        int cadenaMax =0;
        String minimo="";
        int cadenaMin=0;
        if(frase1.length()>frase2.length()){
            maximo=frase1;
            cadenaMax= frase1.length();
            minimo= frase2;
            cadenaMin=frase2.length();
            
            System.out.printf("La frase %s es más pequeña que la frase %s. Donde su cadena es de %d y %d, respectivamente.\n", minimo, maximo, cadenaMin, cadenaMax);
        }else if(frase1.length()<frase2.length()){
            maximo=frase2;
            cadenaMax= frase2.length();
            minimo= frase1;
            cadenaMin=frase1.length();
            
            System.out.printf("La frase %s es más pequeña que la frase %s. Donde su cadena es de %d y %d, respectivamente.\n", minimo, maximo, cadenaMin, cadenaMax);
        }else{
            System.out.println("Las frases miden lo mismo.");
        }
        
    }//end main
    
}//end class