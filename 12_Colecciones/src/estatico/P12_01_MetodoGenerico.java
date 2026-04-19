package estatico;

import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P12_01_MetodoGenerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- 1. PRUEBAS CON STRINGS ---");
        String[] arrayAutos = {"rueda", "frenos", "volante"}; //
        System.out.println("Array original: " + Arrays.toString(arrayAutos)); //

        // Probamos el metodo append
        arrayAutos = append("coche", arrayAutos); //
        arrayAutos = append("moto", arrayAutos); //
        System.out.println("Array tras append: " + Arrays.toString(arrayAutos)); //

        // Probamos a concatenar dos arrays de Strings
        String[] arrayAves = {"mirlo", "paloma", "gaviota"}; //
        String[] arrayStringSuma = concatenar(arrayAutos, arrayAves); //
        System.out.println("Tabla concatenada Strings: " + Arrays.deepToString(arrayStringSuma)); //

        System.out.println("\n--- 2. PRUEBAS CON INTEGERS ---");
        // Nota para alumnos: Usamos Integer (clase envoltorio) porque los gen?ricos NO admiten primitivos (int).
        Integer[] datos = {}; //
        datos = append(10, datos); //
        datos = append(20, datos); //
        System.out.println("Array datos tras append: " + Arrays.toString(datos)); //

        Integer[] tabla1 = {1, 2, 3, 4, 5, 6}; //
        Integer[] tabla2 = {7, 8, 9, 10}; //

        // Metodo estetico que devuelve dos tablas en una: 
        // Tabla resultante esperada: [1,2,3,4,5,6,7,8,9,10]
        Integer[] tablaResultante = concatenar(tabla1, tabla2); //
        System.out.println("Tabla resultante Integers: " + Arrays.deepToString(tablaResultante)); //
    }

    /**
     * A?ade un elemento al final de un array. IMPORTANTE: En los m?todos
     * est?ticos gen?ricos, el par?metro de tipo <E>
     * se debe declarar ANTES del tipo de retorno (E[] en este caso).
     */
    static <E> E[] append(E elem, E[] tabla) { //
        // Creamos una copia del array original, pero con una posici?n extra de tama?o
        E[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1); //
        // Insertamos el elemento en la ?ltima posici?n disponible
        nuevaTabla[nuevaTabla.length - 1] = elem; //
        return nuevaTabla; //
    }

    /**
     * VERSI?N 1 (Did?ctica): Concatena iterando y reutilizando el m?todo
     * append. Es m?s lenta porque crea un array nuevo en cada iteraci?n de
     * memoria.
     */
    static <E> E[] concatenar2(E[] tabla1, E[] tabla2) { //
        E[] nuevaTabla = tabla1; //

        // Usamos un bucle Foreach para recorrer la segunda tabla y a?adir elementos uno a uno
        for (E elem : tabla2) { //
            nuevaTabla = append(elem, nuevaTabla); //
        }
        return nuevaTabla; //
    }

    /**
     * VERSI?N 2 (Profesional): Concatena usando copiado directo de memoria. Es
     * la forma m?s eficiente de unir arrays en Java.
     */
    static <E> E[] concatenar(E[] t1, E[] t2) { //
        // 1. Creamos el array final con el tama?o exacto de la suma de ambos
        E[] nuevaTabla = Arrays.copyOf(t1, t1.length + t2.length); //

        // 2. Copiamos el contenido de t2 directamente al final de nuevaTabla.
        // Par?metros: (arrayOrigen, posOrigen, arrayDestino, posDestino, cantidadACopiar)
        System.arraycopy(t2, 0, nuevaTabla, t1.length, t2.length); //

        return nuevaTabla; //
    }
}
