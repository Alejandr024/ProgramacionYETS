package arrays;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class ArraysMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Array de una dimension:
//        String[] agenda = {"David", "Ibrahim", "Pepe", "Juan", "Maria", "Eva", 
//        "Anthony", "Alan", "Samuel", "Laura"};
//        
//        String[] agenda = new string[6];
//        System.out.println("Referencia array: " + agenda);
//        System.out.println("Primer elemento: " + agenda[0]);
        
//        
//        agenda[2] = "Pepa";
//        
//        for (int i = 0;  i<agenda.length; i++){
//            System.out.println((i+1) + " " + agenda[i]);
//        }
        
        // Array de dos dimensiones
//        double[][] notas = new double [5][27];
        
            
        //Referencias
        
//        String[] copia = agenda;
//        
//        
//        System.out.println("Referencia array agenda: " + agenda);
//        System.out.println("Referencia array copia: " + copia);
//        
//        copia[0]= "Hola mundo";
//        
//        
//        for (int i = 0;  i<copia.length; i++){
//            System.out.println((i+1) + " Copia " + agenda[i] + "\n");
//        }
//        
//        for (int i = 0;  i<agenda.length; i++){
//            System.out.println((i+1) + " Agenda " + agenda[i] + "\n");
//        }

        //null
        
//        copia = null;
        
//        System.out.println("Referencia array agenda: " + agenda);
//        System.out.println("Referencia array copia: " + copia);
        
       //dimension de un array
         
//        System.out.println("Dimension de agenda " + agenda.length);
        
//       for (int i = 0;  i<agenda.length; i++){
//           agenda[i]+= " (alumno)";
//            System.out.println(agenda[i] + "\n");
//        } 
       
//       
//        for (int i = 0;  i<mesesBackUp.length; i++){
//           System.out.println(mesesBackUp[i]); 
//       }
        
//        int[] datos = {2,5,1,7,8,9,13,1};
//        
//        int[] copiaDatos = datos;
        
       
//        System.out.println(datos[3]);
//        for(int i = 0; i<datos.length; i++){
//            System.out.print(datos[i] + " ");
//        }
//        System.out.println(datos);
        
        //Imprimir contenido de un array con el método toString
        
//        System.out.println(Arrays.toString(datos));
        
        // Copia de array
        
        
//        int[] copia2 = new int [datos.length];
//        
//        System.out.println(Arrays.toString(copia2));
//        
//        for(int i = 0; i<datos.length; i++){
//            copia2[i]= datos[i];
//        }
//        
//        System.out.println(Arrays.toString(copia2));
        
        //Son diferentes, por tanto, tienen los mismo datos pero disitnta referencia. 
//        System.out.println("Referencia datos: " + datos);
//        System.out.println("Referencia copia2: " + copia2);
        
    //misma referencia, por tanto es true
//        System.out.println("Comparar copiaDatos y datos: " + (copiaDatos==datos));
    // diferente referencia, por tanto es false
//        System.out.println("Comparar copia2 y datos: " + (copia2==datos));
      //Comprara arrays. 1º: comparar dimensiones y luego elemento en cada posición
      
//      
//      datos[0]= 30000;
//      boolean igual = true;
//      
//      if(datos.length== copia2.length){
//          for(int i = 0; i<datos.length; i++){
//              if(datos[i]!=copia2[i]){
//                  igual= false;
//                  break;
//              }
//          }
//          
//      }else{
//          igual = false;
//      }
//      
//        System.out.println("¿Son iguales? " + igual);
        


  //for each, matriz en una varuable aux, ventaja nunca se sale de límites.   
//        for(double aux: arrayDecimal){
//            System.out.print(aux + " ");
//        }

        // alargar el array
//        
//        String[] agenda2= {"Laura", "Anthony", "Andrés"};
//        
//        for(String aux : agenda2){
//            System.out.println(aux + " ");
//        }
//        
//        //Creo matriz auxiliar con dimenion de agenda2 + 1
//        String[] agendaAux = new String[agenda2.length + 1];
//        
//        //copio datos (el último no tendrá nada, pues agendsAux copia los mismo datos de 
//        // agenda2, el cual esta tiene 1 dimension menos que agendaAux.
//        
//        for(int i = 0; i<agenda2.length; i++){
//            agendaAux[i]=agenda2[i];
//        }
//        
//        System.out.print("Introduce el nombre a añadir: ");
//        
//        
//        //forma de agregar al final e nuevo array
//         agendaAux[agendaAux.length-1]= sc.nextLine();
//        
//        System.out.println(Arrays.toString(agendaAux));
        
        
//        System.out.println("Array normal: " + Arrays.toString(datos));
//        
//        sumarArray(datos,2);
//        
//        
//        System.out.println("Array sumado por 2: " + Arrays.toString(datos));
//        
//        
//        System.out.println("Matriz original: " + datos);
//        
//       int[] arrayCopia= copiaArray(datos);
//       
//        System.out.println("Matriz copia: " + arrayCopia);
//        
//        sc.close();
        
        //Metodo ordenar de arrays
        
        
        int [] agendaa ={6,2,8,4,1};
        
        Arrays.sort(agendaa);
        //Es obligatorio ordenar el array, pues sin ella no se podrian encontrar bien algunos valores
        //que queramos ver (Por ejemplo, si el aray esta desordenaod r y queremos imprimir el 4, nos sale -1,
        //pues detecta que el primero es 6 e intuye que es minimo y por ello pone la posicion -1.
        
        
        System.out.println("Valores ordenados de agendaa: " + Arrays.toString(agendaa));
        
        System.out.println("Posicion en la que se encuentra el 4: " + Arrays.binarySearch(agendaa,4));
        
        System.out.println("Posicion en la que se encuentra el 5: " + Arrays.binarySearch(agendaa,5));
        
    }//end main
    
    //Como llamar a una funcion con un array como argumento
    
    static void sumarArray (int [] matriz, int n){
        
        for(int i = 0; i<matriz.length; i++){
            matriz[i]+=n;
        }
    }//sumarArrays
    
    
    
    static int[] copiaArray (int [] matriz){
        int[] auxMatriz= new int[matriz.length];
        
        
        for(int i = 0; i<matriz.length; i++){
            auxMatriz[i]+=matriz[i];
        }        
        return auxMatriz;
    }//end copiaArray
}//end class