/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba7;
import java.util.Arrays;
/**
 *
 * @author Daw1
 */
public class MainAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Contacto juan = new Contacto("Juan", "Pérez", "5551234", "juan.perez@email.com", false);
       Contacto maria = new Contacto("María", "Gómez", "maria.gomez@email.com", true);
       Contacto carlos = new Contacto("Carlos", "López", "carlos.lopez@email.com", false);
       Contacto maria1 = new Contacto("María", "Gómez", "maria.gomez@email.com", true);
//        System.out.println(juan);
//        System.out.println("--------------------");
//        System.out.println(maria);   
//        System.out.println("--------------------");
//        System.out.println(carlos);
//        
//       


        Contacto [] arrayContactos= {juan,maria};
        
        Agenda agenda= new Agenda(arrayContactos);
        
//        System.out.println(Arrays.toString(agenda.getContactos()));
//        
//        System.out.println(agenda.getContactos().length);
//        System.out.println(agenda.getSocios().length);

        agenda.append(carlos);
        System.out.println(agenda);        
        
        
        System.out.println("Los contactos " + maria.getName() + " y " + maria1.getName() + " son iguales? " + maria.equal(maria1));
    }//end main
    
}//end class