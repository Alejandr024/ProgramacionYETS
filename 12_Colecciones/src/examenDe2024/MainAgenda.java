package examenDe2024;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class MainAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    boolean condicion= false;
        do {
            
            condicion= false;
            Agenda agenda = new Agenda();
            agenda.agregar();
            
        } while(!condicion);

    }//end main

}//end class