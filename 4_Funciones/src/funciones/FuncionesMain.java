/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;
/**
 *
 * @author Alejandro Gómez
 */
public class FuncionesMain { //No pasa nada si ponemos la funcion antes o despues
////    del main, funcionará igualmente.
////    
////    
////    // Función factorial
//   static int factorial(int number){
//       int fact= 1;
//       
//       for (int i = 1; i <= number; i++) {
//            fact *=i;
//        }
//       return fact;
//   }//end factorial
//    
//    
//    //funcion aleatorio
//    static int aleatorio(int inicio, int fin){
//        int valores = fin - inicio +1;
//        double real = Math.random()*valores +3;
//        int resultado = (int) real;
//        return resultado;
//        
//        
//    }
//        //Funcion menu
//    //void no devuelve nada
//    static void menu (){
//        System.out.println("""
//                        Elige una operación de la lista: 
//                        A: Sumar
//                        B: Restar
//                        C: Multiplicar
//                        D: Dividir
//                        """);
//        
//        
//        
//    }//end menu
        
        /*
        Funcion que calcule el importe de una facutra aplicandole el IGIC por 
        defecto (IGIC=7%)
        Sobracarga la funcion para facturar en peninusla sabiendo que el 
        impuesto es el 21% (IVA)
        */
        
        
        
        static double impuesto(double precio){
            double total = 0;
            
            total = precio*1.07;
            
            
            return total;
        }
        
        static double impuesto(double precio, double tasa){
            double total = 0;
            
            total = precio*(1+ tasa/100);
            
            
            return total;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               
        
        double igic=  0.07;
        double iva =  0.21;
        double tasa = 0;
        System.out.println("¿Cuanto cuesta? ");
        
        double precio = sc.nextDouble();
        
        System.out.println("""
                           De donde eres?:
                           1: Canarias
                           2: Peninsula""");
        
        double opcion = sc.nextByte();
        
        if(opcion==1){
            opcion= igic;
            tasa = opcion;
            System.out.println("Precio con impuesto de canarias: " + impuesto(precio, tasa));
        } else if(opcion==2){
            opcion = iva;
            tasa= opcion;
            System.out.println("Precio con impuesto de la peninsula: " + impuesto(precio, tasa));
        } else{
            System.out.println("Precio con impuesto: " + impuesto(precio));
        }
        
//        int number = 4;
       
        
//        System.out.println("El factorial de " + number + " es " + factorial(number) + ".");
////        menu();
//
//        //imprimir numero aleatorio entre 0 y 4.
//        System.out.println("Número aleatorio: " + aleatorio(0,4));
//        sc.close();

        

          
    }//end main    
}//end class
