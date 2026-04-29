package simulacro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class ProcesamientoDatosHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] numeros = {12, 45, 23, 78, 23, -9, 50, 18, 9, -15, 60, 10, 45, 70};

        System.out.println("Toddos los numeros: ");
        System.out.println(Arrays.toString(numeros));

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numeros));
        HashSet<Integer> numerosSinDuplicar = new HashSet<>(numerosList);

        System.out.println("----------");
        System.out.println("Numeros sin duplicar: ");
        System.out.println(numerosSinDuplicar);

        System.out.println("--------");

        Iterator<Integer> it = numerosSinDuplicar.iterator();
        System.out.println("Mantener numeros positivos y sin dupllicar: ");

        while (it.hasNext()) {
            if (it.next() < 0) {
                it.remove();
            }
        }

        System.out.println(numerosSinDuplicar);

        System.out.println("Mostras impares con colleccion original: ");

        for (Integer number : numeros) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        System.out.println("Mostar valores mayores que 50 con un iterator: ");
        Iterator<Integer> itMayor = numerosList.iterator();

        while (itMayor.hasNext()) {
            if (itMayor.next() <= 50) {
                itMayor.remove();
            }
        }
        System.out.println(numerosList);

        Set<Integer> conjuntoOrdenado = new TreeSet<>(numerosSinDuplicar);
        Comparator<Integer> inverso = Comparator.reverseOrder();
        Set<Integer> ordenInverso = new TreeSet<>(inverso);
        ordenInverso.addAll(conjuntoOrdenado);

        System.out.println("------------------");
        System.out.println("Elemento ordenados de forma descendente: ");
        System.out.println(ordenInverso);
    }//end main

}//end class
