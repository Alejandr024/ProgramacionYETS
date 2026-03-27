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
public class ProductoPares {

    /**     producto(multiplicacion)
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: ");
        
        int number = sc.nextInt();
        
        System.out.print("Ingrese un numero real: ");
        
        double number2 = sc.nextInt();
        
        System.out.println("El producto de los " + number + " primeros pares es: "+ productoParIterativo(number));
        
        System.out.println("El producto de los " + number + " primeros pares de forma recursiva es: "+ productoParRecursivo(number));
        
        System.out.println("El producto de los " + number + " primeros pares con sobrecarga es: "+ productoParIterativo(number, number2));
        
        sc.close();
    }//end main
    
    
    //funcion para calcular el productorio de los n primeros pare de forma iterativa
    static int productoParIterativo(int number){
        int resultado= 1; //numero neutro
        
        for(int i = 1; i<=number; i++){
            resultado*=2*i;
        }
        
        return resultado;
    }//end productoParIterativo
    
    //funcion para calcular el productorio de los n primeros pare de forma recursiva
    static long productoParRecursivo(int number){
        long resultado = 1;
        
        if(number==0){
            resultado =1;
        }else{
            resultado = 2*number*productoParRecursivo(number-1);    
        }
        
        return resultado;
    }//end productoParRecursivo
    
    //Sobrecarga de la funcion productoParIterativo (necesita dos parametro)
    
    
    static int productoParIterativo(int number, double number2){
        int resultado= 1;
        if(number2>0){
        for(int i = 1; i<=number; i++){
            resultado*=2*i;
        }   
        }else if (number2<0){
            resultado = -productoParIterativo(number);
    }else{
            System.out.println("El cero es un numero par.");
        }
        return resultado;



        /*
        ejemplo de sobrecarga recursiva (no es necesario)

            static int productoParIterativo(int number, double number2){
        int resultado= 1;
        if(number2>0){
        resultado = productoParIterativo(number);
        }   
        }else if (number2<0){
            resultado = -productoParIterativo(number);
    }else{
            System.out.println("El cero es un numero par.");
        }
        return resultado;

         */
    }//end productoParIterativo
    
    
}//end class