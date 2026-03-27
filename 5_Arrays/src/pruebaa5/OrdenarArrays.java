package pruebaa5;
import java.util.Arrays;

//Ordenar un array en ordern crecinete, es decir, desde el más pequeño hasta el más grande.
public class OrdenarArrays {
    public static void main(String[] args) {
        int[] array = {3, -5, 17, 0, 16, -23, 17};
        
        ordenar(array);
    }//end main




    static void ordenar(int[] array){
        int min;

        for(int i = 0; i< array.length; i++){
            //La "j" me indica que cada vez voy ordenandor los elemento que me quedan del array, 
            //la posicion "i" me indica a partir de qué indice estan ordenados.
            for(int j = i; j< array.length; j++){
            min = array[i];
            if(min>array[j]){
                array[i]= array[j];
                array[j]= min;
                min= array[i];
                }
            }
        }
        System.out.println("Array ordenado: "  + Arrays.toString(array));
    }//end ordenar
}//end class