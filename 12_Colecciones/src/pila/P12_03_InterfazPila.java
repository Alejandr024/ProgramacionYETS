package pila;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P12_03_InterfazPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pila sin hacer
        //Pila<Integer> pila= new Contenedor<>(new Integer[0]);

        Integer[] arrayEnteros = {1, 2, 3, 4};

        Pila<Integer> pila = new Contenedor<>(arrayEnteros);

        pila.push(19);
        System.out.println(pila);

        System.out.println(pila.pop());

        //pila ya hecha
        Stack<Double> pilaHecha = new Stack<>();
        pilaHecha.push(7.3);
        pilaHecha.push(8.3);
        System.out.println(pilaHecha);

        //Creacion de pila usando Deque y ArrayDeque
        Deque<String> pilaString = new ArrayDeque<>();
        pilaString.push("Tomate");
        pilaString.push("Papa");
        pilaString.push("Platanos");
        System.out.println(pilaString);

    }//end main

}//end class
