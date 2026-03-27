package jugador;
import java.util.Arrays;
/**
 *
 * @author Daw1
 */
public class JugadorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jugador batman = new Jugador("Batman", 5);
        Jugador wonderWoman= new Jugador("Wonder Woman", 10);
        Jugador joker= new Jugador("Joker", 6);
        Jugador pinguino= new Jugador("Pinguino", 6);
        
        //Metodo estatico por eso se le llama con el nombre de la clase, no del objeto.
        
        try{
            Jugador.combate(batman, wonderWoman);
            Thread.sleep(5*1000);
            
            Jugador.combate(batman, joker);
            Thread.sleep(5*1000);
            
            
            Jugador.combate(batman, pinguino);
            Thread.sleep(5*1000);
            
            System.out.println("Historial de combate de "+ batman.getName() + ": " + Arrays.toString(batman.getArrayCombates()));
            Thread.sleep(5*1000);
            System.out.println("Historial de combate de "+ wonderWoman.getName() + ": " + Arrays.toString(wonderWoman.getArrayCombates()));
            Thread.sleep(5*1000);
            System.out.println("Vidas de Batman: " + batman.getVida());
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
        
        
    }//end main
    
}//End class