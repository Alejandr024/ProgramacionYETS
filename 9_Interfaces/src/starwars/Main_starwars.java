package starwars;

import java.util.Arrays;

/**
 * Clase principal que ejecuta la simulación de interacciones sociales entre
 * Jedis.
 *
 * @author Alejandro Miguel Gomez Gonzalez.
 */
public class Main_starwars {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Jedi padmeAmidala = new Jedi("Padme Amidala", 8, Estado.VIVO, 12000); // Crea la variable de Padme.
        Jedi obiWan = new Jedi("Obi-Wan Kenobi", 8, Estado.VIVO, 15000); // Crea la variable de Obi Wan

        obiWan.presentarse(); // Obi-Wan se presenta.

        obiWan.enamorarse(padmeAmidala); // Obi-Wan se enamora de Padme.

        Jedi anakin = new Jedi("Anakin Skywalker", 9, Estado.VIVO, 18000); // Crea la variable de Anakin.
        Jedi anakinFuerte = new Jedi("Anakin Skywalker", 19, Estado.VIVO, 28000); // Crea la variable de Anakin mas fuerte.
        Jedi anakinFlojo = new Jedi("Anakin Skywalker", 3, Estado.VIVO, 8000); // Crea la variable de Anakin mas flojo.
        anakin.presentarse(); // Imprime informacion sobre Anakin

        anakin.bloquear(obiWan); // Anakin bloquea a Obi-Wan

        System.out.println(Arrays.toString(anakin.bloqueados)); // Imprime la lista de bloqueados de Anakin
        System.out.println(obiWan);// Imprime informacion sobre Obi Wan.

        anakin.enviar(obiWan, "Estas enfadado?"); // Envia mensaje
        obiWan.enviar(anakin, "Ya te he desbloqueado"); // Envia mensaje.
        Jedi[] arrayJedi = {anakin, padmeAmidala, obiWan, anakinFlojo, anakinFuerte}; // Crea un array de Jedis.
        Registro registro = new Registro(arrayJedi); //Agrega el array de Jedis en la clase Registro.

        registro.ordenarNombre(); //Ordena los Jedis por nombre.
        registro.mostrarRegistro(); // muestrra el registro.
    }//end main

}//end class
