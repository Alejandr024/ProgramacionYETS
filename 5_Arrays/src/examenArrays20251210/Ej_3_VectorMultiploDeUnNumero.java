
package examenArrays20251210;
import java.util.Arrays;


/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Ej_3_VectorMultiploDeUnNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaramos la variable "resultado" para imprimir la funcion
        int [] resultado= vectorMultiploYDivisor(750,5);
        
        System.out.println("Multiplos de 5 y divisores de 750: " + Arrays.toString(resultado));
        
        //Declaramos la variable "resultado" para imprimir la funcion sobrecargada
        resultado = vectorMultiploYDivisor(750,5,3);
        System.out.println("Multiplos de 5 y diviosres de 750: " + Arrays.toString(resultado));
        
        
    }//end main
    
    // funcion sin sobrecargar
    static int [] vectorMultiploYDivisor(int number1, int number2){
        //Ponemos un contador para ajustar el tamaño del array
        
        int contador=0;
        
        
        //recorremos y comprobramos si el numero es divisor del primer numero y multiplo del segundo. Si lo es, alargamos la longitud del array
        for(int i=1; i<=number1;i++){
            if(number1%i==0 && i%number2==0){
                contador++;
            }
        }
        // declaramos el array por medio de contador
        int[]resultado= new int[contador];
        
        
        //creamos otro contador para posicionar de manera correcta los numeros en el array
        int contador2=0;
        //recorremos y comprobramos si el numero es divisor del primer numero y multiplo del segundo. Si lo es, agregamos dicho numero
        for(int i=1; i<=number1;i++){
            if(number1%i==0 && i%number2==0){
                resultado[contador2]=i;
                contador2++;
            }
        }

        return resultado;
    }//end  vectorMultiploYDivisor   
    
        static int [] vectorMultiploYDivisor(int number1, int number2, int number3){
//Ponemos un contador para ajustar el tamaño del array
            
        int contador=0;
        //recorremos y comprobramos si el numero es divisor del primer numero, multiplo del segundo y que no sea multiplo del tercero. Si lo es, alargamos el array
        for(int i=1; i<=number1;i++){
            if(number1%i==0 && i%number2==0 && i%number3!=0){
                contador++;
            }
        }
        // declaramos el array por medio de contador
        int[]resultado= new int[contador];
        //creamos otro contador para posicionar de manera correcta los numeros en el array
        int contador2=0;
        
        //recorremos y comprobramos si el numero es divisor del primer numero, multiplo del segundo y que no sea multiplo del tercero. Si lo es, agregamos dicho numero
        for(int i=1; i<=number1;i++){
            if(number1%i==0 && i%number2==0 && i%number3!=0){
                resultado[contador2]=i;
                contador2++;
            }
        }

        return resultado;
    }//end  vectorMultiploYDivisor  
    
    
}//end class