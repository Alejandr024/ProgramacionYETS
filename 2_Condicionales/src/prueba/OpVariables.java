/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class OpVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número para 'a', 'b', 'c', y 'x': ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int x = entrada.nextInt();
                  
        int y;
        y = (int) (a * Math.pow(x, 2)) + b *x + c;
        
        System.out.println("El resultdo de y= a*x^2+b*x+c es de: " + y + ".");
        
    }
    
}
