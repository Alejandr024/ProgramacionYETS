
package arrays;

import java.util.Arrays;

/**
 *
 * @author Administrador
 */
public class EjemplosArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String[] agenda = new  String[3]; 
//        String[] agenda = {"David", "Ibrahim", "Pepe", "Juan", "Maria", "Eva", "Anthony", "Alan", "Samuel", "Laura"};
//        
//        
//        System.out.println("Referencia Array: " + agenda);
////         System.out.println("Primer elemento de agenda: " + agenda[0]);  
////         System.out.println("Segundo elemento de agenda: " + agenda[1]); 
//        //Listo el contenido de un array
//        agenda[2] = "Pepa";
//        for (int  i = 0; i<9; i++) {
//            System.out.println((i+1) + " " + agenda[i]);
//        }
//        
//        
//        
//        // Arrays 2 dimensiones
////        
////        double[][][] notas = new double[5][27][];
////        System.out.println(notas);
////        
//        // copia de un array (tienen la misma referencia)
//        String[] copia = agenda;
//        System.out.println("Referencia Array: " + agenda);
//        System.out.println("Referencia Array: " + copia);
//        
//        copia[0] = "Hola Mundo";
//        
//        for (int  i = 0; i<9; i++) {
//            System.out.println((i+1) + " Copia " + copia[i]);
//        }
//        
//        
//                for (int  i = 0; i<9; i++) {
//            System.out.println((i+1) + " Agenda " + agenda[i]);
//        }
//        
//        // Rererencias        
//        copia =null;
//        System.out.println("copia: " + copia);
//        System.out.println("copia: " + agenda);
//        
//        
//        // Dimension de un array: método .length
//        System.out.println("Dimension de agenda: " + agenda.length);
//                
//        // Reescritura de un Array
//        for (int i = 0 ; i < agenda.length; i++) {
//          agenda[i] += " (alumno)";
//            System.out.println(agenda[i]); 
//        }

        int[] datos = {2,5,1,7,8,9,13, 1};
        System.out.println("Dimension de datos:" + datos.length);
        //System.out.println("Elemento en la posición 4 de datos:" + datos[8]); // Fuera de límites
        
       
        int[] copiaDatos = datos;
        copiaDatos[3] = 1000;  
         
        System.out.println("Elemento en la posición 4 de datos: " + datos[3]);
        
        // imprimir contenido de un array
//        
//        for (int i = 0; i < datos.length; i++ ) {
//            System.out.println( datos[i]);    
//        }
        
        System.out.println(datos);
        // Imprimir contenido de un array con el método toString
        
        System.out.println(Arrays.toString(datos));
        
        
        // COPIA DE ARRAY
        
        // Creo un array con la misma dimension del array que quiero copiar
        int[] copia = new int[datos.length];
        System.out.println(Arrays.toString(copia));
        // Copio elemento a elemento de un array a otro
        for (int i = 0; i < datos.length; i++ ) {
            copia[i] = datos[i];
        }
        System.out.println(Arrays.toString(copia));
        
        System.out.println("Rererencia datos: " + datos);
         System.out.println("Rererencia copia: " + copia);
         System.out.println("Comparar copia y datos: " + (copia==datos));  
         System.out.println("Comparar copiaDatos y datos: " + (copiaDatos==datos)); 
         
        // Comparar dos ARRAYS. 1º comparo dimensiones y luego elemento a elemento en cada posición
        
        datos[0]=30000;
        
        boolean igual  =true;
        if (datos.length == copia.length) {
           for (int i =0; i < datos.length; i++) {
               if (datos[i] != copia[i]) {
                   igual = false;
                   break;
               }
           }
        }   else {
            igual = false;
        } 
           
        
        System.out.println("son iguales? " + igual);
           
     
        


    } // end Main
    
//    static String nombre (int indice) {
//        return 
//    }
    
    
} // end Class
