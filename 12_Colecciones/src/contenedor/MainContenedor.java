package contenedor;

import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class MainContenedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contenedor<String> contenedorTexto= new Contenedor<>();//Se puede poner otra vez "String" en "Contenedor<>()", pero sería redundante.
        contenedorTexto.guardar("Hola");
        
        System.out.println(contenedorTexto.extraer());
        
        Contenedor<String[]> arrayString= new Contenedor<>();
        String[] arrayTexto={"Hola","Mundo"};
        arrayString.guardar(arrayTexto);
        System.out.println(Arrays.toString(arrayString.extraer()));
        
        Contenedor<Integer> contenedorInt= new Contenedor<>();        
        contenedorInt.guardar(17);
        
        ContenedorDoble<String,Double[]> doble= new ContenedorDoble<>();        
        Double[] arrayDouble ={12.,14.,15.};
        doble.guardar("Hola", arrayDouble);
        
       for(double aux: arrayDouble){//tienen que ser del mismo tipo de dato.
           System.out.println(aux);
       }
        
    }//end main
    
}//end class