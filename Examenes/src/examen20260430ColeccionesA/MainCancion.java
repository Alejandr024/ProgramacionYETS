package examen20260430ColeccionesA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class MainCancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rock = "Rock";
        List<Cancion> listRock = new ArrayList<>();

        Playlist playlistRock = new Playlist(rock, listRock);

        String pop = "Pop";
        List<Cancion> listPop = new ArrayList<>();

        Playlist playlistPop = new Playlist(pop, listPop);

        String jazz = "Jazz";
        List<Cancion> listJazz = new ArrayList<>();

        Playlist playlistJazz = new Playlist(jazz, listJazz);

        String rap = "Rap";
        List<Cancion> listRap = new ArrayList<>();

        Playlist playlistRap = new Playlist(rap, listRap);

        try (BufferedReader in = new BufferedReader(new FileReader("canciones.txt"))) {
            String linea = in.readLine();
            String[] cancionAux = new String[0];
            
            while (linea != null) {
                if (linea.isEmpty()) { //en el caso que este vacio
                    continue;
                }

                linea = linea.trim();//si hay espacios en blanco
                cancionAux = linea.split(",,");

                if (cancionAux.length == 5) {
                    double tiempo = Double.parseDouble(cancionAux[3]);
                    Cancion cancion = new Cancion(cancionAux[0], cancionAux[1], cancionAux[2], tiempo, cancionAux[4]);
                    if(cancion.getEstilo().equalsIgnoreCase("rock")){
                        playlistRock.addCancion(cancion);
                    }else if(cancion.getEstilo().equalsIgnoreCase("pop")){
                        playlistPop.addCancion(cancion);
                    }else if(cancion.getEstilo().equalsIgnoreCase("rap")){
                        playlistRap.addCancion(cancion);
                    }else if(cancion.getEstilo().equalsIgnoreCase("jazz")){
                        playlistJazz.addCancion(cancion);
                    }
                }
                linea= in.readLine();
            }
            
            
            System.out.println("----------------");
            playlistRock.mostarCancionesOrdenada();
            playlistRock.guardarArchivo("rock.dat");
            System.out.println("----------------");
            playlistPop.mostarCancionesOrdenada();
            playlistPop.guardarArchivo("pop.dat");
            System.out.println("----------------");
            playlistJazz.mostarCancionesOrdenada();
            playlistJazz.guardarArchivo("jazz.dat");
            System.out.println("----------------");
            playlistRap.mostarCancionesOrdenada();
            playlistRap.guardarArchivo("rap.dat");
              
            System.out.println("---------------------"); 
          
            playlistRock.cargarDesdeArchivo("rock.dat");
            playlistPop.cargarDesdeArchivo("pop.dat");
            playlistJazz.cargarDesdeArchivo("jazz.dat");
            playlistRap.cargarDesdeArchivo("rap.dat");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo.");
        }

    }//end main

}//end classs
