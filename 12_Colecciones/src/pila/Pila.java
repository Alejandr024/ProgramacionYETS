package pila;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public interface Pila<T> {
    public void push(T nuevo);// agregar al final
    public T pop();//extraer en valor del final
    public T peek(); //mirar
}//end class