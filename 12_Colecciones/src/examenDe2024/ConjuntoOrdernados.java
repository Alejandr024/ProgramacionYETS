package examenDe2024;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class ConjuntoOrdernados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> conjuntoString = new LinkedHashSet<>();

        String texto = "";
        for (int i = 0; i < 12; i++) {
            System.out.println("Escribe 12 caracteres");
            char car = sc.next().charAt(0);
            texto += car;
            if ((i + 1) % 3 == 0) {
                conjuntoString.add(texto);
                texto = "";
            }

        }

        System.out.println("Conjunto agregador por insercion: " + conjuntoString);

        Set<String> conjuntoStringsOrdenados = new TreeSet<>(conjuntoString);

        System.out.println("Conjunto Por orden alfabetico: " + conjuntoStringsOrdenados);
        
        
//Hay que tener una clase y un metodo        Comparator<String> comparadorInverso= Comparator.comparing(String::);
        
        Comparator<String> inverso= Comparator.reverseOrder();
        
        Set<String> ordenInverso= new TreeSet<>(inverso);
        
        ordenInverso.addAll(conjuntoStringsOrdenados);
        
        System.out.println("Ordern inverso: " + ordenInverso);
    }//end main

}//end class
