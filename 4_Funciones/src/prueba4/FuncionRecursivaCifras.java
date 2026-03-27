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
public class FuncionRecursivaCifras {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Le pedimos al usuario un numero entero para llevar a cabo el ejercicio
        System.out.print("Ingrese un numero entero (grande a poder ser): ");
        
        int number= sc.nextInt();
        
            System.out.println(sumaFuncionRecursiva(number));
        
        
        sc.close();
    }//end main

 static int sumaFuncionRecursiva(int number){
        if(number==0){
            return 0;
        }else{
            return (number%10) + sumaFuncionRecursiva(number/10);
        }
    }//end funcionPar
    
}//end class