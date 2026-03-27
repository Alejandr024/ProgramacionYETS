/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario;

import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class MainInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto tornillo07= new Producto("Tornillo del 7", 0.12, 300);
        
        Producto tornillo12= new Producto("Tornillo del 12", 0.15, 100);
        
        Producto alicates= new Producto("Alicates", 6.15, 20);
        
        Producto [] arrayProductos= {tornillo07,tornillo12,alicates, new Producto("Martillo",10,15)};
        
        
        //System.out.println(Arrays.toString(arrayProductos));
        
        Inventario inventario= new Inventario(arrayProductos);
        
        System.out.println(inventario);
        
    }
    
}
