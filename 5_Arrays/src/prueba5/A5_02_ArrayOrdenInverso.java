
import java.util.Arrays;
import java.util.Scanner;

/*

package arrays;

/** A5.2 Modificaddo
 * Diseñar un programa que solicite al usuario cuantos números va a introducir  
 * y a continación debe ir introducioendo dichos números decimales. A continuación, 
 * mostrar los números en el mismo orden que se han introducido. Y mostrar en orden 
 * inverso a como se introdujeron.
 * @author jvega
 */
public class A5_02_ArrayOrdenInverso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Di cúantos números quieres introducir");
        int n = teclado.nextInt(); // Dimensión del array
        // Declaro el array
        double[] decimales = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce un número decimal: ");
            decimales[i] = teclado.nextDouble();
        }   
        System.out.println("Contenido Array: " + Arrays.toString(decimales));
        
        // Muestro en orden inverso los datos a como se han introducido
        
        System.out.println("Contenido Array Invertido: ");
        for (int i = decimales.length-1; i>=0; i--) {
            System.out.println(decimales[i]);
        }
        
        
    }  //end Main

}  // end Class
