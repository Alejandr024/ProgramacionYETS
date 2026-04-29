package ejericiciosChati;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class GestionProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductoElectronicos p1 = new ProductoElectronicos(101, "Portatil", "HP", 899.99);
        ProductoElectronicos p2 = new ProductoElectronicos(102, "Tablet", "Samsung", 299.50);
        ProductoElectronicos p3 = new ProductoElectronicos(103, "Smartphone", "Xiaomi", 499.00);
        ProductoElectronicos p4 = new ProductoElectronicos(104, "Monitor", "LG", 199.99);
        ProductoElectronicos p5 = new ProductoElectronicos(105, "Teclado", "Logitech", 49.95);
        ProductoElectronicos p6 = new ProductoElectronicos(106, "Raton", "Logitech", 29.99);
        ProductoElectronicos p7 = new ProductoElectronicos(107, "Impresora", "Epson", 159.75);
        ProductoElectronicos p8 = new ProductoElectronicos(108, "Altavoces", "Sony", 89.90);
        ProductoElectronicos p9 = new ProductoElectronicos(109, "Webcam", "Trust", 39.99);
        ProductoElectronicos p10 = new ProductoElectronicos(110, "Disco SSD", "Kingston", 119.49);

        Set<ProductoElectronicos> productos = new TreeSet<>();

        productos.add(p9);
        productos.add(p4);
        productos.add(p3);
        productos.add(p6);
        productos.add(p5);
        productos.add(p10);
        productos.add(p1);
        productos.add(p2);
        productos.add(p8);
        productos.add(p7);

        System.out.println("Productos ordenados naturalmente: ");
        System.out.println(productos);

        System.out.println("------");
        System.out.println("Ordenado por nombre");

        Comparator<ProductoElectronicos> porNombre = (ProductoElectronicos pe1, ProductoElectronicos pe2) -> pe1.getNombre().compareTo(pe2.getNombre());

        Set<ProductoElectronicos> productoNombres = new TreeSet<>(porNombre);

        productoNombres.addAll(productos);

        System.out.println(productoNombres);

        System.out.println("------");
        System.out.println("Ordenados por precio");
        Comparator<ProductoElectronicos> comparaAntiguedad = (ProductoElectronicos s1, ProductoElectronicos s2) -> Double.compare(s1.getPrecio(), s2.getPrecio());
        Set<ProductoElectronicos> productosPrecio = new TreeSet<>(comparaAntiguedad);
        productosPrecio.addAll(productos);

        System.out.println(productosPrecio);
    }//end main

}//end class
