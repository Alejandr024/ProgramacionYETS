package examen20260212Herencia;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Main_WalkingDead_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear humanos (personajes de la serie)
        Humano rick   = new Humano("Rick Grimes",1, 40);
        Humano daryl  = new Humano("Daryl Dixon", 1, 35);
        Humano carol  = new Humano("Carol Peletier", 2, 45);
        Humano negan  = new Humano("Negan", 2, 45);
        Humano maggie = new Humano("Maggie Greene", 2, 32);

        // Crear zombis
        Zombi walker1 = new Zombi(1, 30);
        Zombi walker2 = new Zombi(2, 25, 1);

        //Mostrar situación inicial sobre infección de humanos
        System.out.println("=== Situación inicial ===");
        rick.infectado(rick);
        daryl.infectado(daryl);
        carol.infectado(carol);
        negan.infectado(negan);
        maggie.infectado(maggie);
        walker1.tipo();
        walker2.tipo();
        //Mostrar resultado de contacto entre rick  y  el zombie walker1 
        
        System.out.print("El Humano " + rick.nombre);
        
        rick.contacto(walker1);

        
        // Fuerzo infección para Rick
        System.out.println("Fuerzo infección para Rick (en caso de que no hubiera infectado en el contacto anterior");
        
        System.out.print("El humano " + rick.nombre);
        rick.cambiarInfectado();
        
        System.out.println("=== Contacto Rick - Daryl (humano-humano) ===");
        
        rick.contacto(daryl);
        
        //Mostrar resultado de contacto entre Carol y Maggie (ambas sanas) 
        System.out.println("=== Contacto Carol - Maggie (ambas sanas) ===");
        
        carol.contacto(maggie);
        System.out.println("=== Contacto Negan con Daryl(el 2º infectado) ===");
        
        negan.contacto(daryl);

        System.out.println("=== Evolución de walker1  y walker2 ===");
        
        walker1.evoluciona();
        walker2.evoluciona();
        
        
    }//end main
    
}//end class