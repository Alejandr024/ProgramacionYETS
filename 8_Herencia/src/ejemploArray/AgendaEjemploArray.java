/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploArray;

import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class AgendaEjemploArray {
    PersonaEjemploArray[] personas;

    public AgendaEjemploArray(PersonaEjemploArray[] personas) {
        this.personas = personas;
    }
    
    public void insert(PersonaEjemploArray persona, int indice){
        personas= Arrays.copyOf(personas, personas.length+1);
        
        for(int i=personas.length-1; i>indice;i--){
            personas[i]= personas[i-1];
        }
        
        personas[indice]=persona;
        
    }

    public void insert(PersonaEjemploArray persona){
        insert(persona,0);
    }
    
    
    @Override
    public String toString() {
        String texto= "Personas de la agenda: \n";
        
        for(int i =0; i<personas.length;i++){
            texto+= personas[i] + " \n";
        }
        return texto;
    }
    
    
}//end class