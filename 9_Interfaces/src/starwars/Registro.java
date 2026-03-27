package starwars;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Clase que se encarga de agregar los Jedis y sus respectivos id.
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Registro {

    private Jedi[] arrayJedi;
    private int[] id;

    /**
     * Creamos un constrcutor vacio, en el caso de que el usuario no inserte
     * ningun array.
     *
     */
    public Registro() {
        this.arrayJedi = new Jedi[0];
        this.id = new int[0];
    }

    /**
     * Creamos otro constructor, en este caso, sobrecargado.Su diferencia es si
 el usuario agrega un array de Jedis.
     *
     * @param arrayJedi lista de los Jedis insertados por el usuario.
     */
    public Registro(Jedi[] arrayJedi) {
        this.arrayJedi = arrayJedi;
        this.id = new int[arrayJedi.length];
        for (int i = 0; i < id.length; i++) {
            id[i] = i + 1;
        }
    }

    /**
     * Muestra los Jedis agregados al array de Jedis.
     */
    public void mostrarRegistro() {

        System.out.println("    Listado de Jedis del Registro.");

        for (int i = 0; i < id.length; i++) {
            System.out.printf("    %-3d    %s  \n", id[i], arrayJedi[i]);
        }
    }

    /**
     * Ordena los Jedis por nombre.
     *
     */
    public void ordenar() {
        Arrays.sort(arrayJedi);
    }

    /**
     * Se encarga que se ordene por nombre de forma correcta.
     */
    public void ordenarNombre() {
        Comparator<Jedi> porNombre = Comparator.comparing(Jedi::getNombre).reversed().thenComparing(Jedi::getFuerza);
        Arrays.sort(arrayJedi, porNombre);
    }

}//end class
