package examenDe2024;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Agenda {

    Scanner sc = new Scanner(System.in);
    private List<Contacto> contactos;
    private Set<String> eliminados;

    public Agenda() {
        this.contactos = new ArrayList<>();
        this.eliminados = new LinkedHashSet<>();
    }

    public void agregar() {
        System.out.print("Introduce el nombre del contacto: ");
        String nombre = sc.nextLine();
        Contacto contactoExistente = buscarContactoPorNombre(nombre);

        if (contactoExistente != null) {
            System.out.print("El contacto que intentas agregar aparece en la lista, quieres modificar el telefono: ");
            String decision = sc.nextLine();
            if (decision.equalsIgnoreCase("Si")) {
                System.out.println("Llamamos al metodo para modificar el telefono del contacto.");
                System.out.print("Introduce el telefono del contacto: ");
                Integer telefono = sc.nextInt();
                Contacto nuevoContacto = new Contacto(nombre, telefono);
            } else if (decision.equalsIgnoreCase("No")) {

            } else {
                while (decision.equalsIgnoreCase("No") || decision.equalsIgnoreCase("Si")) {
                    System.out.println("Introduccion invalida, vuelva a intentarlo");
                    decision = sc.nextLine();
                }
            }
        }
    }

    public void eliminar() {
        System.out.println("Introduce el nombre a eliminar");
        
        String nombre= sc.nextLine();
        
        Contacto contactoExistente = buscarContactoPorNombre(nombre);
        
        if(contactoExistente == null){
            System.out.println("No existe el contacto");
        } else{
            contactos.remove(contactoExistente);
            eliminados.add(contactoExistente.getNombre());
        }
    }

    private Contacto buscarContactoPorNombre(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;//retorna null si no encuentra el nombre en ninguno de los contactos
    }

}//end class
