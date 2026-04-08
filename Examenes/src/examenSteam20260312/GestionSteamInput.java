
package examenSteam20260312;
 
import java.util.Arrays;

/**
 * @author Alejandro Miguel Gomez Gonzalez
 * Clase principal de pruebas para el Modelo B: Gestion de Biblioteca Steam.
 */
public class GestionSteamInput {
    public static void main(String[] args) {
        GestionBiblioteca miBiblioteca = new GestionBiblioteca();

        // --- INSTANCIACION DE OBJETOS (Juegos y DLCs) ---
        // Siguiendo el ejemplo de instanciacion del Main original  
        Juego eldenRing = new Juego("Elden Ring", 59.99, "Action RPG", 60);
        Juego hollowKnight = new Juego("Hollow Knight", 14.99, "Metroidvania", 9);
        DLC shadowErdtree = new DLC("Shadow of the Erdtree", 39.99, "Elden Ring", false);
        
        // Agregamos elementos iniciales para probar la capacidad DIM = 5 [cite: 46]
        miBiblioteca.add(eldenRing);
        miBiblioteca.add(new Juego("Stardew Valley", 13.99, "Simulacion", 1));
        miBiblioteca.add(hollowKnight);
        miBiblioteca.add(new Juego("Cyberpunk 2077", 59.99, "RPG", 70));
        miBiblioteca.add(shadowErdtree);
        
        System.out.println("--- PRUEBAS DE ORDENACION Y REDIMENSION ---");
        
        // 1. Probar Orden Natural (Alfabetico)  
        miBiblioteca.ordenarAlfabeticamente();
        // miBiblioteca.mostar(); no funciona, revisar.
        

        // 2. Probar REDIMENSION DINAMICA (Duplicar tamano)
        // Al agregar el sexto elemento, el array de tamano 5 debe pasar a tamano 10
        System.out.println("\n>>> Agregando mas elementos para forzar duplicacion del array...");
        miBiblioteca.add(new DLC("Phantom Liberty", 29.99, "Cyberpunk 2077", false));
        
        // agregamos duplicados para probar el metodo de conteo 
        miBiblioteca.add(eldenRing);
        miBiblioteca.add(eldenRing);

        // 3. Probar Orden por Precio (Descendente) y Valoración  
        // En este modelo B, el orden de precio es DESCENDENTE por defecto
        
        miBiblioteca.ordernarPorPrecio();

        // --- PRUEBA DE INTERFACES Y POLIMORFISMO ---
        // Similar a la estructura de pruebas del modelo original  
        System.out.println("\n--- PRUEBA DE INTERFACES ---");
        
        System.out.println("Mostrar Detalles (mostrarFicha):");
         eldenRing.mostrarDetalles();
         shadowErdtree.mostrarDetalles();
  
        System.out.println("\nEjecucion (reproducir/iniciar):");
        shadowErdtree.iniciar();
        
        
        System.out.println("\nAviso Legal (Default Method):");
         ContenidoMultimedia.avisoPrivacidad();
        
        // 4. Prueba de Equals y Conteo  
        System.out.println("\nPrueba de conteo (contarJuegosIguales):");
        miBiblioteca.contarJuegosIguales(eldenRing);
        
        
    }//end main
}//end class