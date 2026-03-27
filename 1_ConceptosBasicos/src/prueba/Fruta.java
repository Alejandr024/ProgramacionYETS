package prueba;
import java.util.Scanner;


/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Fruta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los kilos vendidos de la manzana: ");
        float manzana = entrada.nextFloat();
        System.out.println("Introduce los kilos vendidos de la pera: ");
        float pera = entrada.nextFloat();
        
        float venta_manzana = (float) (manzana * 2.35);
        float venta_pera = (float) (pera * 1.95);
        
        System.out.println("Las ventas, en kilos, de las manzanas es de " + venta_manzana + " €/Kg. Por otro lado, las ventas, en kilos, de las pera es de " + venta_pera + " €/Kg.");
    }   
}