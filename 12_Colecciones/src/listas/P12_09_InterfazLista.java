package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P12_09_InterfazLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        System.out.println("Ingrese valores enteros:");

        int number = sc.nextInt();

        while (number >= 0) {
            lista.add(number);
            number = sc.nextInt();
        }

        

        if (lista.size() == 0) {
            System.out.println("No hay elemento en la lista");
        } else {
            System.out.println("Numero introducidos que sean pares:");
            for (int elemento : lista) {
                if (elemento % 2 == 0) {
                    System.out.println(elemento);
                }
            }

            System.out.println("Todos los valores de la lista multiplicados por 100:");

            for (int elemento : lista) {
                System.out.println((elemento * 100));
            }

        }

    }//end main

}//end class
