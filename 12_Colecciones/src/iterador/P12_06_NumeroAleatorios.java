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

        int contador=0;
        
//        while (enteros.remove(5)) {
//            contador++;
//        }
//        System.out.println("Numeros despues de eliminar el 5: " + enteros +". Ha eliminado "+ contador + " veces el 5.");

        //con el It

        int contadorIt=0;
        
        for(Iterator<Integer> it= enteros.iterator(); it.hasNext();){// hay que reiniciar el programa para que funcione
            if(it.next()==5){
                it.remove();
                contadorIt++;
            }
        }
        
        System.out.println("Con el it: " + enteros + ". Se han eliminador " + contadorIt + " veces el 5.");
    }//end main

}//end class
