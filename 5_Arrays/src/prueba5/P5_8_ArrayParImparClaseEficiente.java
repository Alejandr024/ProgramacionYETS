
package arrays;
   import java.util.Arrays;
import java.util.Scanner;
/** Crear un array de n elementos (leer ese n por teclado) , e ir rellenado por teclado
 * los elemetos de dicho array.
 * El programa debe crear dos arrays una con los elementos pares y otro con los impares. 
 * El programa es infeficiente porque recoore dos veces el array para poder saber las
 * dimensiones delos dos nuevos arrays
 *  Con método arcaico sin usar el añadir a una matriz o el método Arrays.copyOf()
 *
 * @author jvega
 */
public class P5_8_ArrayParImparClaseEficiente {
    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Dimensión del array a crear: ");
//        int n = teclado.nextInt();
//        // Creo un array vacío de n elementos
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//           System.out.print("Introduce el valor del elemento del array en la posición " + i + ": "); 
//           array[i] = teclado.nextInt();
//        }
        int [] array = {1,2,4,6,7,12,13,17,19,21,33};
        System.out.println("Array leido: " + Arrays.toString(array));
        
        //int[] arrayPar = new int[array.length];
        // Creo dos array: arrayPar y arrayImpar de dimension 0;
        int[] arrayPar = new int[0];
        int[] arrayImpar = new int[0];
        
        for (int i=0; i <array.length; i++) {
            if (array[i]%2 == 0) { // Si array[i] es PAR lo añado al array con los pares
                arrayPar = add(arrayPar,array[i]);
            } else { // Si array[i] es IMPAR lo añado al array con los impares
                arrayImpar = add(arrayImpar,array[i]);
            }
        }        
        System.out.println("Array Pares " + Arrays.toString(arrayPar));
        System.out.println("Array Pares " + Arrays.toString(arrayImpar));

    } // end Main
    
    static int [] add (int [] array, int valor) {
        //Creo un array con un elemento más que el que sepasa por argumento
        int[] matrizaux = new int[array.length +1];
        // Copio todos los elementos de array en la nueva matriz matrizaux
        for (int i =0; i< array.length; i++) {
            matrizaux[i] = array[i];
        }
        // me queda libre la ultima posicion de matrizaux y la relleno con "valor"
        matrizaux[matrizaux.length-1] = valor;
        // Devuelvo un matriz con los mismo elementos que array + el elmento valor en la ultima posición
        return matrizaux;
    }
    
} // end Class
