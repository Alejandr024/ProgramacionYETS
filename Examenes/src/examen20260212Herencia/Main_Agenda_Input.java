package examen20260212Herencia;

import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Main_Agenda_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contacto[] contactos = new Contacto[8];
        contactos[0] = new Contacto("Homer", "Simpson", 5550001);
        contactos[1] = new Contacto("Marge", "Simpson", 5550002);
        contactos[2] = new Contacto("Bart", "Simpson", 5550003);
        contactos[3] = new Contacto("Lisa", "Simpson", 5550004);
        contactos[4] = new Contacto("Maggie", "Simpson", 5550005);
        contactos[5] = new Contacto("Ned", "Flanders", 5550006);
        contactos[6] = new Contacto("Montgomery", "Burns", 5550007);
        contactos[7] = new Contacto("Waylon", "Smithers", 5550008);
        
        // Crea un objeto agenda a partir del array de Contactos
        // Muestra contenido de la agenda
        
        //No funciona el toString, no medio tiempo de probar lo demas.
        
        Contacto milhouse =   new Contacto("Milhouse", "VanHouten", 5550010);
        Contacto krusty = new Contacto("Krusty", "ElPayaso", 5550009);
        
        
        System.out.println(" Contactos sin fechas\n Nombre\t Apellido \tTelefono");
        System.out.println(Arrays.toString(contactos));
        
        
        Agenda agenda1= new Agenda(contactos);
        System.out.println("Contactos con fecha\n Fecha\t Nombre\t Apellido\t Telefono");
        
        System.out.println(agenda1);
        // mostrar que ocurre
        
        System.out.println("\n=== Se añade a Milhouse a la agenda ===");
        
        
        
        System.out.println("=== Contenido de la Agenda depués de añadir a Milhouse ===");
         
        System.out.println("=== Intento de eliminar a Milhouse ===");
        // eliminar a Milhouse
        
         System.out.println("=== Contenido de la Agenda después de eliminar a Milhouse ===");
        
        
        System.out.println("\n=== Se añade a Krusty con fecha manual a la agenda ===");

    }//end main
    
}//end class