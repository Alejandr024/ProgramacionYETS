package inventarioOrdenador;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class ProductoOrdenador {

    //creamos los atributos
    private int id;
    String nombre;
    double precio;
    boolean disponible;

    //creamos los contrcutores, en caso de que no nos pasen la disponibilidad, asusimos que no esta disponible
    public ProductoOrdenador(int id, String nombre, double precio, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    public ProductoOrdenador(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = false;
    }

    //Monstamso el toString para cada producto
    @Override
    public String toString() {

        return "ID: " + id + "\nNombre: " + nombre + "\nPrecio: " + precio + "\nDisponible: " + disponible + ".\n";
    }

}//end clas
