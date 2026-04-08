package contenedor;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Contenedor<T>{//mejor usar "T" parra estos casos
    private T object;

    public Contenedor() {
    }
    
    void guardar(T object){
        this.object=object;
    }
    
    T extraer(){//no sabemos que dato se va a utilizar
        T resultado= object;
        object=null;
        return resultado;
    }
    
}//end class