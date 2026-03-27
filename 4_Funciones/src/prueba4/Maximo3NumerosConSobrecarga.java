/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba4;

import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class Maximo3NumerosConSobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        int n1 =  (int) (Math.random()*100) + 1;
        System.out.println(n1);
        
        int n2 =  (int) (Math.random()*100) + 1;
        System.out.println(n2);
        
        int n3 =  (int) (Math.random()*100) + 1;
        System.out.println(n3);
       
        System.out.println("El número máximo de los tres numeros es " + 
                maximo(n1,n2,n3) + ".");    
    }//end main
    
    static int maximo(int n1, int n2){
        int max = n1;
        
        if(max<n2){
            max = n2;
        }
        return max;
    }//end maximo de dos numeros
    
    //Funcion maximo sobrecargado recursivo
    
    static int maximo(int n1, int n2, int n3){
        int max = maximo(n1,n2);
        
        max = maximo(max,n3);///hace la comparativa de la funcion anterior, de
        /////eso se encagra la recursividad
        
        return max;
    }//end maximo de tres numeros
}//end class