package coleccionesArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jvega
 */
public class Main_Frutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejemplo Frutas

        ArrayList<String> frutas = new ArrayList<>();
        //metodos basicos
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Kiwi");
        
        // boolean remove (Object ob);
//        System.out.println(frutas.remove("Fresa"));
//        
//        //void clear
//        frutas.clear();
//        System.out.println("------");
//
//        System.out.println(frutas);
//        
//        
//        //boolean isEmpty() (si esta vacio o no)
//        
//        System.out.println(frutas.isEmpty());
//        frutas.add("Fresa");
//        System.out.println(frutas.isEmpty());
//        
//        
//        //boolean contains (object) (si contiene un objeto)
//        System.out.println("------");
//        
//        System.out.println(frutas.contains("Fresa"));
//        System.out.println("------");
//        System.out.println(frutas.contains("Pera"));
//        System.out.println("------");
//        frutas.add("Platano");
//        
//        
//        System.out.println(frutas.size());
        
        //Metodos Globales
        ArrayList<String> frutasExoticas = new ArrayList<>();
        
        frutasExoticas.add("Mango");
        frutasExoticas.add("Pineapple");
        frutas.add("Mango");
        frutas.add("Pineapple");
        
        System.out.println(frutas);
        System.out.println("---------");
        System.out.println(frutasExoticas);
        
        
        //boolean containsAll{Colectio<?> c} SI un arrayList contiene toda la lista de otro arrayList
        
        
        System.out.println(frutas.containsAll(frutasExoticas));
        
        // boolean addAll {Collectio<? extends E (no se ve por ahora)> c}
        ArrayList<String> frutasSosas = new ArrayList<>();
        
        frutasSosas.add("Lichi");
        frutasSosas.add("Pitaya");
        
        frutas.addAll(frutasSosas);
        frutas.addAll(frutasExoticas); //lo vuelve a agregar a pesar se estar repetido anteriormente
        
        //Elimina los que no estan en la lista
        frutas.retainAll(frutasExoticas);
        System.out.println(frutas);
        
        //Elimina todos los que coincidan con la lista
        frutas.removeAll(frutasExoticas);
        System.out.println(frutas);

        
//        Iterator<String> it = frutas.iterator();
//        while (it.hasNext()) {
//            String fruta = it.next();
//            System.out.println(fruta);
//        }
//
//        // Elimino las frutas con 5 letras
//        it = frutas.iterator(); // Reiniciar
//        while (it.hasNext()) {
//            String fruta = it.next();
//            if (fruta.length() == 5) {
//                it.remove();
//            }
//        }
//
//        System.out.println("\n Listado Iterador quitando frutas don 5 letras");
//        it = frutas.iterator(); // Reiniciar
//        while (it.hasNext()) {
//            String fruta = it.next();
//            System.out.println(fruta);
//        }
//
//        System.out.println("\n Listado Foreach");
//        //Para listar ma facil un foreach
//        for (String f : frutas) {
//            System.out.println(f);
//        }
    }//end main

}//end class
