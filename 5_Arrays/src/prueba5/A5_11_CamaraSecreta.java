
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class A5_11_CamaraSecreta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // n: Longitud de la contrase�a
        int n = 4;
        int [] passwd = new int[n];
        for (int i = 0; i < passwd.length; i++) {
            passwd[i] = (int) (Math.random() * 5) + 1;
        }
        
        System.out.println("Contrase�a real:" + Arrays.toString(passwd));
        Scanner teclado = new Scanner(System.in);
        
        int [] newPass = new int[n];
        int  acierto = 0;
        
        do {
            
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce un digito de la contrase�a");
            newPass[i] = teclado.nextInt();
        }
        
        acierto = 0;
 
        for (int i = 0; i < n; i++) {
            if (passwd[i] < newPass[i]) {
                System.out.println("\n El digito en la posici�n " + (i+1) + " es menor que el introducido");
            } else if (passwd[i] > newPass[i]) {
              System.out.println("\n El digito en la posici�n " + (i+1) + " es     MAYOR que el introducido ");
            } else {
                System.out.println("\n El digito en la posici�n " + (i+1) + " es correcto");
                acierto++;
            }    
        }
        

        } while (acierto != 3);
        
        System.out.println("�Acertaste la contrase�a!");
        
        
        
    }
    
}
