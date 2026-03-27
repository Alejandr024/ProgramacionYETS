package Examen1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alejandro Miguel Gómez González
 */
public class Ejercicio3_Dieta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);// uso de input para hacer el 
        //ejercicio.
        
       System.out.println("Introduzca el dipo de dieta que tiene: \n"
               + "1: Vegetariana \n"
               + "2: Vegana \n"
               + "3: Alérgico al marisco \n"
               + "4: Omnívora (Como de todo)");// Le pedimos al 
       //usuario que introzuca su dieta.
       
       int dieta = entrada.nextInt();// Le damos la portunidad de
       //intoroducirlo.
       if(dieta>4){
           System.out.println("No se halla otra dieta diferente al mostrado.");
       } else {
           System.out.println("Su dieta es la número: " + dieta);//comprobamos 
           //que esté correcto.
       }
       
       System.out.println("Ahora elige el alimento para ver si corresponde"
               + "con tu dieta: \n"
               + "1: Carne \n"
               + "2: Pescado \n"
               + "3: Gambas \n"
               + "4: Langosta \n"
               + "5: Huevo \n"
               + "6: Lechuga \n"
               + "7: Tomate");// Le pedimos al usuario que 
       //eliga un alimento que pueda comer
      
       int food = entrada.nextInt();
    
       if(food>7){
           System.out.println("No se halla otro alimento diferente al mostrado.");
       } else{
          System.out.println("La comida que ha elegido es la numero:" + food);
        //comprobamos que este correcto. 
       }
       
       if(dieta== 1){// si es vegetariano, analizamos cuales comidas no puede 
           //comer y cuales sí
        switch(food){
            case 1, 2, 3, 4->System.out.println("La comida que has elegido es "
                    + "imcompatible para usted.");
            case 5, 6, 7->System.out.println("La comida que has elegido es "
                    + "compatible para usted.");
        }
       }
       if(dieta== 2){// si es vegano, analizamos cuales comidas 
           //no puede comer y cuales sí
        switch(food){
            case 1, 2, 3, 4, 5, 6->System.out.println("La comida que has elegido es "
                    + "imcompatible para usted.");
            case 7->System.out.println("La comida que has elegido es "
                    + "compatible para usted.");
        }
       }
       
       if(dieta== 3){// si es alérgico al marisco, analizamos cuales comidas 
           //no puede comer y cuales sí
        switch(food){
            case 2, 3, 4->System.out.println("La comida que has elegido es "
                    + "imcompatible para usted.");
            case 1, 5, 6, 7->System.out.println("La comida que has elegido es "
                    + "compatible para usted.");
        }
       }
       
       if(dieta== 4){// si es omnivoro, pues come de todo
        switch(food){
            case 1, 2, 3, 4, 5, 6, 7->System.out.println("La comida que has elegido es "
                    + "compatible para usted.");
        }
       }
    }//end main   
}//end class