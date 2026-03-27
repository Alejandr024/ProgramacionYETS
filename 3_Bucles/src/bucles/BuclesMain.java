/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;


/**
 *
 * @author Alejandro Gómez
 */
public class BuclesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        //           BUCLE WHILE
        
//        System.out.print("Introduce un número entre el 0 y 10, ambos inclusive: ");
//        
//        int number = sc.nextInt();
//        
//        
//        
//        while(number<0 || number>10){
//            System.out.println("Valor incorrecto, por favor, ingréselo bien.");
//            number = sc.nextInt();
//        }
//        /*  
//        con este while, hace que, si el usuario 
//        ingresa incorrectamente el valor, se le pide que lo ingrese bien y 
//        se le da la oportunidad de volver a ponerlo hasta que lo ingrese bien.
//        */
//        
//        
//        
//        if(0<=number && number<=10){
//        System.out.println("El valor numérico es " + number + ".");    
//        }
        

        //                  BUCLE DO-WHILE
        
//        System.out.println("Introduce números menor 10 e imprímelos (para salir imprime un número>10): ");
//        
//        int number = sc.nextInt();
//        
//        while(number<10){
//            System.out.println(number);
//            System.out.println("Introduce números menor 10 e imprímelos (para salir imprime un número>10): ");
//            number = sc.nextInt();
//        }
//
//
//        int number;
//        
//        do{
//            System.out.println("Introduce números menor 10 e imprímelos (para salir imprime un número>10): ");
//            number = sc.nextInt();
//            System.out.println(number);
//        } while(number<10);   
          
          // BUCLE FOR
          // contar hasta 5
          //for (int variable, condicion, incremento){
          // instrucciones.
          //}
//          for(int contador = 1; contador<=5; contador++){
//              System.out.println(contador);
//          }
          //numero pares menores que 100
          
//          for(int contador= 0; contador<100; contador+=2){
//              System.out.print(contador + " ");
//          }
          // numeros pares menores que 100
//          for(int contador= 1; contador<100; contador+=2){
//              System.out.print(contador + " ");
//          }

            //doble contador con control de los contadores fuera del bucle
//            int i, j;
//            for( i = 0, j = 10; i<10 && j>0; i++, j--){
//                System.out.println("i = " + i + " :: " + "j = " + j);
//            }
//            System.out.println("Valor de i al acabar el bucle: " + i);

            // Pide 10 valores por pantalla y los imprime, si uno de eso valores
            //es negativo, no imprime ni pide los valores (break, cuando se cumple
            // la condicion en la que está break, se sale del bucle automaticamente)
            
//            for(int i = 1; i<=10; i++){
//            System.out.print("Inserte un número: ");
//            int number = sc.nextInt();
//                System.out.println("El número elegido es: " + number);
//            if (number<0){
//                System.out.println("Has introducido un número negativo.");
//                break;
//            }
//            }
            // con el continue, cuando se cumple la condicion en la que está el 
            //continue, no ejecuta las lineas por debajo del continue y pasa a la
            //siguiente iteración
            //Imprimir los multiplo de 3 menores que 25
//            
//            for(int i = 3; i<25; i++){
//                if(i%3 != 0){
//                    continue;
//                }
//                System.out.println(i);
//            }
//            
            //forma mas eficiente
//            for(int i = 3; i<25; i+=3){
//                System.out.println(i);
//            }    

        sc.close();
    }//end main
}//enda class