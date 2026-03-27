/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alej3
 */
public class MatrizSobrecargaFunciones {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int longi= (int)(Math.random()*6+4);
        int [] datos= new int [longi];

        for(int i=0; i<datos.length; i++){
            datos[i]= (int)(Math.random()*10)+1;
        }
        int longi2= (int)(Math.random()*6+4);
        double [] datos2= new double [longi2];
        for(int i=0; i<datos2.length; i++){
//            Usando Math.round (redondea a 2 decimales, no trunca puro)
            datos2[i]= Math.round(((Math.random()*10)+1) * 100.0) / 100.0;
        }
        
        int eleccion=0;
        int valor;
        double valorReal;
        int []resultado;
        double[] resultadoReal;
        int posicion;
        int veces;
        do{
                

            
            System.out.println("Bienvenido al menu del array " + Arrays.toString(datos)
            + " y del array real " + Arrays.toString(datos2) + ". Que quieres hacer?:\n"
                    + "1: Agregar un numero al array.\n"
                    + "2: Agregar un numero n una posicion concreta del array.\n"
                    + "3: Agregar un numero real.\n"
                    + "4: Hacer una recursiva del apartado 2.\n"
                    + "5: Salir.");
            eleccion=sc.nextInt();
            
            while(eleccion<=0 || eleccion>5){
                System.out.println("Error, opcion no disponible. Por favor, vuelva a intentarlo.");
                eleccion=sc.nextInt();
            }
            
            switch(eleccion){
                case 1:
                    System.out.print("�Que numero quieres agregar? ");
                    valor= sc.nextInt();
                    resultado= add(datos,valor);
                    datos=resultado;
                    System.out.println(Arrays.toString(resultado));
                    break;
                case 2:
                    System.out.print("Que numero quieres agregar? ");
                    valor= sc.nextInt();
                    System.out.println("En que posicion lo quieres agregar?");
                    posicion= sc.nextInt();
                    resultado= add(datos,valor,posicion);
                    datos=resultado;
                    System.out.println(Arrays.toString(resultado));
                    break;
                case 3:
                    System.out.print("Que numero (real) quieres agregar? ");
                    valorReal= sc.nextDouble();
                    resultadoReal= add(datos2,valorReal);
                    datos2=resultadoReal;
                    System.out.println(Arrays.toString(resultadoReal));
                    break;
                case 4:
                    System.out.print("Que numero quieres agregar? ");
                    valor= sc.nextInt();
                    System.out.print("Cuantas veces quieres agregarlo? ");
                    veces= sc.nextInt();
                    resultado= addRecursiva(datos,valor,veces);
                    datos=resultado;
                    System.out.println(Arrays.toString(resultado));
            }
            
        }while(eleccion<5);
        
        System.out.println("Gracias por usar el programa. Hasta pronto!");

        sc.close();
    }//end main
    
    
        static int[] add (int[]array, int valor){
        //crear array con una posicion mas que el que se pasa por argumento.
            int[] matrizAux= new int[array.length+1];
        //Copio todos los elementos de array en la nueva matriz matrizaux
            for(int i=0; i<array.length; i++){
                matrizAux[i]= array[i];
            }
        // me queda libre la ultima posicion de matrizaux y la relleno con "valor"
            matrizAux[matrizAux.length-1]= valor;
            
            System.out.print("Matriz actualizada con el numero " + valor + " agregado a datos: " );
            return matrizAux;
    }//end add
        
        
        
        static int[] add (int[]array, int valor, int posicion){
        //crear array con una posicion mas que el que se pasa por argumento.
            int[] matrizAux= new int[array.length+1];
        //Copio todos los elementos de array en la nueva matriz matrizaux
            for(int i=0; i<posicion; i++){
                matrizAux[i]= array[i];
            }
         // meter el valor en la posici�n indicada
            matrizAux[posicion]= valor;
            
        //  copiar el resto movi�ndolos una posici�n
            for(int i = posicion; i < array.length; i++){ 
                matrizAux[i + 1] = array[i];
            }
            
            System.out.print("Matriz actualizada con el numero " + valor + " agregado a datos: ");
            return matrizAux;
    }//end add
        
        static double[] add (double[]array, double valor){
        //crear array con una posicion mas que el que se pasa por argumento.
            double[] matrizAux= new double[array.length+1];
        //Copio todos los elementos de array en la nueva matriz matrizaux
            for(int i=0; i<array.length; i++){
                matrizAux[i]= array[i];
            }
        // me queda libre la ultima posicion de matrizaux y la relleno con "valor"
            matrizAux[matrizAux.length-1]= valor;
            
            System.out.print("Matriz actualizada con el numero " + valor + " agregado a datos: " );
            return matrizAux;
    }//end add
        
        static int[] addRecursiva (int[]array, int valor, int veces){
            
            if(veces==0){
                return array;
            }
            
            int[] matrizAux= add(array,valor,0);

            System.out.println("Array tras agregar el numero " + valor + ": ");
            return addRecursiva(matrizAux,valor,veces-1);
    }//end add
        
}//end class
