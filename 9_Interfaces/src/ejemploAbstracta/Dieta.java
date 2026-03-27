package ejemploAbstracta;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public interface Dieta {

    boolean alergias(String alimento);

    default String tipoDieta(String alimento) {
        String dieta = "Omnivoro";

        return dieta;
    }

    static void pedir() {
        System.out.println("Que alimento quieres pedir");
    }
}