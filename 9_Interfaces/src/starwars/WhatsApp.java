package starwars;

/**
 * Interfaz que hereda de {@link RedesSociales}, esta permite el envio de mensajes.
 * @author Alejandro Miguel Gomez Gonzalez
 */
public interface WhatsApp extends RedesSociales {
    /**
     * Envia un mensaje a otro Jedi.
     * @param jedi Jedi destinatario.
     * @param mensaje mensaje que envia el Jedi emisor al Jedi destinatario.
     */
    void enviar(Jedi jedi, String mensaje);
    
}
