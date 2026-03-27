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
public class PatasAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner pata_hormiga = new Scanner(System.in);
        System.out.println("Introduce las hormigas capturadas en el día de hoy:");
        int hormiga = pata_hormiga.nextInt();
        System.out.println(hormiga);
        
        int hormigaTotal = hormiga * 6;
        
        Scanner pata_arana = new Scanner(System.in);
        System.out.println("Introduce las arañas capturadas en el día de hoy:");
        int arana = pata_arana.nextInt();
        System.out.println(arana);
        
        int aranaTotal = arana * 8;
        
        Scanner pata_cochinilla = new Scanner(System.in);
        System.out.println("Introduce las cochinillas capturadas en el día de hoy:");
        int cochinilla = pata_cochinilla.nextInt();
        System.out.println(cochinilla);
        
        int cochinillaTotal = cochinilla * 14;
        
        int pataTotal = hormigaTotal + aranaTotal + cochinillaTotal;
        
        System.out.println("El número de hormigas capturadas en el día de hoy  es de " + hormiga + ". Su total de patas es de " + hormigaTotal + ".");
        
        System.out.println("El número de arañas capturadas en el día de hoy  es de " + arana + ". Su total de patas es de " + aranaTotal + ".");
        
        System.out.println("El número de cochinillas capturadas en el día de hoy  es de " + cochinilla + ". Su total de patas es de " + cochinillaTotal + ".");
        
        System.out.println("El total de patas de todos lo animales capturados en el día de hoy es de " + pataTotal + ".");
    }
    
}
