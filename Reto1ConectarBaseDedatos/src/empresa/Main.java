package empresa;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static EmpleadoDAO dao = new EmpleadoDAO();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n===== GESTIÓN DE NÓMINAS =====");
            System.out.println("1. Mostrar todos los empleados");
            System.out.println("2. Mostrar nómina de un empleado");
            System.out.println("3. Mostrar nóminas de todos los empleados");
            System.out.println("4. Añadir nuevo empleado");
            System.out.println("5. Eliminar empleado");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> mostrarEmpleados();
                case 2 -> mostrarNominaEmpleado();
                case 3 -> mostrarTodasNominas();
                case 4 -> añadirEmpleado();
                case 5 -> eliminarEmpleado();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }

    // ?? Opción 1 ??????????????????????????????????????????????????????????????
    static void mostrarEmpleados() {
        List<Empleado> lista = dao.readAll();

        if (lista.isEmpty()) {
            System.out.println("No hay empleados en la base de datos.");
            return;
        }

        System.out.println("\n===== LISTA DE EMPLEADOS =====");
        System.out.printf("%-5s %-30s %-20s %-12s%n", "ID", "NOMBRE", "PUESTO", "SALARIO");
        System.out.println("?".repeat(70));

        for (Empleado e : lista) {
            System.out.printf("%-5d %-30s %-20s %,.2f €%n",
                e.getId(),
                e.getNombre(),
                e.getPuesto(),
                e.getSalarioBase()
            );
        }
    }

    // ?? Opción 2 ??????????????????????????????????????????????????????????????
    static void mostrarNominaEmpleado() {
        System.out.print("ID del empleado: ");
        int id = sc.nextInt();
        sc.nextLine();

        Empleado e = dao.read(id);

        if (e == null) {
            System.out.println("No existe ningún empleado con ese ID.");
            return;
        }

        Nomina nomina = new Nomina(e);
        nomina.mostrar();
    }

    // ?? Opción 3 ??????????????????????????????????????????????????????????????
    static void mostrarTodasNominas() {
        List<Empleado> lista = dao.readAll();

        if (lista.isEmpty()) {
            System.out.println("No hay empleados en la base de datos.");
            return;
        }

        for (Empleado e : lista) {
            Nomina nomina = new Nomina(e);
            nomina.mostrar();
        }
    }

    // ?? Opción 4 ??????????????????????????????????????????????????????????????
    static void añadirEmpleado() {
        System.out.print("Nombre y apellidos: ");
        String nombre = sc.nextLine();

        System.out.print("Puesto de trabajo: ");
        String puesto = sc.nextLine();

        System.out.print("Salario base: ");
        double salario = sc.nextDouble();
        sc.nextLine();

        System.out.print("Fecha de contratación (YYYY-MM-DD): ");
        Date fecha = Date.valueOf(sc.nextLine());

        Empleado e = new Empleado(nombre, puesto, salario, fecha);
        dao.create(e);
        System.out.println("Empleado añadido correctamente.");
    }

    // ?? Opción 5 ??????????????????????????????????????????????????????????????
    static void eliminarEmpleado() {
        System.out.print("ID del empleado a eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();

        Empleado e = dao.read(id);

        if (e == null) {
            System.out.println("No existe ningún empleado con ese ID.");
            return;
        }

        dao.delete(id);
        System.out.println("Empleado " + e.getNombre() + " eliminado correctamente.");
    }
    
}//end class