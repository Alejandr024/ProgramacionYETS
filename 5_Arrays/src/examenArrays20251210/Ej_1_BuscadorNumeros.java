
package examenArrays20251210;

import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */

public class Ej_1_BuscadorNumeros {

    public static void main(String[] args) {
     //creamos dos random para poner a prueba demas numeros.
        
        int limite= (int)(Math.random()*30)+10;
       int objetivo= (int)(Math.random()*5)+1;
       // declaramos la variable "resultado" dentro del main y, dentro de ella, 
       // ponemos la funcion que busca los suma cuya suma de digitos da el objetivo
       // con un limite integrado
       int[] resultado= buscarPorSumaDigitos(limite,objetivo);
       
       //imprimimos el array
        System.out.println("Limite " + limite + " Objetivo " + objetivo + ": " + Arrays.toString(resultado));
    }//end main
    
    
    //funcion la cual agrega los numeros
    static int[] buscarPorSumaDigitos(int limite, int objetivo){
        //Ponemos un contador para ajustar el tamaño del array
        int contador=0;
        //recorremos y llamamos a la funcion de sumarDigitos para comprobrar si el igual al objetivo. Si lo es, alargamos la longitud del array
        for(int i=1; i<=limite;i++){
            int number= sumarDigitos(i);
            
            if(number==objetivo){
                contador++;
            }
        }
        // declaramos el array por medio de contador
        int[] resultado= new int [contador];
        

        //creamos otro contador para posicionar de manera correcta los numeros en el array
        int contador2=0;
        //recorremos y llamamos a la funcion de sumarDigitos para comprobrar si el igual al objetivo. Si lo es, agregamos dicho numero
        for(int i=1; i<=limite;i++){
            int number= sumarDigitos(i);
            
            if(number==objetivo){
                resultado[contador2]= i;
                contador2++;
            }
        }
        
        return resultado;
    }//end buscarPorSumaDigitos
    
    static int sumarDigitos(int n) {
        
        int suma = 0;
        int numeroTemporal = n;

        while (numeroTemporal > 0) {
            // Obtenemos el ultimo di­gito (resto de dividir entre 10)
            int digito = numeroTemporal % 10;
            suma += digito;      
            // Quitamos el ultimo di­gito (division entera entre 10)
            numeroTemporal = numeroTemporal / 10;
        }
        return suma;
    }//end sumarDigitos
    
    
}