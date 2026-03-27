package starwars;

/**
 * Clase que representa a un personaje de Star Wars Cntiene informacion, ya sea
 * fisica o biologica basica.
 *
 * @author Alejandro Miguel Gomez Gonzalez.
 */
public class PersonajeStarWar {

    private String nombre;
    private double fuerza;
    private Estado estado;
    private int midiclorianos;

    /**
     * Formamos el constructor del personajes con sus variables.
     *
     * @param nombre Nombre del personaje.
     * @param fuerza fuerza del personaje.
     * @param estado estado del personajes (vivo o muerto).
     * @param midiclorianos cantidad de diclonarias del personaje.
     */
    public PersonajeStarWar(String nombre, int fuerza, Estado estado, int midiclorianos) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.estado = estado;
        this.midiclorianos = midiclorianos;
    }

    /**
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return la fuerza
     */
    public double getFuerza() {
        return fuerza;
    }

    /**
     * @return el estado, solo son dos opciones: vivo o muerto.
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @return los diclorianos
     */
    public int getMidiclorianos() {
        return midiclorianos;
    }

    /**
     * Muestra informacion del personaje.
     *
     * @return una cadena que contiene informacion del personaje.
     */
    @Override
    public String toString() {
        return String.format("%-20s  %-4.1f  %-6s  %-4d ", nombre, fuerza, estado, midiclorianos);
    }

}//end class
