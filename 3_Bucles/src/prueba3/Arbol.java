/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;

import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class Arbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        int altura;//altura que introducirá
        int alturaMaxima = 0;//altura máxima, si e introduce una mas grande, 
        //se cambia y se pone la nueva
        int posicionMaxima= 0;//posición que se encuetra la altura máxima
        int contador = 0;//contador para llevar en cuenta cuánto valores se han
        //introducido
       
       do{
       System.out.println("Introduce una altura de arbol en cm: ");
        altura = sc.nextInt();
        
        
        if(altura>=alturaMaxima){
            alturaMaxima = altura;
            posicionMaxima = contador;
        }       
        contador ++;
       }while(altura>=0);
       
       System.out.println("El arbol más alto mide " + alturaMaxima + " cm, con etiqueta " + posicionMaxima + ".");
       
        
    }//end main
}//end clas
