/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba4;
import java.util.Scanner;
/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class CorreccionEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Le solicitamos al usuarios la base del triangulo
        System.out.print("Introduce la base (number) del triangulo (debe ser un numero entero positivo): ");
        
        int number= sc.nextInt();

//        Creamos un bucle for para rea el triangulo. tenemos varias fase:
        
         //la "i" se encarga de formar cada fila para que vaya de forma correcta.
         for(int i= 1; i<=number; i++){
        // Por otro lado, tenemos a j, se encarga de sumar la cantidad de numero 
        //que vaya haber en cada fila.
            for(int j= 1; j<=i; j++){
                //El while se encarga de que la j sea diferene a 0, para que sea
                //un bucle infinito aposta, pues queremos imprimir solo los multiplos de 3
                // Si no encuentra un multiplo, lo salta y vuelve al bucle de nuevo
                //Cuando encuentra un multiplo, lo imprime y rompe el bucle.
                 while(j!=0){
                int randomNumber= (int) ((Math.random()*10) +1);
                if(randomNumber%3!=0){
                    continue;
                }
                    System.out.print(randomNumber);
                    break;
              }
            }
            //Por ultimo, tenemos este print que se encarga de que no este pegado 
            //al numero el mensaje predeterminado despues de acabar el programa
            System.out.println(" ");
        }
    }//end main
}//end class