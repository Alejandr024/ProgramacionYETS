
package ejercicioChatiGpt;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
/**
 *
 * @author jvega
 */
public class Agenda {
//    Contacto[] arrayContactos;
//    int[] arrayFechas;
//
//    public Agenda() {
//        arrayContactos = new Contacto[0];
//        arrayFechas = new int[0];
//    }
//    
//
//    public Agenda(Contacto[] arrayContactos) {
//        this.arrayContactos = arrayContactos;
//        arrayFechas = new int[arrayContactos.length];
//        Arrays.fill(arrayFechas, obtenerFecha()) ;
//    }
//    
//    
//    
//      // Devuelve fecha-hora actual
//    public static int obtenerFecha() {
//        LocalDateTime ahora = LocalDateTime.now();
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd");
//        int fecha = Integer.parseInt(ahora.format(fmt));
//        return fecha;
//    }
//
//    @Override
//    public String toString() {
//        String listado = "Listado de la Agenda de los Simpsons:\n" + 
//                String.format("\t%-10s %-12s  %-12s %-10s\n", "Fecha", "Nombre", "Apellido", "Telefono");
//        for(int i=0; i < arrayContactos.length; i++) {
//            listado += "\t" + arrayFechas[i] + "   " + arrayContactos[i] + "\n";
//        }
//        
//        return listado;
//    }
//    
//    public boolean eliminarContacto(Contacto aEliminar) {
//        boolean respuesta = false;
//        Contacto[] newArrayContactos  = new Contacto[0];
//        int[] newArrayFechas = new int[0];
//        for (int i =0; i < arrayContactos.length; i++) {
//            if (!arrayContactos[i].equals(aEliminar)) {
//                newArrayFechas = Arrays.copyOf(newArrayFechas, newArrayFechas.length +1);
//                newArrayFechas[newArrayFechas.length-1] = arrayFechas[i];
//                newArrayContactos = Arrays.copyOf(newArrayContactos, newArrayContactos.length +1);
//                newArrayContactos[newArrayContactos.length-1] = arrayContactos[i];
//            } else {
//                System.out.println("El contacto " + arrayContactos[i].getNombre() +  " ha sido eliminado");
//                respuesta = true;
//            }
//        }
//        arrayContactos = newArrayContactos;
//        arrayFechas = newArrayFechas;
//        return respuesta;
//    }   
//    
//    public void append(int fecha, Contacto newContacto) {
//         arrayContactos = Arrays.copyOf(arrayContactos, arrayContactos.length+1);
//         arrayContactos [arrayContactos.length-1] = newContacto;
//         arrayFechas =  Arrays.copyOf(arrayFechas, arrayFechas.length+1);
//         arrayFechas [arrayFechas.length-1] = fecha;
//    }
//    
//       public void append(Contacto newContacto) {
//         arrayContactos = Arrays.copyOf(arrayContactos, arrayContactos.length+1);
//         arrayContactos [arrayContactos.length-1] = newContacto;
//         arrayFechas =  Arrays.copyOf(arrayFechas, arrayFechas.length+1);
//         arrayFechas [arrayFechas.length-1] = obtenerFecha() ;
//    }
    
}
