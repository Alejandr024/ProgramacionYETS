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

    void extraerDelFinal() {
        eliminar(objetos.length);
    }

//    T extraerDelFinal() {
//        T res = null;
//        if (objetos.length > 0) {
//            res = objetos[objetos.length - 1];
//            objetos = Arrays.copyOf(objetos, objetos.length - 1);
//        }
//        return res;
//    }
    // Método eliminar un valor de una posición (Método adaptado de Lista)
    
    T eliminar(int indice) {
        T eliminado = null;
        if (indice >= 0 && indice < objetos.length) {
            eliminado = objetos[indice];
            for (int i = indice + 1; i < objetos.length; i++) {
                objetos[i - 1] = objetos[i];
            }
            objetos = Arrays.copyOf(objetos, objetos.length - 1);
        }
        return eliminado;
    }

    T extraerDelPrincipio() {
        return eliminar(0);

    }

//    T extraerDelPrincipio() {
//        T res = null;
//        if (objetos.length > 0) {
//            res = objetos[0];
//            objetos = Arrays.copyOfRange(objetos, 1, objetos.length);
//        }
//        return res;
//    }
    
    void ordenar() {
        Arrays.sort(objetos);
    }

    /**
     * @return the objetos
     */
    public T[] getObjetos() {
        return objetos;
    }

}//end class
