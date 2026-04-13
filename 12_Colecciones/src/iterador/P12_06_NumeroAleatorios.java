package iterador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P12_06_NumeroAleatorios {

    /**
     * Implementar una aplicación donde se insertan 100 números enteros
     * aleatorios entre 1 y 10 (incluidos), que pueden estar repetidos, en una
     * colección. Después se eliminan todos los elementos que valen 5. Mostrar
     * la colección antes y después de la eliminación. Hacerlo con y sin
     * iterator.;
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection<Integer> enteros = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            int number = (int) (Math.random() * 10 + 1);
            enteros.add(number);
        }
        System.out.println("Numeros antes de eliminar el 5: " + enteros);

        while (enteros.remove(5)) {

        }
        System.out.println("Numeros despues de eliminar el 5: " + enteros);

        //con el It
        Iterator<Integer> enterosIt = enteros.iterator();

//        while(enterosIt.hasNext()){
//            int number= enterosIt.next();
//            if(number==5){
//                enterosIt.remove();
//            }
//        }
//        
//        System.out.println("Con el it: " + enteros);
    }//end main

}//end class
