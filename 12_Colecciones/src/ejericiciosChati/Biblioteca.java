package ejericiciosChati;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Biblioteca implements Serializable{
    private String nombre;
    private String ciudad;
    private List<Libro> libros;

    public Biblioteca(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.libros= new ArrayList<>();
    }
    
    
    
    
    public void agregar(Libro libro){
        getLibros().add(libro);
    }
    
    public void mostrar(){
        System.out.println("Biblioteca: " + getNombre() + " - Ciudad: " + getCiudad());
        System.out.println("ISBN\t\tTitulo\t\t\tAutor\t\tPrecio(euros)");
        for (Libro libro : getLibros()) {
            System.out.println(libro);
        }
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