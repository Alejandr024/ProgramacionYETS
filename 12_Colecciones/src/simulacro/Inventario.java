package simulacro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Inventario{

    Scanner sc = new Scanner(System.in);

    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void ordernarPorPrecio() {
        Comparator<Producto> porPrecio = Comparator.comparing(Producto::getPrecio);
        getProductos().sort(porPrecio);
    }
    
    public void agregar(Producto producto){
        getProductos().add(producto);
    }

    public void ordernarPorNOmbre() {
        Comparator<Producto> porNombre = Comparator.comparing(Producto::getNombre);
        getProductos().sort(porNombre);
    }
    
    public void mostrar(){
        
        System.out.println("Nombre\t\tCodigo\t\tPrecio\t\tStock");
        for(Producto producto : getProductos()){
            System.out.println(producto);
        }
    }

   
    
    
    public void reponerStock() {

        System.out.print("Ingrese el codigo a reponer: ");
        int codigo = sc.nextInt();
        System.out.print("Ingrese la cantidad a reponer: ");
        int reponer = sc.nextInt();

        for (Producto producto : getProductos()) {
            if (producto.getCodigo() == codigo) {
                producto.setCantidadEnStock(reponer);
                System.out.println("Repuesto correctamente.");
            }
        }
    }

    /**
     * @return the productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

}//end class