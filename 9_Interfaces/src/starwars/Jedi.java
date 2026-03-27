package starwars;

/**
 * Clase Jedi que hereda de {@link PersonajeStarWar} e implementa la interfaz
 * {@link WhatsApp} y Comparable.
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Jedi extends PersonajeStarWar implements WhatsApp, Comparable {

    /**
     * Creamos las siguientes variables:
     *
     * @param enamorado muestra si el Jedi esta enamorado o no.
     * @param bloqueados un array de personas que ha bloqueados el Jedi.
     * @param pareja pareja del Jedi si es que tiene.
     */
    private boolean enamorado;

    /**
     *
     */
    protected String[] bloqueados;
    private PersonajeStarWar pareja;

    /**
     * Crea un nuevo Jedi con sus atributos de combate y sociales inicializados
     * por defecto.
     *
     * @param nombre Nombre del Jedi.
     * @param fuerza Nivel de fuerza del Jedi.
     * @param estado Estado vital (vivo o muerto).
     * @param midiclorianos Cantidad de diclorianos que tiene el Jedi.
     */
    public Jedi(String nombre, int fuerza, Estado estado, int midiclorianos) {
        super(nombre, fuerza, estado, midiclorianos);
        this.enamorado = false;
        this.bloqueados = new String[0];
        this.pareja = null;
    }

    /**
     * Se presenta al Jedi donde indica su bando dependiendo del nivel de
     * fuerza. Si la fuerza es mayor a 5, se considera del lado oscuro.
     */
    @Override
    public void presentarse() {
        System.out.println("Soy el Jedi " + getNombre() + ". Tengo " + getMidiclorianos()
                + " midiclorianos y pertenezco al lado " + (getFuerza() > 5 ? "oscuro" : "de la luz") + ".");
    }

    /**
     * Vincula este Jedi con otro personaje de forma sentimental.
     *
     * @param jediEnamorado Jedi elegido para vincular.
     */
    @Override
    public void enamorarse(PersonajeStarWar jediEnamorado) {
        this.enamorado = true;
        this.pareja = jediEnamorado;
        System.out.println(getNombre() + " esta enamorado de " + jediEnamorado.getNombre() + ".");
    }

    /**
     * Bloquea al personaje seleccionado, evitando que le envio de mensajes.
     *
     * @param personaje personaje bloqueado por el Jedi.
     */
    @Override
    public void bloquear(PersonajeStarWar personaje) {
        // Implementa la logica para bloquear a un Jedi.
        // (agregarlo a la lista de bloqueados y actualizar enamorado si es necesario)
        System.out.println(getNombre() + " ha bloqueado a " + personaje.getNombre() + ".");
        append(personaje.getNombre());
    }

    /**
     * Agrega al personaje bloqueado a una lista de bloqueados que tiene el
     * Jedi.
     *
     * @param nuevoBloqueado personaje agregado a la lista de bloqueados del
     * Jedi.
     */
    private void append(String nuevoBloqueado) { //Agrega un objeto String a la lista de bloqueados del objeto Jedi
        String[] nuevoArrayBloqueados = new String[bloqueados.length + 1]; // Creo un array con un elemento mas que de this.lista
        for (int i = 0; i < bloqueados.length; i++) { // Copio todos los elementos de this.lista al principo de la lista de nuevoArrayString 
            nuevoArrayBloqueados[i] = bloqueados[i];
        }
        nuevoArrayBloqueados[nuevoArrayBloqueados.length - 1] = nuevoBloqueado;  // Agrego el nuevoString el la ultima posicion del nuevoArrayString
        this.bloqueados = nuevoArrayBloqueados; // Reescribo la lista de individuos del objeto listado que invoca el metodo, no necesito reescribir el objeto Listado
    }

    /**
     * @return true si el Jedi esta enamorado, devuelve false si el Jedi no esta
     * enamorado.
     */
    public boolean isEnamorado() {
        return enamorado;
    }

    /**
     * @return la lista de bloqueados del Jedi.
     */
    public String[] getBloqueados() {
        return bloqueados;
    }

    /**
     * @return pareja del Jedi, si no tiene, devuelve null.
     */
    public PersonajeStarWar getPareja() {
        return pareja;
    }

    /**
     * Muestra infromacion del Jedi.
     *
     * @return todos los datos del Jedi.
     */
    @Override
    public String toString() {
        if (pareja == null) {
            return super.toString() + "(Enamorado: " + enamorado + " - Sin Pareja)";
        } else {
            return super.toString() + "(Enamorado: " + enamorado + " - Pareja: " + pareja.getNombre() + ")";
        }
    }

    /**
     * Envia un mesaje de un Jedi a otro Jedi, para ello, necesita los
     * siguientes parametros:
     *
     * @param jedi Jedi detinatario.
     * @param mensaje Mensaje que envia el Jedi emisor al Jedi destinatario.
     */
    public void enviar(Jedi jedi, String mensaje) {
        if (bloqueados.length != 0) {
            for (int i = 0; i < bloqueados.length; i++) {
                if (jedi.getNombre().equals(bloqueados[i])) {
                    System.out.println("El usuario " + jedi.getNombre() + " te ha bloqueado");
                } else {
                    System.out.println("Tu mensaje esta recibiendo tu mensaje telematicamente");
                }
            }
        } else {
            System.out.println("Se ha enviado el mensaje a " + jedi.getNombre() + " telematicamente: " + mensaje);
        }
    }

    /**
     * Se encarga de ordenar los Jedis por medio de los diclonarios.
     *
     * @param o Jedi que compara.
     * @return el resultado, dependiendo del resultado sera mayor, menor o
     * igual.
     */
    @Override
    public int compareTo(Object o) {
        Jedi auxJedi = (Jedi) o;
        return (this.getMidiclorianos() - auxJedi.getMidiclorianos());
    }

}//end class
