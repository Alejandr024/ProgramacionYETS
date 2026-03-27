/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Daw1
 */
public class ArrayDecimales {

    /**Diseñar programa que te pida cuántos número vas a introducir y que al final los
     * muestre derecho y alreves
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Cuántos número quiere introducir?: ");
        int longi= sc.nextInt();
        
        double[] arrayDecimal = new double [longi];
        double[] invertido = new double [arrayDecimal.length];
        
        System.out.println("Imprime números decimales:");
        
        for(int i = 0; i<arrayDecimal.length; i++){
            double numero=sc.nextDouble();
            arrayDecimal[i]+=numero;
        }
        
        System.out.println("Los número impreso derechos son: " + Arrays.toString(arrayDecimal));
        
        
        for(int i = arrayDecimal.length-1; i>=0; i--){
            invertido[i]=arrayDecimal[i];
        }
        
        System.out.println(Arrays.toString(invertido));
        
        //for each, matriz en una varuable aux, ventaja nunca se sale de límites.   
        for(double aux: arrayDecimal){
            System.out.print(aux + " ");
        }
    }//end main
}//end class