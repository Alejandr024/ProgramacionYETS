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
public class RandomCalculoMentalDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int real;
        int respuesta;
        int contador = 0;
        do{
            /*
            Introducimos dos numero randos entre 1 y 100. Luego, le preguntamos 
            al usuario que ingrese un posible número entre 1 y 100, sin decirle 
            los dos números sumados entre sí, para hacerlo más difícil. Si 
            acierta, suma un acierto y se le vuelve a preguntar por posible número 
            entre 1 y 100 con otros dos número randoms. Al fallar, se para el 
            juego y se cuenta los aciertos y, por último, se le muestra cuántos 
            aciertos tuvo el usuario.
            */
       
        int random1=  (int) (Math.random()*100) + 1;
        int random2=  (int) (Math.random()*100) + 1;
        
        real = 0;
        //Hacer lo mismo pero con diferentes oeraciones.
        
            System.out.println("Introduzca una opreación: "
                    + "1: suma\n"
                    + "2: resta\n"
                    + "3: multiplicación\n"
                    + "4: división\n"
                    + "5: salir");
        respuesta = sc.nextInt();
        
        
        
//        if(real==respuesta){
//            contador++;
//        }else{
//            break;
//        }
        }while(real==respuesta);
        
        if(contador==1){
            System.out.println("Has sumando " + contador + " acierto.");    
            }else{
        System.out.println("Has sumado " + contador + " aciertos.");           
    }
    }//end main    
}//end class
