package contenedorLista;

import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P12_02_MainContenedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contenedor<String> cString=new Contenedor<>(new String[0]);
        
        cString.agregarPrincipio("Uno");
        cString.agregarPrincipio("Dos");
        cString.agregarPrincipio("Tres");
        
        for(String texto: cString.getObjetos()){
            System.out.println(texto);
        }
    }//end main
    
}//end class