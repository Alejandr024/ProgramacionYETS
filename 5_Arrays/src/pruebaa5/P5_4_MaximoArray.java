/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;


import java.util.Arrays;
/**
 *
 * @author alej3
 */
public class P5_4_MaximoArray {


    public static void main(String[] args) {
        //definir array de enteros.
        
    double [] matrizD= {20.5, 3.2, -20.1, 40.0, 5.9, 17.3};    
    int[] matriz= {20, 3, -20, 40, 5, 17};
        
    int[] max = maximoArray(matriz);
        

    System.out.println("El array es: " + Arrays.toString(matriz));

    System.out.println("El valor maximo del array en enteros es " + max[0] + " y su posicion es " + max[1]);

    double[] maxD = maximoArray(matrizD);

    System.out.println("El array de doubles es: " + Arrays.toString(matrizD));

    System.out.println("El valor maximo del array de doubles es " + maxD[0] + " y su posicion es " + (int)maxD[1]);
}//end main    

    //función para calcular el máximo de un array de enteros y doubles y sus posiciones.
    static int[] maximoArray(int[] matriz){
        int mayor = matriz[0];
        int indiceMayor = 0;
        
        for(int i=1; i<matriz.length; i++){
            if(mayor<matriz[i]){
                mayor= matriz[i];
                indiceMayor = i;
            }
        }
        int posiciones []= {mayor, indiceMayor};
        return posiciones;
    }//end maximoArray

    static double [] maximoArray(double[] matriz){
        double mayor = matriz[0];
        int indiceMayor = 0;

        for(int i=1; i<matriz.length; i++){
            if(mayor<matriz[i]){
                mayor= matriz[i];
                indiceMayor = i;
            }
        }
        double[] posiciones = {mayor, indiceMayor};
        return posiciones;
    }//end maximoArray
}//end class