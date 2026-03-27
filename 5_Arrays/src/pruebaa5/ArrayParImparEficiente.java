package pruebaa5;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayParImparEficiente {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce la cantidad de números a generar: ");
        int n= sc.nextInt();

        int[] arrayOriginal= new int[n];
        
        
        for(int i=0; i<arrayOriginal.length; i++){
        System.out.println("Introduce el número en la posicion " + i + ": ");
            arrayOriginal[i]= sc.nextInt();
        }

        System.out.println("Array original: " + Arrays.toString(arrayOriginal));
        int[] arrayPar= new int[0];
        int[] arrayImpar= new int[0];


        for(int i=0; i<arrayOriginal.length; i++){
            if(arrayOriginal[i]%2==0){
                arrayPar= add(arrayPar, arrayOriginal[i]);
            }else{
                arrayImpar= add(arrayImpar, arrayOriginal[i]);
            }
        }
        
        System.out.println("Array pares: " + Arrays.toString(arrayPar));
        System.out.println("Array impares: " + Arrays.toString(arrayImpar));
        sc.close();
    }//end main

    static int[] add (int[]array, int valor){
        //crear array con una posicion mas que el que se pasa por argumento.
        int[] matrizaux= new int[array.length+1];
        //Copio todos los elementos de array en la nueva matriz matrizaux
        for(int i=0; i<array.length; i++){
        matrizaux[i]= array[i];
        }
        // me queda libre la ultima posicion de matrizaux y la relleno con "valor"
        matrizaux[matrizaux.length-1]= valor;
        return matrizaux;
    }//end add
}//end class
