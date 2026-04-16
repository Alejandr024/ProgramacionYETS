package pila;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public interface Pila<T> {
    public void push(T nuevo);
    public T pop();
    public T peek();
}//end class