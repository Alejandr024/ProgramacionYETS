package instituto;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static AlumnoDAO dao = new AlumnoDAO();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Insertar nuevo alumno");
            System.out.println("2. Eliminar alumno por número");
            System.out.println("3. Mostrar alumnos de un curso");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> insertarAlumno();
                case 2 -> eliminarAlumno();
                case 3 -> mostrarAlumnosCurso();
                case 4 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 4);
    }//end main

    // ?? Opción 1 ??????????????????????????????????????????????????????????????
    static void insertarAlumno() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
        Date fnac = Date.valueOf(sc.nextLine());

        System.out.print("Nota media: ");
        double media = sc.nextDouble();
        sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        Alumno a = new Alumno(nombre, fnac, media, curso);
        dao.create(a);
    }

    // ?? Opción 2 ??????????????????????????????????????????????????????????????
    static void eliminarAlumno() {
        System.out.print("Número del alumno a eliminar: ");
        int num = sc.nextInt();
        sc.nextLine();
        dao.delete(num);
    }

    // ?? Opción 3 ??????????????????????????????????????????????????????????????
    static void mostrarAlumnosCurso() {
        System.out.print("Curso: ");
        String curso = sc.nextLine();

        List<Alumno> lista = dao.readByCurso(curso);

        if (lista.isEmpty()) {
            System.out.println("No hay alumnos en ese curso.");
            return;
        }

        System.out.println("\nAlumnos del curso " + curso + ":");
        for (Alumno a : lista) {
            // Calcular edad
            LocalDate fnac = a.getfNacimiento().toLocalDate();
            int edad = Period.between(fnac, LocalDate.now()).getYears();

            System.out.println("- " + a.getNombre() +
                               " | Nacimiento: " + a.getfNacimiento() +
                               " | Edad: " + edad + " años");
        }
    }
}//end class