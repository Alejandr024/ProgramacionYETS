package contenedor;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class ContenedorDoble<T,V> {
    private T objeto1;
    private V objeto2;

    public ContenedorDoble() {
    }
    
    void guardar(T objeto1, V objeto2){
        this.objeto1=objeto1;
        this.objeto2=objeto2;
    }
       
    T extraer1(){
        T resultado= objeto1;
        objeto1=null;
        return resultado;
    }
    
    V extraer2(){
        V resultado= objeto2;
        objeto2=null;
        return resultado;
    }
    
}//end class