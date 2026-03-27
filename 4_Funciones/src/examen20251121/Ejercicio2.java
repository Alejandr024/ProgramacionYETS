/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen20251121;

import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
        Creamos un menu para ofrecer al usuario las opciones que puede hacer y 
        ademas creamos la varibable de la opcion para que el bucle pueda 
        funcionar de forma correcta.
        */
          int opcion=0;
         do{
            System.out.println("""
                               ---Menu suma digitos---
                               1. Calcular de forma iterativa
                               2. Calcular de forma recursvia.
                               0. Salida.""");
            
            //le pedimos al usuario que quiere usar por medio de la variable "opcion".
            opcion= sc.nextInt();
            
            //Si la opcion es diferente a lo que se ofrece el menu, salta un error.
            if(opcion!=1 && opcion!=2 && opcion!=0){
                System.out.println("Error, opcion no encontrada. Por favor, vuelva a intentarlo más tarde.");
            }
            //al elegir la opcion 1, se le pide al usuario un numero entero para hacer el calculo
            if(opcion==1){
               System.out.print("Ingrese un numero entero (grande a poder ser): ");
               int number= sc.nextInt();
                System.out.println("El resultado de forma iterativa da " + sumarDigitos(number) + ".");
            //al elegir la opcion 1, se le pide al usuario un numero entero para hacer el calculo
            }else if(opcion==2){
                System.out.print("Ingrese un numero entero (grande a poder ser): ");
                int number= sc.nextInt();
                System.out.println("El resultado de forma recursiva da " + sumarDigitosRecursivamente(number) + ".");
            }
         }while (opcion>0);
         //al elegir la opcion 0, el programa sale del bucle e imprime el siguiente mensaje:
            System.out.println("Saliendo del programa...");
    }//end main

       //Funcion de la suma de digitos de forma iterativa.
        static int sumarDigitos(int number){
            
            //creamos la variable "resultado" para que nos vama sumando cada digito
            int resultado=0;
            //creamos un do-while como indica el ejercicio.
            do{
                /*
                agregamos a resultado el ultimo digito del numero que ingreso
                el usuario y se suma con el resultado
                */
                resultado+=number%10;
                
                //quitamos el ultimo digito, ya que ahora ya no es necesario
                number= number/10;
            }while(number>0);//el bucle se cumple siempre y cuando el numero
            //que ingreso el usuario anteriormente
         
            return resultado;//devuelve el resultado
        }//end sumarDigitos
        
        
        //funcion de la suma de digitos de forma recursiva.
        static int sumarDigitosRecursivamente(int number){
        //creamos el caso base.
        if(number==0){
            return 0;
        }else{
            //si no se cumple el caso base, se hace la recursiva.
            return (number%10) + sumarDigitosRecursivamente(number/10);
        }
    }//end funcionPar
}//end class