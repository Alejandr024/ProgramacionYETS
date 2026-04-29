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
        
        System.out.printf("%-10s%-25s%5s\t%-20s\n", "Codigo", "Nombre", "Precio", "Stock");
        for (Producto producto : getProductos()) {
            System.out.println(producto);
        }
    }
    
    public void agregar(Producto producto){
        getProductos().add(producto);
    }

    public void ordernarPorNombre() {
        Comparator<Producto> porNombre = Comparator.comparing(Producto::getNombre);
        getProductos().sort(porNombre);
        
        System.out.printf("%-10s%-25s%5s\t%-20s\n", "Codigo","Nombre","Precio","Stock");
        for(Producto producto : getProductos()){
            System.out.println(producto);
        }
    }
    
    
    public void mostrar(){
        getProductos().sort(Comparator.naturalOrder());//orden natural de la lista
        
        System.out.printf("%-10s%-25s%5s\t%-20s\n", "Codigo","Nombre","Precio","Stock");
        for(Producto producto : getProductos()){
            System.out.println(producto);
        }
    }

   
    
    
    public void reponerStock() {

        System.out.print("Ingrese el codigo a reponer: ");
        int codigo = sc.nextInt();
        System.out.print("Ingrese la cantidad a reponer: ");
        int reponer = sc.nextInt();
        
        boolean encontrado= false;
        
        for (Producto producto : getProductos()) {
            if (producto.getCodigo() == codigo) {
                producto.setCantidadEnStock(reponer);
                System.out.println("Repuesto correctamente.");
                encontrado=true;
                break;
            }
        }
        
        if(encontrado){
            System.out.println("Lista actualizada con el producto ya repuesto:");
            System.out.printf("%-10s%-25s%5s\t%-20s\n", "Codigo","Nombre","Precio","Stock");
            for(Producto producto : productos){
                System.out.println(producto);
            }
        }else{
            System.out.println("Error: no existe un producto con el codigo " + codigo);
        }
        
    }

    /**
     * @return the productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

}//end class