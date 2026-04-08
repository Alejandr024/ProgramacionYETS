package examen20260212Herencia;

import java.util.Random;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Especie {

    //valores
    int sexo;
    int edad;
    boolean infectado;

    //contructor
    public Especie(int sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
        this.infectado = false;
    }

    //comprbamos si esta infectado
    public void infectado(Humano humano) {
        if (!infectado) {
            System.out.println(humano.nombre + " no esta infectado.");
        } else {
            System.out.println(humano.nombre + " esta infectado.");
        }

    }

    //hacemo que el humanos se infecte
    public void cambiarInfectado() {
        if (!infectado) {
            infectado = true;
            System.out.println(" ahora esta infectado.");
        }
    }

    //lo poneos en contacto con un zombi
    public static void contacto(Zombi zombi) {
        Random rnd = new Random();
        boolean dado = rnd.nextBoolean();

        if (dado) {
            System.out.println(" ha sido infectado. (probabilidad del 50%)");
        } else {
            System.out.println(" no ha sido infectado.");
        }

    }

    //mostrar
    @Override
    public String toString() {
        String texto;
        if (this.sexo == 1) {
            texto = "Masculino";
        } else if (this.sexo == 2) {
            texto = "Femenino";
        } else {
            texto = "No definido";
        }

        return String.format("Sexo: %-10s \nEdad: %-10d \nInfectado?: %-10s", texto, edad, (infectado ? "SI" : "NO"));
    }

}//end class
