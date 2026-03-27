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
public class EjercicioCopyOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] lista= {1,2,3,4,5};
        
        
        System.out.println("Lista: " + Arrays.toString(lista));
        
        int[]listaCorta= Arrays.copyOf(lista, lista.length -1);
        
        System.out.println("Lista corta: " + Arrays.toString(listaCorta));
        
        
        System.out.print("Ingrese un valor para la lista larga: ");
        
        int valor= sc.nextInt();
        
        int [] listaLarga= add(lista, valor);
        
        System.out.println(listaLarga);
        int [] a = {1,5,2,3};
 
        int [] b= eliminarMaximo(a);
        
        System.out.println(b);
        
        System.out.println(eliminarMinimo(a));
    }//end main
    
    static int[] add (int[] lista, int valor){
        
        int[]listaLarga= Arrays.copyOf(lista, lista.length +1);
        
        listaLarga[listaLarga.length-1]= valor;
        System.out.println("Lista larga: " + Arrays.toString(listaLarga));
        
        return listaLarga;
    }
    
    static int[] eliminarMaximo(int[] lista){
        Arrays.sort(lista);
        
        System.out.println("Array 'a' ordenado y con el maximo: " + Arrays.toString(lista));
        
        int[]aSinMaximo= Arrays.copyOf(lista,lista.length-1);
        
        System.out.println("Array 'a' sin maximo: " + Arrays.toString(aSinMaximo));
        return lista;
    }
    
     static int[] eliminarMinimo(int[] lista){
        Arrays.sort(lista);
        
        System.out.println("Array 'a' ordenado y con el minimo: " + Arrays.toString(lista));
        
        int [] listaMinimo= new int [lista.length-1];
        
        for(int i =1; i<lista.length;i++){
            listaMinimo[i-1]=lista[i];//para que empieze en el 0
        }
        
        System.out.println("Array 'a' sin el minimo: " + Arrays.toString(listaMinimo));
        return lista;
    }
}//end class
