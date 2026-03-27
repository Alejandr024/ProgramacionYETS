
package arrays;
   import java.util.Arrays;
/** El programa debe crear dos arrays una con los elementos pares y otro con los impares. 
 * El programa es infeficiente porque recoore dos veces el array para poder saber las
 * dimensiones delos dos nuevos arrays
 *  Con método arcaico sin usar el añadir a una matriz o el método Arrays.copyOf()
 *
 * @author jvega
 */
public class P5_8_ArrayParImparClase {
    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        int [] array = {1,2,4,6,7,12,13,17,19,21,33};
       // Hago una primera pasada y veo cuantos pares hay y cuantos impàres hay
       int npar = 0;
       int nimpar = 0;
       for (int i =0; i <array.length; i++) {
           if (array[i]%2 ==0) {
               npar++;
           } else {
               nimpar++;
           }
       }
       
        System.out.println("Número de valors pares es " + npar);
        System.out.println("Número de valors imparees es " + nimpar);
        System.out.println("Número de valors impares es " + (array.length -npar));
        
        int[] arrayPar = new int[npar];
        int[] arrayImpar = new int[nimpar];
        
        // Recorro el array principal y voy rellenando los arrays secundarios (pares, impares)
        npar = 0;
        nimpar = 0;
        for (int i =0; i <array.length; i++) {
           if (array[i]%2 ==0) {
               arrayPar[npar] = array[i]; // relleno la posición par
               npar++; // Aumento el índice para un posible nuevo par
           } else {
               arrayImpar[nimpar] = array[i]; // relleno la posición par
               nimpar++;  // Aumento el índice para un posible nuevo impar
           }
       }
        
        // Imprimo los dos arrays: con los pares y con los imapres
        System.out.println("Array pares: " + Arrays.toString(arrayPar));
        System.out.println("Array impares: " + Arrays.toString(arrayImpar));
        
       
       
        
        
    }
    
}
