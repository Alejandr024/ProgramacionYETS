package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P12_08_ListaAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Integer> listaEnteros = new ArrayList<>();

        while (listaEnteros.size() < 20) {
            int number = (int) (Math.random() * 10 + 1);
            listaEnteros.add(number);
        }
        System.out.println("Lista: ");
        System.out.println(listaEnteros);

        System.out.println("--------------");
        //Convertir de Coleccion a array
        Integer[] arrayEnteros = listaEnteros.toArray(new Integer[0]);
        System.out.println("Array: ");
        System.out.println(Arrays.toString(arrayEnteros));

        //Ordenar el array
        Arrays.sort(arrayEnteros);

        System.out.println("--------------");
        System.out.println("Array ordenado: ");
        System.out.println(Arrays.toString(arrayEnteros));

        Collection<Integer> listaCreciente = new ArrayList<>();
        // Convierto el array en una coleccion
        listaCreciente.addAll(Arrays.asList(arrayEnteros));

        System.out.println("--------------");
        System.out.println("Coleccion desde un array ordenado: ");
        System.out.println(listaCreciente);

        Comparator<Integer> ordenCreciente = new Comparator<>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1 - num2; // cambiar a 'num1 - num2' para orden ascendente
            }
        };
        
        System.out.println("--------------");
        System.out.println("Coleccion del principio siendo ordenado: ");
        listaEnteros.sort(ordenCreciente);//la lsta tiene que ser una lista, mas no un collection, pues el sor es parte de la lista
        System.out.println(listaEnteros);
        
        
    }//end main

}//end class
