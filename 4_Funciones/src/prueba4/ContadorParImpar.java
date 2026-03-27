/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba4;

import java.util.Scanner;

/**
 *
 * @author alej3
 */
public class ContadorParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Le pedimos al usuario un numero entero para llevar a cabo el ejercicio
        System.out.print("Ingrese un numero entero (grande a poder ser): ");
        
        int number= sc.nextInt();
        
        System.out.println("El numero de cifra pares que hay en el numero " + number + " es: " + funcionPar(number));


        System.out.println("El numero de cifra impares que hay en el numero " + number + " es: " + funcionImpar(number));
        sc.close();
    }//end main
    
    
    //Creamos una funcion que funciona para contar las cifras pares que hay en el numero.
    static int funcionPar(int number){
        int contadorPar= 0;//Creamos un contado para llevar la cuenta de cuantas cifras impares hay.
        //hacemos un bucle para comprobrar cada cifra si son impare.
        while(number>0){
        int digito= number%10;//sacamos la ultima cifra del numero.
            if(digito%2==0){
                contadorPar++;//sumamos 1 cuando haya una cifra par.
            }
            number= number/10;//dividimos ente 10 para ir por cada cifra.
        }
        
        return contadorPar;
    }//end funcionPar
    
    //Creamos una funcion que funciona para contar las cifras pares que hay en el numero.
    static int funcionImpar(int number){
        int contadorImpar= 0;//Creamos un contado para llevar la cuenta de cuantas cifras impares hay.
        //hacemos un bucle para comprobrar cada cifra si son impare.
        while(number>0){
            int digito= number%10;//sacamos la ultima cifra del numero.
            if(digito%2!=0){
                contadorImpar++;//sumamos 1 cuando haya una cifra impar
            }  
            number= number/10;//dividimos ente 10 para ir por cada cifra.
        }
        
        return contadorImpar;
    }//end funcionImpar
}//end class
