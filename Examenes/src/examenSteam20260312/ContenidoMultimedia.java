package examenSteam20260312;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public interface ContenidoMultimedia {

    //agregamos los dos metodos: (mostrar detalles y aviso de privacidad)
    void mostrarDetalles();

    static void avisoPrivacidad() {
        //imprime un aviso al llamarlo
        System.out.println("Este contenido esta vinculado a su cuenta personal.");
    }

}//end interface
