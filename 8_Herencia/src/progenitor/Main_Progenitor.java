/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progenitor;

/**
 *
 * @author Daw1
 */
public class Main_Progenitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Progenitor juan= new Progenitor("Juan", "Fernandez", "Lopez");
        
        Progenitor maria= new Progenitor("Maria", "Hernandez", "Torres");
        
        
        System.out.println(juan);
        
        Hijo ivan= Progenitor.reproducir(juan, maria);
        
        System.out.println(ivan);
        
        System.out.println("Clon de " + juan.getNombre());
        
        System.out.println(juan.clone());
        
        ivan.cumplir();
        
        System.out.println("Edad de " + ivan.getNombre() + " despues de cumplir años: " + ivan.getEdad());
        
        
        
        
        
    }//end main
    
}//end class