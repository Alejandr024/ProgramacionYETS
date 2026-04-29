package simulacro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Biblioteca implements Serializable {

    private String nombre;
    private String ciudad;
    private List<Libro> libros;

    public Biblioteca(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.libros = new ArrayList<>();
    }

    public void agregar(Libro libro) {
        getLibros().add(libro);
    }

    public void mostrar() {
        System.out.println("Biblioteca: " + getNombre() + " - Ciudad: " + getCiudad());
        System.out.printf("%-20s                              %-20s                    %-20s%-20s                    %-20s\n", "Titulo","Autor","Year","ISBN","Paginas");
        for (Libro libro : getLibros()) {
            System.out.println(libro);
        }
    }

    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("Titutlo\tAutor\t\tYear\tISBN\t\t\tPaginas\n" + libro);
                return libro;
            }
        }
        return null;//retorna null si no encuentra el nombre en ninguno de los contactos
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @return the libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

}//end class
