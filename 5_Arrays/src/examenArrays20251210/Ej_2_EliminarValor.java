package examenArrays20251210;
import java.util.Arrays;
/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Ej_2_EliminarValor {
    public static void main(String[] args) {
        
        double valor = 3;
        double [] a = {1,2,3,4};
        double [] b = {5,6,3,8};
        double [] c = {3,3,3,6};
        double[] d = {5,3,3,6};        
        double [][] e = {a,b,c,d}; 
        System.out.println("Array original: ");
        //llamamos a la funcion de "mostrar" para que muestre el array bidimensional
        mostrar(e);
        
        //llamamos al array tras eliminar el valor que hayamos indicado
        System.out.println("Array después de eliminar el valor: " + valor); 
        for(int i=0; i<e.length;i++){
            e[i]=eliminarValores(e[i],3);
            System.out.println("Array " + (i+1) +": " + Arrays.toString(e[i]));
        }
        
        
        //llamamos al array tras eliminar el valor que hayamos indicado en una funcion sobrecargada de void
        System.out.println("Funcion sobrecargado: " + Arrays.deepToString(e));
        
        //por ultimo, llamamos al array tras agregar el valor que hayamos indicado
        System.out.println("Funcion add: ");
        for(int i=0; i<e.length;i++){
            double [] resultado= add(e[i],5.34);
            System.out.println("Array " + (i+1) +": " + Arrays.toString(resultado));
        }
      
    } // end Main
    
    // eliminarValor(): Elimina los elementos iguales a un cierto valor de un Array de una dimensión
         static double[] eliminarValores(double[]array, double valor){
        //Ponemos un contador para ajustar el tamaño del array
        int contador=0;
    
 //recorremos y comprobramos si el numero es diferente al valor. Si lo es, alargamos la longitud del array       
        for(double num: array){
            if(num!=valor){
                contador++;
            }
        }
        // declaramos el array por medio de contador
        double[] resultado= new double[contador];
        
//recorremos y comprobramos si el numero es diferente al valor. Si lo es, agregamos dicho numero
        int i=0;
        for(double num:array){    
            if(num!=valor){
                resultado[i]=num;
                i++;
            }
        }
        
        return resultado;
    }//end eliminarValores   
         

    // eliminarValor() sobrecargada: Elimina los elementos iguales a un cierto 

         
        static void eliminarValores(double[][]array, double valor){
        //Ponemos un contador para ajustar el tamaño del array
            int contador=0;
//recorremos y comprobramos si el numero es diferente al valor. Si lo es, alargamos la longitud del array       
        for(int i=0; i<array.length;i++){
             for(int j=0; j<array[i].length;j++){
                 if(array[i][j]!=valor){
                     contador++;
                 }
             }
         }
         // declaramos el array por medio de contador y del array
        double[][] resultado= new double[array.length][contador];
        //recorremos y comprobramos si el numero es diferente al valor. Si lo es, agregamos dicho numero
        for(int i=0; i<array.length;i++){
             for(int j=0; j<array[i].length;j++){
                 if(array[i][j]!=valor){
                     resultado[i][j]=array[i][j];
                 }
             }
         }
        //mostramos el resultado
        for(int i=0; i<resultado.length;i++){
            System.out.println("Array " + (i+1) +": " + Arrays.toString(resultado[i]));
        }
        
        
        //no devolvemos, pues es un void
    }//end eliminarValores 
         
    
    // mostrar(): muestra el contenido de cada fila indicando el número de fila
        
        static void mostrar(double[][]array){
        //creamos un bucle para mostras el array de forma ordenada    
        for(int i=0; i<array.length;i++){
            System.out.println("Array " + (i+1) +": " + Arrays.toString(array[i]));
        }
            //no devolvemos, es un void
        }
    // add(): Funcion para añadir un valor a un vector de enteros 
    static double[] add(double[] array, double valor) {
        //Creo un array con un elemento más que el que sepasa por argumento
        double[] matrizaux = new double[array.length + 1];
        // Copio todos los elementos de array en la nueva matriz matrizaux
        for (int i = 0; i < array.length; i++) {
            matrizaux[i] = array[i];
        }
        // me queda libre la ultima posicion de matrizaux y la relleno con "valor"
        matrizaux[matrizaux.length - 1] = valor;
        // Devuelvo un matriz con los mismo elementos que array + el elmento valor en la ultima posición
        return matrizaux;
    }//end add        
    
    
} // end Class
