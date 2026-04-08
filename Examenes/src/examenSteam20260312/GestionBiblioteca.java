package examenSteam20260312;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class GestionBiblioteca {

    //Creamos los atributos
    Steam[] catalogo = new Steam[5];
    int contador;
    Steam[] catalogoAux = new Steam[0];

    //montamos el metodo de agregar el juego al catalogo, si este esta lleno, se le duplica la longitud
    public void add(Steam s) {
        if (catalogo.length != contador) {
            catalogo[catalogo.length - 1] = s;
            System.out.println("El juego " + s.getNombre() + " ha sido agregado al catalogo.");
            contador++;
            catalogoAux = Arrays.copyOf(catalogoAux, catalogoAux.length + 1);
            catalogoAux[catalogoAux.length - 1] = s;
        } else {
            catalogo = Arrays.copyOf(catalogo, catalogo.length + catalogo.length);
            catalogo[catalogo.length - 1] = s;
            System.out.println("El juego " + s.getNombre() + " ha sido agregado al catalogo.");
            contador++;
            catalogoAux = Arrays.copyOf(catalogoAux, catalogoAux.length + 1);
            catalogoAux[catalogoAux.length - 1] = s;
        }
    }

    //montamos el metodo de cuantas veces aparece el juego en catalogos
    public void contarJuegosIguales(Steam s) {
        int contadorVeces = 0;
        for (int i = 0; i < catalogoAux.length; i++) {
            if (s.getNombre().equals(catalogoAux[i].getNombre())) {
                contadorVeces++;
            }
        }
        if (contadorVeces > 0) {
            if (contador == 1) {
                System.out.println("El juego " + s.getNombre() + " aparece " + contador + " vez en el catalogo de Steam.");
            } else {
                System.out.println("El juego " + s.getNombre() + " aparece " + contador + " veces en el catalogo de Steam.");
            }
        } else {
            System.out.println("El juego " + s.getNombre() + " no aparece en el catalogo de Steam.");
        }
    }

    //creamos el metodo ordenar alfabeticamente.Se insertar dos objetos y se ordenar de alfabeticamente.
    public void ordenarAlfabeticamente() {
        Arrays.sort(catalogoAux);
    }

    /*
    creamos el metodo ordenar por precio y, como su nombre lo indica
    compara, en primer lugar, con los precios, de forma descendente, 
    y si fuera empate, se compara por valoracion, de forma ascendente.
     */
    public void ordernarPorPrecio() {
        Comparator<Steam> porPrecio = Comparator.comparing(Steam::getPrecio).reversed().thenComparing(Steam::getValoracion);
        Arrays.sort(catalogoAux, porPrecio);

    }

    //cremaos el metdodo para mostar el array
    public void mostar(){
        //No compila porque es null(no se porque, uso el auxiliar.)
        for(int i=0; i<catalogoAux.length;i++){
            System.out.println(catalogoAux[i]);
        }
    }
}//end class
