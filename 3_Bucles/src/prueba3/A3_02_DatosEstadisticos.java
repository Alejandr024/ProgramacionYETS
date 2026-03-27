/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;


import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class A3_02_DatosEstadisticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int edad = 0;
         int suma = 0;
         int contador_alumno= 0; //contador de valores de edades
         int contador_mayorEdad= 0;//contador para los mayores de edad

         while(edad >=0){
             System.out.print("Introduce la edad: ");
             edad= sc.nextInt();
             if(edad>=0){
                 suma+=edad;
                 if (edad>=18){
                     contador_mayorEdad++; 
             }
             contador_alumno++;
            }
         }
         float media = (float) suma/contador_alumno; //Debo de hacer un casting para que no trunque la división. 
         System.out.println("La suma de todas las edades da " + suma + ".");
         System.out.println("Por otro lado, la media da " + media + ".");
         
         if(contador_alumno==1){
             System.out.println("Por consiguiente, el número de alumnos es únicamente de " + contador_alumno + ".");
         } else{
         System.out.println("Por consiguiente, el número de alumnos son " + contador_alumno + " alumnos.");
         }
         
         if(contador_mayorEdad==1){
             System.out.println("Por último, solo hay " + contador_mayorEdad + " alumno mayor de edad.");
         } else{
         System.out.println("Por último, los alumnos mayores de edad son " + contador_mayorEdad + " alumnos.");
         }
    }//end main
}//end class
