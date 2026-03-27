/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author alej3
 */
public class MatrizRandomFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        int [] array= new int[15];
        
        for(int i=0;i<array.length;i++){
            //(int) (Math.random()*(maximo-minim+1))+minimo; -->formula
            array[i]= (int) (Math.random()*11)-5;
        }
        
        System.out.println(Arrays.toString(array));
        
        System.out.println("Elige un numero entre -5 y 5: ");
        int valor=sc.nextInt();
        
        int [] resultado= eliminarValores(array, valor);
        
        System.out.println(Arrays.toString(resultado));
        
    }//end main
    
    static int[] eliminarValores(int[]array, int valor){
        int contador=0;
    
        int veces=0;
        
        for(int num: array){
            if(num!=valor){
                contador++;
            }else{
                veces++;
            }
        }
        
        int[] resultado= new int[contador];
        
        int [] posicion= new int[contarApariciones(array,valor)];
        
        int i=0;
        for(int num:array){    
            if(num!=valor){
                resultado[i]=num;
                i++;
            }
        }
        
        int index=0;
        for(int j=0; j<array.length;j++){
            if(array[j]==valor){
                posicion[index]=j;
                index++;
            }
        }
        
        if(estaEnArray(array,valor)){
            System.out.println("El valor " + valor + " aparece " + veces + " veces, "
                    + "se encontrabra en las siguientes posiciones: "+ Arrays.toString(posicion) 
                    + " y ha sido eliminado. Por tanto, la matriz quedaria de "
                    + "la siguiente manera: ");    
        }else{
            System.out.println("El valor " + valor + " no esta en el array. Por tanto, "
                    + "la matriz queda de la sigueinte manera.");
        }
        
        return resultado;
    }//end eliminarValores
    
    
    static boolean estaEnArray(int []array, int valor){
        for(int i=0; i<array.length;i++){
            if(array[i]==valor){
                return true;
            }
        }
        
        
        return false;
    }//end estaEnArray
    
    
    static int contarApariciones(int[] array, int valor) {
    int contador = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == valor) {
            contador++;
        }
    }
    return contador;
}

    
}//end class