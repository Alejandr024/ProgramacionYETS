/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacro;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class LimitadorPotenia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] bases={2.0,3.0,5.0};
        double [] exp= {3.0,2.0,2.0};
        double limite=20;
        
        System.out.println("""
                           Datos: 
                           Base: """ + Arrays.toString(bases) +"\n"
                +  "Exponente: " + Arrays.toString(exp) + "\n"
                +  "Limite: " + limite);
        
        
        
        double [] resultado=calcularSalidasSeguridad(bases,exp,limite);
        System.out.println("Salidas procesadas: " + Arrays.toString(resultado));
        
    }//end main
    
    
    static double[] calcularSalidasSeguridad(double[]bases,double[]exp,double limite){
        double [] resultado = new double[0];
        
        if(bases.length==exp.length){
           resultado= new double [bases.length];
           for(int i=0; i<bases.length;i++){
                resultado[i] = Math.pow(bases[i], exp[i]);
                if(resultado[i]>limite){
                    resultado[i]=limite;
                }
           }
       }else{
           System.out.println("Operaciones incorrectas, diferenete dimensiones.");
       }
        return resultado;
    }
    
    
}//end class
