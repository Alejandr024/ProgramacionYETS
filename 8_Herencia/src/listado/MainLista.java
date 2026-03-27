/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listado;

import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class MainLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear individuos
        Individuo i1 = new Individuo("Ana", 1, "Rubio");
        Individuo i2 = new Individuo("Luis", 2, "Castaño");
        Individuo i3 = new Individuo("Marta", 3, "Negro");

        // Crear listado vacío
        Listado listado = new Listado();

        // Añadir individuos (append modifica el objeto)
        listado.append(i1);
        listado.append(i2);

        // add devuelve un nuevo listado
        Listado nuevoListado = listado.add(i3);

        // Mostrar resultados
        System.out.println("Listado original:");
        for (Individuo i : listado.individuos) {
            System.out.println(i);
        }

        System.out.println("\nNuevo listado:");
        for (Individuo i : nuevoListado.individuos) {
            System.out.println(i);
       
        
        }    
        
    }
    
}
