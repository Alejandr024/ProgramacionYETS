package inventarioOrdenador;

import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Inventario {//clase para almacenar los productos en un array de objetos

    ProductoOrdenador[] inventario= new ProductoOrdenador[0];

    public Inventario(ProductoOrdenador[] inventario) {
        this.inventario = inventario;
    }

    public Inventario() {
        this.inventario = new ProductoOrdenador[0];
    }

    public void append(ProductoOrdenador producto) {
        ProductoOrdenador[] inventarioAux = Arrays.copyOf(inventario, inventario.length + 1);

        inventarioAux[inventarioAux.length - 1] = producto;
        
        inventario=inventarioAux;

    }
    @Override
        public String toString() {
        String stringProducto = "\nInventario: \n";
        for (int i = 0; i < inventario.length; i++) {
            stringProducto += inventario[i] + "\n" ;
        }
        
        return stringProducto;
    }

}//end class
