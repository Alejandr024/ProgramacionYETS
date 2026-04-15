package iterador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class RecorrerColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in).useLocale(Locale.US);
        Collection<Double> positivos= new ArrayList<>();
        
        Collection<Double> negativos= new ArrayList<>();
        
        System.out.println("Introducir un numero real (0 para terminar).");
        
        Double dato= sc.nextDouble();
        
        while(!dato.equals(0.)){//es una clase, por eso hay que usar el equals
            if(dato>0){
                positivos.add(dato);
            }else if(dato<0){
                negativos.add(dato);
            }
            dato= sc.nextDouble();
        }
        
        System.out.println("Coleccion de positivos: " + positivos);
        System.out.println("Coleccion de negativos: " + negativos);
        
        //Declaro un iterador
        Iterator<Double> it= positivos.iterator();
        
        //recorro con un while
        while(it.hasNext()){//mientras haya elementos en la coleccion
            Double auxDouble= it.next();
            if(auxDouble%3==0){
                it.remove();
            }
        }
        System.out.println("Coleccion sin multiplo de 3: " + positivos);
        
        //si queremos reiniciar y quitar otros numero, hay que volver al principio
        it= positivos.iterator();
        
        
        while(it.hasNext()){//mientras haya elementos en la coleccion
            Double auxDouble= it.next();
            if(auxDouble%2==0){
                it.remove();
            }
        }
        System.out.println("Coleccion sin multiplo de 2: " + positivos);
        
    }//end main
    
}//end class