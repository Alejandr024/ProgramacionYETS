/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploCompare;

import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class HeoresMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Marvel spiderMan= new Marvel("SpiderMan", 
                "Marvel", 7, "Peter Parker", 
                Marvel.Universe.MARVELMAIN, 
                true);
        
        DC batMan= new DC("BatMan", 
                "DC", 5, "Bruce Wayne", 
                "Gotham", 
                DC.Personalidad.JUSTICIERO);
        
        spiderMan.presentarse();
        batMan.presentarse();
        
        spiderMan.detiene("Misterio", "Marvel");
        
        spiderMan.isLibre("Misterio");
        
        
        spiderMan.revelaIdentidad();
        
        
        
        Superheroe [] array= {spiderMan,batMan};
        
        Arrays.sort(array);
        
        System.out.println(Arrays.toString(array));   
        
    }//end main
    
}//end class