package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TutorialConversiones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * *****************************************************************************
         * CONVERSIONES ENTRE COLECCIONES *
         * *****************************************************************************
         */
        //Una característica interesante de los conjuntos y de todas las colecciones en
        //general es la posibilidad de crear unas a partir de otras, del mismo o distinto tipo,
        //por medio de los constructores. Podemos obtener un conjunto ordenado (un TreeSet) 
        //a partir de otro que no lo está (un HashSet o LinkedHashSet) 
        //Vamos a crear un LinkedHashSet de numeros enteros. Despues le añadimos cinco
        //elementos, que se irán colocando por orden de inserción. 
//        Set<Integer> conjuntoEnteros = new LinkedHashSet<>();
//        conjuntoEnteros.add(4);
//        conjuntoEnteros.add(1);
//        conjuntoEnteros.add(5);
//        conjuntoEnteros.add(10);
//        conjuntoEnteros.add(3);
//        System.out.println("Se visualiza por orden de insercion (LinkedHashSet): " + conjuntoEnteros); //[4, 1, 5, 10, 3]

        //Disponemos de varios caminos para ordenar el conjunto 
        //Ordenar mediante treeset
//        Set<Integer> conjuntoEnterosOrdenados = new TreeSet<>();
//        conjuntoEnterosOrdenados.addAll(conjuntoEnteros);
//        System.out.println("Se visualiza por orden de natural (TreeSet): " + conjuntoEnterosOrdenados) ;//[1, 3, 4, 5, 10]
        //   conjuntoEnteros = conjuntoEnterosOrdenados;
//        System.out.println("conjuntoEnteros despues de doble conversion: " + conjuntoEnteros);
        //otra forma de ordenar
//        conjuntoEnteros.clear();
//        conjuntoEnteros.addAll(conjuntoEnterosOrdenados);
//        System.out.println(conjuntoEnteros);
        //2.Ordenar mediante un Treeset (orden especifico)
        //conjunto que queremos ordenar.
//        Set<Integer> conjuntoEnterosOrdenados2 = new TreeSet<>(conjuntoEnteros);
        //procedimento, construyendo un TreeSet con un comparador ComparaNombres
//        Comparator<Cliente1> comparaNombres = Comparator.comparing(Cliente1::getNombre);
        //Creo un conjunto LinkedHashSet (Orden de insercon)
//        Set<Cliente1> conjuntoClientes = new LinkedHashSet<>();
        /*Sin orden*/
//        conjuntoClientes.add(new Cliente1("111", "Marta", "12/02/2000"));
//        conjuntoClientes.add(new Cliente1("115", "Jorge", "16/03/1999"));
//        conjuntoClientes.add(new Cliente1("112", "Carlos", "01/10/2002"));
//        System.out.println("Elementos de conjuntoClientes (LinkedHashSet):\n " + conjuntoClientes);
        //Por orden natural
//        Set<Cliente1> conjuntoClientesOrdenNatural = new TreeSet<>();//importante para ordenar de forma especifica
//        conjuntoClientesOrdenNatural.addAll(conjuntoClientes);
//        System.out.println("Elementos de conjuntoClientesOrdenados (TreeSet):\n " + conjuntoClientesOrdenNatural);
        //Creo un conjunto TreeSet (Orden por Comparator: comparaNombres)
//        Set<Cliente1> conjuntoClientesOrdenNombres = new TreeSet<>(comparaNombres);//importante para ordenar de forma especifica
//        conjuntoClientesOrdenNombres.addAll(conjuntoClientes);
//        System.out.println("Elementos de conjuntoClientesOrdenados (TreeSet):\n " + conjuntoClientesOrdenNombres);
// CONVERSIONES ENTRE TODO TIPO DE COLECCIONES
//        List<Integer> lista = new ArrayList<>();
//        lista.add(5);
//        lista.add(3);
//        lista.add(5); //elemento repetido
//        lista.add(2);
//        lista.add(5); //elemento repetido
//        System.out.println("Lista (respeta orden insercion): " + lista); //[5, 3, 5, 2, 5]
       //Transformamos una lista en un conjunto
//        Set<Integer> conjunto = new LinkedHashSet<>(lista);
        /*sin repetidos */
//        System.out.println("Transformamos una lista en un conjunto: " + conjunto); //[5, 3, 2]
        //Vuelvo a convertir el conjunto en una lista
//        lista = new ArrayList<>(conjunto);
//        System.out.println("Lista sin duplicados: " + lista);
        //codigo anterior con collection (clase padre)
        
        Collection<Integer> coleccion = new ArrayList<>();
        coleccion.add(5);
        coleccion.add(3);
        coleccion.add(7);
        coleccion.add(7);
//        coleccion = new LinkedHashSet<>(coleccion);//de lista a conjunto
//        System.out.println("Coleccion (set)" + coleccion) ;
//
//        coleccion = new ArrayList<>(coleccion);//de conjunto a lista
//        System.out.println("Coleccion (ArrayList) " + coleccion) ;

        //En un solo paso
        coleccion= new ArrayList<>(new LinkedHashSet<>(coleccion));
        System.out.println("Coleccion (lista --> Set --> lista) " + coleccion) ;
//    //En este caso, con coleccion podemos referenciar cualquier lista o conjunto. El
//    //comportamiento dependerá del objeto referenciado.
//    //También es posible hacer las conversiones encadenadas con una única sentencia, 
//    coleccion = new ArrayList<>( new LinkedHashSet<>(coleccion));
//    //dando los mismos resultados. Aquí habría valido una variable de tipo List        

    }//end main

}//end class
