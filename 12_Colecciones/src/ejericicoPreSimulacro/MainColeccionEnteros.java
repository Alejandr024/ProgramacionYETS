package ejericicoPreSimulacro;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class MainColeccionEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 1, 4, -3, -5, -7, 15, 20, 11};

        Set<Integer> conjunto = new HashSet<>();

        for (int entero : x) {
            if (entero > 0) {
                conjunto.add(entero);
            }
        }
        System.out.println("Solo positivos");
        System.out.println(conjunto);
        System.out.println("Mostrar impares");
        for (int entero : conjunto) {
            if (entero % 2 != 0) {
                System.out.println(entero + " ");
            }
        }
        Iterator<Integer> it = conjunto.iterator();

        while (it.hasNext()) {
            if (it.next() > 10) {
                it.remove();
            }
        }
        System.out.println(conjunto);
    }

}//end class
