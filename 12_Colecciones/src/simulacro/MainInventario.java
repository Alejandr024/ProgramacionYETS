
package simulacro;


public class MainInventario {

    public static void main(String[] args) {
        
        Inventario inventario= new Inventario();
        // Instancias de productos individuales
        Producto p1 = new Producto("Memoria USB", 102, 10.99, 50);
        Producto p2 = new Producto("Teclado Mecánico", 103, 24.99, 30);
        Producto p3 = new Producto("Monitor FullHD", 105, 129.99, 12);
        Producto p4 = new Producto("Ratón inalámbrico", 107, 19.99, 20);
        Producto p5 = new Producto("Altavoces Bluetooth", 101, 39.99, 15);
        Producto p6 = new Producto("Impresora Multifunción", 106, 89.99, 10);
        Producto p7 = new Producto("Tablet 10''", 110, 199.99, 8);
        Producto p8 = new Producto("Cámara Web HD", 108, 49.99, 25);
        Producto p9 = new Producto("Auriculares Gamer", 109, 59.99, 18);
        Producto p10 = new Producto("Micrófono Streaming", 104, 79.99, 14);
        
        inventario.agregar(p1);
        inventario.agregar(p2);
        inventario.agregar(p3);
        inventario.agregar(p4);
        inventario.agregar(p5);
        inventario.agregar(p6);
        inventario.agregar(p7);
        inventario.agregar(p8);
        inventario.agregar(p9);
        inventario.agregar(p10);


        System.out.println("Productos ordenados naturalmente: ");
        
        inventario.mostrar();
        
        System.out.println("--------------------------------");
        System.out.println("Ordenados por precio: ");
        inventario.ordernarPorPrecio();
        

        System.out.println("--------------------------------");        
        System.out.println("Ordenados por nombre: ");
        inventario.ordernarPorNombre();

        System.out.println("--------------------------------");
        System.out.println("Reponer Stock");
        inventario.reponerStock();
    }//end main
}//end class