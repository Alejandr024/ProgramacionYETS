/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registroPersonas;

/**
 *
 * @author alej3
 */
public class Main_Registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        PersonaRegistro juan = new PersonaRegistro("Vega", 33333, "Santa Cruz");
        PersonaRegistro juan1 = new PersonaRegistro("Vega", 33333, "Santa Cruz");
        PersonaRegistro eva = new PersonaRegistro("eva", 44444, "La laguna");

        
        PersonaRegistro[] listaPersonas= {juan,juan1,eva};
        
    }//end main
    
}//end class
