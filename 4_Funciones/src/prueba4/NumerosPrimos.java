package prueba4;

import java.util.Scanner;

/**hace rprograma que calcule si un numeor si es primo o no. Y hacerlo con una 
 * función que se le pase el número a estudiar y devuelva al programa 
 * principal un booleano (true: primo, false: no primo)
 *
 * @author Daw1
 */


public class NumerosPrimos {
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero para comprobar si es primo: ");
        
        int number = sc.nextInt();
        
        boolean respuesta = esprimo(number);
        
        System.out.println(respuesta);    
    }//end main
    
    
    
    static boolean esprimo(int number){
        boolean esprimo = true;

            System.out.print("¿El número " + number + " es primo? ");

            for(int i = 2; i<number; i++){
                if(number%i==0){
                esprimo = false;
                break;
                }
            }
        return esprimo;
    }//end esprimo
    
}//end class