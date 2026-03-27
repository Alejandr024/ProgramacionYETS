package starwars;

/**
 * Interfaz que define las interacciones sociales basicas de los personajes de
 * Star Wars
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public interface RedesSociales {

    /**
     * Realiza una presentacion del personaje por medio de la consola.
     */
    void presentarse();

    /**
     * Vincula este Jedi con otro personaje de forma sentimental.
     *
     * @param nombreJedi Jedi elegido para vincular.
     */
    void enamorarse(PersonajeStarWar nombreJedi);

    /**
     * Bloquea al personaje seleccionado, evitando que le envio de mensajes.
     *
     * @param nombreBloqueado personaje bloqueado por el Jedi.
     */
    void bloquear(PersonajeStarWar nombreBloqueado);

}//end interface
