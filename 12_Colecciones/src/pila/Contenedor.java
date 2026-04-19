package pila;

import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 * @param <T>
 */
//aunque comparabla sea una interfaz, si utilizo un generico "<T>", pongo un extends en vez de implements
public class Contenedor<T extends Comparable<T>> implements Pila<T> {

    private T[] arrayObjects;

    public Contenedor(T[] object) {
        this.arrayObjects = object;
    }

    @Override
    public void push(T nuevo) {
        this.arrayObjects = Arrays.copyOf(arrayObjects, arrayObjects.length + 1);
        arrayObjects[arrayObjects.length - 1] = nuevo;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (T i : arrayObjects) {
            resultado += i + " ";
        }
        return resultado;
    }

    @Override
    public T pop() {

        T aux = arrayObjects[arrayObjects.length - 1];

        System.out.println("Valor del final: " + arrayObjects[arrayObjects.length - 1]);

        arrayObjects = Arrays.copyOf(arrayObjects, arrayObjects.length - 1);

        return aux;
    }

    @Override
    public T peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}//end class
