/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba4;
import java.util.Scanner;



/**
 * 
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class CorreccionEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        //Solicita al usuario el numero que se utilizara como maximo para la primera funcion  
        System.out.print("Ingrese un numero entero: ");
        
        int number = sc.nextInt();
        
        // lso siguientes numeros se pediran para poner un minimo y un maximo para la sobrecarga de una funcion
        System.out.print("Ingrese un numero entero de inicio para la sobrecarga (debe ser mayor que 0): ");
        int start= sc.nextInt();
        //hacemos un bucle para que el usuario ingrese un numero mas grande que 0
        if(start==0){
            while(start==0){
                System.out.print("Ingrese un numero de inicio mayor que 0: ");
                start = sc.nextInt();
            }
        }
        
        System.out.print("Ingrese un numero entero para el final: ");
        int end= sc.nextInt();
        
        //Pedimos un multiplo para la ultima sobrecarga. este se encargara de calcular solo los numeros multiplos a este numero que pedimos
        System.out.print("Ingrese un multiplo: ");
        
        int multiplo = sc.nextInt();
        
        System.out.println("La suma de los " + number + " primeros numeros elevados a dos es "+ sumaCuadrados(number) + ".");
        
        System.out.println("La suma desde los " + start + " hasta "+ end + " elevados a dos (ambos incluidos) es " +  sumaCuadrados(start, end) + ".");

        System.out.println("La suma de la funcion sobrecargada recursiva en los " + number + " primeros numeros es " + sumaCuadrados(1, number));
        
        
        System.out.println("La suma desde los " + start + " hasta " + end + " "
                + "donde incluyen unicamente los multiplos de "+ multiplo + 
                " elevados a dos (ambos incluidos) es " + sumaCuadrados(start, end, multiplo) + ("."));
    }//end main
    
    
    //funcion para calcular la suma de los number primeros numeros elevados a dos de forma iterativa
    static int sumaCuadrados(int number){
        int resultado= 0; //numero neutro que lueog se ira sumando
        //bucle para la suma de los numeros elevados a dos
        for(int i = 1; i<=number; i++){
            resultado+=i*i;//dichos numero se guardan en esta variables
        }
        //Correccion sobrecargada recuriva
        sumaCuadrados(1,number);
        
        return resultado;
    }//end sumacuadrados
    
        //funcion para calcular la suma desde start hasta end elevados todos a dos de forma iterativa
    static int sumaCuadrados(int start, int end){
        int resultado= 0; //numero neutro que luego se ira sumando
        //bucle para la suma desde start hasta end elevados a dos
        for(int i = start; i<=end; i++){
            resultado+=i*i;//dichos numero se guardan en esta variables
        }
        
        return resultado;
    }//end sumaCuadrados
    
    
 
    //funcion para calcular la suma desde start hasta end elevados todos a dos  siempre y cuando sean multiplos de un numero de forma iterativa
    static int sumaCuadrados(int start, int end, int multiplo){
        int resultado = 0;//numero neutro que lueog se ira sumando
       //bucle para la suma desde start hasta end elevados a dos
        
        for(int i = start; i<=end; i++){
            //Si son multiplos, se suman a la variables
            if(i%multiplo==0){
                resultado+=i*i;//dichos numero se guardan en esta variables
            }
        }
        return resultado;
    }
}//end class