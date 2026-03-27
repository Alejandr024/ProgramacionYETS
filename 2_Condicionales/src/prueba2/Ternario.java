
package prueba2;
 import java.util.Scanner;
/**
 *
 * @author jvega
 */
public class Ternario {

    /**
     * @param args the command line arguments
     */
       

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el primer n�mero entero
        System.out.print("Introduce el primer n�mero entero: ");
        int primerNumero = scanner.nextInt();
        boolean esPositiva = primerNumero >= 0;

        // Leer el segundo n�mero entero
        System.out.print("Introduce el segundo n�mero entero: ");
        int segundoNumero = scanner.nextInt();
        boolean esPar = segundoNumero % 2 == 0;

        // Evaluar y mostrar resultados
        String resultadoNegativoPar = (primerNumero < 0 && esPar) ? "Primer valor negativo y 2� par: true" : "Primer valor negativo y 2� par: false";
        String resultadoPositivoImpar = (primerNumero >= 0 && !esPar) ? "Primer valor positivo y 2� impar: true" : "Primer valor positivo y 2� impar: false";

        if (!esPositiva && esPar) {
            System.out.println(resultadoNegativoPar);
        } else if (esPositiva && !esPar) {
            System.out.println(resultadoPositivoImpar);
        }
    }
}

 

