package pruebaa5;
import java.util.Arrays;

public class Loteria {
    public static void main(String[] args) {
       int[] ganadores= {1,5,8,9,17,49};
       // leo por teclado mi apuesta

       int [] miApuesta= {1,8,17,33,42,48};
       
        int [] aciertos= new int[0];


        for(int i=0; i<miApuesta.length; i++){
            if(search(ganadores, miApuesta[i])){
                aciertos= add(aciertos, miApuesta[i]);
            }
        }

        System.out.println("Has acertado los siguientes numeros: " + Arrays.toString(aciertos));
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

    // Metodo busqueda: Busca si un valor esta en un array
    static boolean search (int[] ganadores, int valor){
        boolean acierto= false;
        for (int j =0; j<ganadores.length; j++){
            if(valor==ganadores[j]){
                acierto=true;
                break;
            }
        }
        return acierto;
    }//end busqueda
}//end class