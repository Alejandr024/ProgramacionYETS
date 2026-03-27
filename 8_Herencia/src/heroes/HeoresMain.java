/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heroes;

/**
 *
 * @author Daw1
 */
public class HeoresMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Superheroe spiderMan= new Superheroe("SpiderMan", "Marvel", 7, "Peter Parker");
        
        Superheroe batMan= new Superheroe("BatMan", "DC", 5, "Bruce Wayne");
        
        spiderMan.presentarse();
        batMan.presentarse();
        
        spiderMan.detiene("Misterio", "Marvel");
        
        spiderMan.isLibre("Misterio");
        
        
        spiderMan.revelaIdentidad();
        
        System.out.println(spiderMan);
        
        
        
        
        
    }//end main
    
}//end class