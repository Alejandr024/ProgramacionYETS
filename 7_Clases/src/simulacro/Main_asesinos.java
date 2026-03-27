package simulacro;

import java.util.Scanner;

public class Main_asesinos {

    public static void main(String[] args) {

        // 1) Crear los 5 asesinos iniciales
        Asesino a1 = new Asesino("Taro Sakamoto", 18, 5, true);
        Asesino a2 = new Asesino("Shin Asakura", 10, 8, false);
        Asesino a3 = new Asesino("Lu Xiaotang", 6, 9, true);
        Asesino a4 = new Asesino("Heisuke Mashimo", 10, 10, false); // equilibrado
        Asesino a5 = new Asesino("Amagoia", 0, 10, true);

        Asesino[] arrayBase = { a1, a2, a3, a4, a5 };

        OrganizacionAsesinos organizacion = new OrganizacionAsesinos(arrayBase, "Sakamoto Days");

        // 2) Realizar 3 combates automaicos
        System.out.println("=== Combates automaticos iniciales ===");
        for (int i=0; i<10; i++) {
          organizacion.simularCombate();
        }

        // 3) Menu interactivo
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENU ORGANIZACION ASESINOS ===");
            System.out.println("1. Añadir asesino");
            System.out.println("2. Simular combate random");
            System.out.println("3. Buscar asesino por nombre");
            System.out.println("4. Mostrar organizacion completa");
            System.out.println("5. Mostrar historial de un asesino");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");

            while (!sc.hasNextInt()) {
                System.out.print("Introduce un numero valido: ");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar salto de linea

            switch (opcion) {
                case 1:
                    System.out.println("=== Añadir asesino ===");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Â¿Quieres introducir atributos manualmente? (s/n): ");
                    String resp = sc.nextLine().trim().toLowerCase();

                    Asesino nuevo;
                    if (resp.equals("s")) {
                        System.out.print("Inteligencia [1-20]: ");
                        int intel = sc.nextInt();
                        System.out.print("Suerte [1-10]: ");
                        int suerte = sc.nextInt();
                        sc.nextLine(); // limpiar
                        System.out.print("Â¿Tiene licencia gubernamental? (s/n): ");
                        String licStr = sc.nextLine().trim().toLowerCase();
                        boolean lic = licStr.equals("s");
                        nuevo = new Asesino(nombre, intel, suerte, lic);
                    } else {
                        nuevo = new Asesino(nombre); // aleatorio
                    }

                    organizacion.append(nuevo);
                    System.out.println("Asesino aÃ±adido.\n");
                    break;

                case 2:
                    System.out.println("=== Simular combate random ===");
                    organizacion.simularCombate();
                    break;

                case 3:
                    System.out.println("=== Buscar asesino por nombre ===");
                    System.out.print("Texto a buscar: ");
                    String texto = sc.nextLine();
                    organizacion.buscar(texto);
                    break;

                case 4:
                    System.out.println("=== Organizacion completa ===");
                    System.out.println(organizacion.toString());
                    break;

                case 5:
                    System.out.println("=== Mostrar historial de un asesino ===");
                    System.out.print("indice del asesino: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Introduce un i­ndice valido: ");
                        sc.next();
                    }
                    int idx = sc.nextInt();
                    sc.nextLine(); // limpiar
                    Asesino as = organizacion.getAsesino(idx);
                    if (as == null) {
                        System.out.println("No hay asesino en ese Ã­ndice.");
                    } else {
                        as.mostrarCombates();
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
