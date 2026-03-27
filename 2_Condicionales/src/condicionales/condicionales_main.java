/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;
import java.util.Scanner;
/**
 *
 * @author Alejandro Gómez
 */
public class condicionales_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
//     System.out.println("Escribe si llueve \"true\" y si no llueve \"false\".");
//        
//     boolean lluvia = sc.nextBoolean();        
//        if (lluvia) {
//            System.out.println("No puedes salir a la calle.");
//        } else {
//            System.out.println("Puedes salir a la calle.");
//        }
//        
//        
//     System.out.println("Escribe la nota del alumno (debe ser un número entre 0 y 10, incluidos los dos: ");
//     int nota = sc.nextInt();
//             
//
//     if (nota<5){
//         System.out.println("Estás suspendido.");
//     } else if (nota >= 5 && nota<7){
//         System.out.println("Estás aprobado.");
//     } else if (nota >= 7 && nota<9) {
//         System.out.println("Tienes un notable.");
//     } else {
//         System.out.println("Tienes un sobresaliente, felicidades!!");
//     }
//     
//     
//   
//     System.out.println("¿Qué temperatura hace?");
//        
//     float temperatura = sc.nextFloat();
//     
//     if(temperatura > 25){
//         System.out.println("A la playa!!!");
//     } else {
//         System.out.println("Me quedo en casa.");
//     }
//     
//       
//       System.out.println("Introduce una opción de menú: "
//               + "\n1 = Papas con costillas y ensaladas. "
//               + "\n2 = Menú vegano. "
//               + "\n3 = Pescado y ensalada.");
//       
//       int menu = sc.nextInt();
//       
//       if (menu==1){
//           System.out.println("Has elegido las papas con costillas y ensaladas.");
//       } else if (menu==2) {
//           System.out.println("Has elegido el Menú vegano.");
//       } else if (menu==3) {
//        System.out.println("Has elgido pescado y ensalada.");
//       } else {
//           System.out.println("Lo siento, solo tenemos estos menús, vuelva a intentralo más tarde.");
//       }
//
//          Operadores ternarios
//        System.out.println("¿Cuanto sacaste?");
//        double nota = sc.nextDouble();
//        String valor = (nota<5)? "Suspendido":"Aprobado";
//        System.out.println("Has "+ valor);
        
        /*
        if(nota<5) valor = "Suspendido";
        else valor = "Aprobado";
        System.out.println("Has "+ valor);
        
        esta forma también vale.
        */
        
       /* Condicionales anidados
       
       System.out.println("Escriba un número entrero : ");
       int n1 = sc.nextInt();
       System.out.println("Escriba un número entero diferente al anterior: ");
       int n2 = entrada.nextInt();
              System.out.println("Escriba un número "
                      + "entero diferente a los dos anteriores: ");
       int n3 = entrada.nextInt();
       
       int mayor = 0;
       int medio = 0; 
       int menor = 0;
       
       if ((n1>n2) && (n1>n3)){
           mayor = n1;
       
           if(n2>n3){
            menor = n3;
            medio = n2;
       }else {
            menor = n2;
            medio = n3;
        }
       } else if ((n2>n1) && (n2>n3)){
           mayor = n2;
       
          if(n1>n3){
            menor = n3;
            medio = n1;
       }else {
            menor = n1;
            medio = n3;
       }
      } else if (n3>n1 && n3>n2) {
           mayor = n3;
           
           if(n2>n1){
               menor = n1;
               medio = n2;
           } else {
               menor = n2;
               medio = n1;
           }
       } else {
            mayor = n1;
            medio = n2;
            menor = n3;
            }
       System.out.println("Los número ordenados de mayor a menor son: " + mayor + 
        ", " + medio + ", " + menor);
       */
       
       
       // Switch = calififcación de notas
       
       System.out.println("Instroduce una nota (en valor entero");
       int mark = sc.nextInt();
       
       switch (mark) {
            case 0, 1, 2, 3, 4 -> System.out.println("Insuficientes");
            case 5 -> System.out.println("Suficiente");
            case 6 -> System.out.println("Bien");
            case 7, 8 -> System.out.println("Notable");
            case 9, 10 -> System.out.println("Sobresaliente");
            default -> System.out.println("Error: nota no válida");
            
       }
    } //end main
} //end class