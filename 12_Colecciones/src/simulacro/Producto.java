package simulacro;

import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Producto implements Comparable<Producto> {

    Scanner sc = new Scanner(System.in);

    private String nombre;
    private int codigo;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, int codigo, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public boolean equals(Producto producto) {
        if (this == producto) {
            return true;
        }
        if (producto == null || this.getClass() != producto.getClass()) {
            return false;
        }

        return this.getCodigo() == producto.getCodigo();
        // return Objects.equals(ibsn,libro.isbn);
    }

    @Override
    public String toString() {
        return String.format("%-10d%-25s(%.2f)\tCantidad: %-30d", codigo, nombre, precio, cantidadEnStock);
    }

    @Override
    public int compareTo(Producto o) {
        return this.codigo - o.getCodigo();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    /**
     * @param cantidadEnStock the cantidadEnStock to set
     */
    public void setCantidadEnStock(int agregarStock) {
        this.cantidadEnStock = cantidadEnStock + agregarStock;
    }

}//end class
