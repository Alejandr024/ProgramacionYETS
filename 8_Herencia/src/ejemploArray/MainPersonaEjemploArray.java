/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploArray;

import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class MainPersonaEjemploArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaEjemploArray[] arrayPersonas= {new PersonaEjemploArray("Xavi", "Crespo", "Glez"), new PersonaEjemploArray("Ana", "Perez", "Perez"), new PersonaEjemploArray("Carlos", "Alonso", "F1")};
        
        
        
        
//        System.out.println(Arrays.toString(arrayPersonas));
//        
//        Arrays.sort(arrayPersonas);
//        
//        System.out.println(Arrays.toString(arrayPersonas));
        
        AgendaEjemploArray agenda= new AgendaEjemploArray(arrayPersonas);
        agenda.insert(new PersonaEjemploArray("Lola", "Torres", "Skbidi"));
        
        System.out.println(agenda);
//        System.out.println(Arrays.toString(arrayPersonas));
    }
    
    
}
