package registro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P11_09_Main_RegistroTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// 1. CARGA INICIAL: Intentamos leer el historial previo
        Registro[] arrayReg = new Registro[0]; // Empezamos con un array vacío

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("temperaturas.dat"))) {
            // Leemos el objeto completo y hacemos casting al array de la clase Registro
            arrayReg = (Registro[]) in.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("No hay datos previos. Iniciando historial nuevo...");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error al cargar datos: " + ex);
        }

        // 2. MENÚ DE USUARIO
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- ESTACIÓN METEOROLÓGICA ---");
            System.out.println("1. Nuevo registro");
            System.out.println("2. Mostrar historial");
            System.out.println("3. Salir y Guardar");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce temperatura (°C): ");
                    double temp = sc.useLocale(Locale.US).nextDouble();

                    // Creamos el nuevo objeto Registro
                    Registro nuevo = new Registro(temp);

                    // Redimensionamos el array para que quepa uno más
                    arrayReg = Arrays.copyOf(arrayReg, arrayReg.length + 1);
                    arrayReg[arrayReg.length - 1] = nuevo; // Lo añadimos al final
                    System.out.println("Registro guardado en memoria.");
                }
                case 2 -> {
                    // deepToString recorre el array y llama al toString() de cada Registro
                    System.out.println("\n=== HISTORIAL COMPLETO ===");
                    System.out.println(Arrays.toString(arrayReg));
                }

            }
        } while (opcion != 3);

        // 3. PERSISTENCIA FINAL: Al salir, guardamos el array actualizado en el disco
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("temperaturas.dat"))) {
            out.writeObject(arrayReg); // Guardamos el array completo de un solo golpe
            System.out.println("Datos sincronizados con el archivo correctamente.");
        } catch (IOException ex) {
            System.err.println("Error al guardar: " + ex.getMessage());
        }
    }//end main
}//end class