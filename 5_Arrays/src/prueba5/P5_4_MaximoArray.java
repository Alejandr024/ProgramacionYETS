
package arrays;

/**Diseñar la función: int máximo(int t[]), que devuelve el máximo valor contenido 
 * en el array t y la posición en la que se encuentra dicho máximo. Si el máximo 
 * fuera un valor repetido, dará sólo la posición de máximo más cercano empezando 
 * desde el índice cero.
 *
 * @author jvega
 */
public class P5_4_MaximoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Declaro un array de enteros
        int[] matriz = {20,2,-20,40,5,17};
        double[] matrizDouble = {20.4,2.7,-20,40.6,5,17.1};
       //int[] matriz = {-20,-2,-20,-40,-5,-17};
       // llamo a la función maximo()
       int[] datos = maximo(matriz);
        System.out.println("El máximo del array de enteros es: "+ datos[0] 
        + " y está en la posición " + datos[1]);
         System.out.println("El máximo del array de enteros es: "+ maximo(matriz)[0] 
        + " y está en la posición " + maximo(matriz)[1]);
        //System.out.println("El máximo del array de double es: "+ maximo(matrizDouble));
        System.out.println("La dimension del array devuelto es " + maximo(matriz).length);
        
        
       
    } // end Main
    
    // Función para calcular el máximo de un array de enteros y devuelva el máximo y la posición
    // Para devolver más de un valor necesito devolver un array
    static int[] maximo (int [] array ) {
        int max = array[0];
        int indice = 0;
        for (int i =1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indice = i;
            } 
        }  
        int res[] = {max, indice};
        return res;
    }
    
    
    // SOBRECARGA. Función para calcular el máximo de un array de double
    static double maximo (double[] array ) {
        double max = array[0];
        for (int i =1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            } 
        } 
        return max;
    }
    
}  // End Class
