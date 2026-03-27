/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal1= new Animal("Perro", 13);
        
        System.out.println(animal1.getClass());
        
        
        
        Oviparo pinguino= new Oviparo(false, false, "Pinguino",4);
        
//      intancia de un animal a partir de un mamifero
        Animal prueba= new Mamifero("Gris", 4, "Prueba",10);
        
        Animal perro= new Mamifero("Gris", 4, "Rex",10);
        
        System.out.println(prueba);
        
        prueba.comer();
        
        
        Animal [] zoo={pinguino, prueba, perro, animal1};
        
        
        for(int i=0; i<zoo.length; i++){
            System.out.println(zoo[i]);
        }
        
        /*instancia de un mamifero a partir de un animal
        
        Mamifero vaca= (Mamifero) new Animal("Vaca",2);
        
        System.out.println(vaca);
        
        No funciona, es normal, no se puede hacer al reves
        */
        
        
        
    }//end main
    
}//end class