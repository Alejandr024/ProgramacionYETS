package ejemplosInterfaces;

import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class MainInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Volador gavi= new Gaviota("Gavi",3);
        Avion binter= new Avion("ATR72", 1999);
        Volador interfaz= new Avion("Prototipo",2026);
        
        Volador[] aereos= {gavi,binter,interfaz};
        
        System.out.println(Arrays.toString(aereos));
        
        binter.altura(2000);
        gavi.altura(3000);
        
        
        
    }//end main
    
}//end class