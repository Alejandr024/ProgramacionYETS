/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author Daw1
 */
public class Inventario {
    Producto[] arrayProductos;

    public Inventario() {
        
        arrayProductos = new Producto[0];
        
    }

    public Inventario(Producto[] arrayProductos) {
        this.arrayProductos = arrayProductos;
    }

    @Override
    public String toString() {
        String mensaje= "Inventario: \nNombre\t \tPrecio\t Cantidad\n";
        for(int i=0; i<arrayProductos.length;i++){
            mensaje+=arrayProductos[i] + "\n";
        }
        return mensaje;
    }
    
    
    
    
    
    
    
    
}//end class