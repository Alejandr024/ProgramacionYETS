package instituto;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Main {

    public static void main(String[] args) {

        AlumnoDAO dao = new AlumnoDAO();

        // ?? Leer todos ????????????????????????????????
        System.out.println("=== TODOS LOS ALUMNOS ===");
        List<Alumno> alumnos = dao.readAll();
        for (Alumno a : alumnos) {
            System.out.println(a);
        }

        // ?? Leer uno por ID ???????????????????????????
//        System.out.println("\n=== ALUMNO CON ID 2 ===");
//        Alumno a = dao.read(2);
//        System.out.println(a);

        // ?? Insertar nuevo ????????????????????????????
//        System.out.println("\n=== INSERT NUEVO ALUMNO ===");
//        Alumno nuevo = new Alumno("Eva Espárrago", Date.valueOf("2010-05-20"), 7.0, "1B");
//        dao.create(nuevo);

        // ?? Actividad U14A1: subir media del 1B ???????
        System.out.println("\n=== SUBIR MEDIA CURSO 1B ===");
        dao.incrementarMediaCurso("1B", 1.0);

        // ?? Verificar cambios ?????????????????????????
        System.out.println("\n=== ALUMNOS TRAS ACTUALIZACIÓN ===");
        dao.readAll().forEach(System.out::println);//formas mas compacta de recorrer la lista e imprimirlas

        // ?? Eliminar el alumno recién insertado ???????
//        System.out.println("\n=== DELETE ALUMNO ID 5 ===");
//        dao.delete(5);
    }
}