package contenedorLista;

import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Contenedor<T> {

    private T[] objetos;

    public Contenedor() {
    }

    public Contenedor(T[] objetos) {
        this.objetos = objetos;
    }

    void agregarPrincipio(T objeto) {
        //T[] auxArray= new T[objetos.length+1];
        objetos = Arrays.copyOf(getObjetos(), getObjetos().length + 1);

        for (int i = getObjetos().length - 1; i > 0; i--) {
            objetos[i] = getObjetos()[i - 1];
        }

        objetos[0] = objeto;

    }

    void agregarFinal(T objeto) {

        T[] arrayAux = Arrays.copyOf(getObjetos(), getObjetos().length + 1);

        arrayAux[arrayAux.length - 1] = objeto;

        objetos = arrayAux;
    }
    
    
    
    
    

    /**
     * @return the objetos
     */
    public T[] getObjetos() {
        return objetos;
    }

}//end class
