package flujoEntrada;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P11_07_EnterosNoNegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("numeros.dat"))) {

            System.out.print("Introduce un numero entero (para acabar, poner un numero <0): ");
            int numero = sc.nextInt();

            while (numero >= 0) {
                oos.writeInt(numero);
                System.out.print("Introduce otro numero entero (para acabar, poner un numero <0): ");
                numero = sc.nextInt();
            }

            System.out.println("Escritura finalizada");

        } catch (IOException ex) {
            System.out.println(ex);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros.dat")); ObjectOutputStream oosCopia = new ObjectOutputStream(
                new FileOutputStream("numerosCopia.dat"))) {
            int contador = 1;
            while (true) {//es true simrpe y cuando haya numero dentro del fichero binario. Una vez que no haya, pasa al EOFException e imprimero que la copia fue un exito.
                int numero = in.readInt(); // Lee el siguiente entero
                System.out.print(contador + ": " + numero + " " + "\n"); // Lo muestra por consola
                oosCopia.writeInt(numero);   // Lo guarda en el archivo copia
                contador++;
            }
        } catch (EOFException ex) {
            System.out.println("Fin de archivo alcanzado. Copia hecha con exito.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }//end main

}//end class