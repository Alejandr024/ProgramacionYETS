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
public class AreaVolumenCilindroConTrueFalse {
    
     static double cilindro( double radio, double altura, boolean opcion ){
         double valor=0;
         if (opcion){ 
             double area= 2*Math.PI*radio*(altura+radio);
            
             System.out.println("El area del cilindro es " + area + ".");
         }else{
             double volumen = Math.PI*Math.pow(radio, 2)*altura;
             
             System.out.println("El volumen del cilindro es " + volumen + ".");
         }
         
         return valor;
     }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Ingrese el radio: ");
        double x= sc.nextDouble();
        
        System.out.print("Ingrese la altura: ");
        double y= sc.nextDouble();
        
        System.out.println("""
                           Elige una opcion:
                           true: Area
                           false: Volumen""");
        
        boolean z= sc.nextBoolean();
        
       cilindro(x,y,z);
        
    }//end main
}//end class
