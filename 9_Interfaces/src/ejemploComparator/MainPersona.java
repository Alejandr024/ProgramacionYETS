/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploComparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Daw1
 */
public class MainPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Persona nuevo= new Persona("Ana","Perez","Alcantara");
        
        Persona[] arrayPersonas= {new Persona("Xavi", "Crespo", "Glez"), new Persona("Ana", "Perez", "Perez"), new Persona("Carlos", "Alonso", "F1"), nuevo};
      
        System.out.println(Arrays.toString(arrayPersonas));
        
        Comparator<Persona> porApellidos = Comparator.comparing(Persona::getApellido1).thenComparing(Persona::getApellido2).reversed();
        
        Arrays.sort(arrayPersonas, porApellidos);
        
        System.out.println("Ordenado por nombre");
        System.out.println(Arrays.toString(arrayPersonas));
        
        
        
//        
//        ComparaApellidos c = new ComparaApellidos();
//        
//        Arrays.sort(arrayPersonas,c);
//        
//        System.out.println(Arrays.toString(arrayPersonas));
    }
    
    
}
