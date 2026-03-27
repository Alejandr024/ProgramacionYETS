
package simulacro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author jvega
 */
public class OrganizacionAsesinos {
    private Asesino[] arrayAsesinos;
    private String universo;
    private static Random rnd = new Random();

    public OrganizacionAsesinos() {
        this.arrayAsesinos = new Asesino[0];
        universo = "Sakamoto";
    }

    public OrganizacionAsesinos(Asesino[] arrayAsesinos, String universo) {
        this.arrayAsesinos = arrayAsesinos;
        this.universo = universo;
    }
    
    public void simularCombate(Asesino asesino1, Asesino asesino2) {
         int puntuacion1 = asesino1.calcularPuntuacionCombate();
         int puntuacion2 = asesino2.calcularPuntuacionCombate();
         String ganador = asesino1.getNombre();
         String perdedor = asesino2.getNombre();
         if (puntuacion1 > puntuacion2) {             
             System.out.println( asesino1.getNombre() +  " gana a " + asesino2.getNombre() 
                     + "(" + puntuacion1 + " vs " + puntuacion2 + ")");
         } else if (puntuacion2 > puntuacion1) {
             System.out.println( asesino2.getNombre() +  " gana a " + asesino1.getNombre() 
                     + "(" + puntuacion2 + " vs " + puntuacion1 + ")");
             ganador = asesino2.getNombre();
             perdedor = asesino1.getNombre();
             asesino2.registrarCombate(obtenerFecha(), asesino2.getNombre(), asesino1.getNombre());
         } else {
             System.out.println("No hay ganador, no se registra el combate");
         }
         if (puntuacion1 != puntuacion2) {
             String fecha = obtenerFecha();
             asesino1.registrarCombate(fecha, ganador, perdedor);
             asesino2.registrarCombate(fecha, ganador, perdedor);
         }
         
    }
    
    public void simularCombate() {
        int indice1 = 0;
        int indice2= 0;
        if (arrayAsesinos.length < 2) {
            System.out.println("No hay suficientes asesinos para organizar un combate");     
        } else {
          indice1 = rnd.nextInt(arrayAsesinos.length);
          indice2 = rnd.nextInt(arrayAsesinos.length);
          while (indice1 == indice2) {
              indice2 = rnd.nextInt(arrayAsesinos.length);
          }
        }
        simularCombate(arrayAsesinos[indice1], arrayAsesinos[indice2]);
        
        
    }


    
     // Devuelve fecha-hora actual
    public static String obtenerFecha() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return ahora.format(fmt);
    }
    
      // Añadir asesino (append)
    public void append(Asesino nuevoAsesino) {  
        arrayAsesinos = Arrays.copyOf(arrayAsesinos, arrayAsesinos.length+1);
        arrayAsesinos[arrayAsesinos.length-1]= nuevoAsesino;
    }

       public Asesino getAsesino(int indice) {
        if (indice < 0 || indice >= arrayAsesinos.length) return null;
        return arrayAsesinos[indice];
    }

      // Buscar por nombre que contenga la palabra (ignorando mayÃºsculas/minÃºsculas)
    public void buscar(String nombre) {
        System.out.println("Nombre            intelig.      suerte  licencia");   
        nombre = nombre.toLowerCase();
        for (int i = 0; i < arrayAsesinos.length; i++) {
            Asesino a = arrayAsesinos[i];
            if (a.getNombre().toLowerCase().contains(nombre)) {
                System.out.println(a);
            }
        }

        
    }

    @Override
    public String toString() {
        String salida = "OrganizacionAsesinos (Universo " + getUniverso() + ")\n";
        salida += "Nombre            intelig.      suerte  licencia\n";
        for (int i =0; i <arrayAsesinos.length; i++) {
              salida += arrayAsesinos[i] + "\n";
        }
        return salida;
    }

    /**
     * @return the universo
     */
    public String getUniverso() {
        return universo;
    }

}
