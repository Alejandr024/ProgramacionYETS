package ejemplosInterfaces;

/**
 *
 * @author Daw1
 */
 public interface Volador {
    
    abstract public void mostrar();
    
    abstract public void saludar(String mensaje);
    
    boolean vuela();
    
    default void altura(int altura){
        System.out.println("Está volando a la altura " + altura +" metros.");
    }
    
}//end class