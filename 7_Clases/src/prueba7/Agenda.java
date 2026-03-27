
package prueba7;

import java.util.Arrays;

/**
 *
 * @author jvega
 */
public class Agenda {
    
    private Contacto[] arrayContactos;
    private int[] arraySocios;

    public Agenda() {
        arrayContactos = new Contacto[0]; //Inicializo una agenda sin ningun contacto
        arraySocios = new int[0];         //Inicializo una agenda sin ningun socio
    }

    public Agenda(Contacto[] arrayContacto) {
        this.arrayContactos = arrayContacto; //Inicializo una agenda con un array de contactos
        int[] newArraySocio = new int[arrayContacto.length]; // Crea Array auxiliar de enteros con una dimension mas que socio
        for (int i = 0; i < arrayContacto.length; i++) {  // Añado a cada socio un numero consecutivo empezando por 1
            newArraySocio[i] = i + 1;
        }   
        this.arraySocios = newArraySocio; // Reescribo el array de socio igualando al nuevoArray de enteros creado
    }
        
    

    public void append(Contacto nuevoContacto) {
        int newSize = getContactos().length + 1; // Establezco la dimension de los nuevos array (1 unidad mÃ¡s que los anteriores)
        Contacto[] nuevoArrayContacto = new Contacto[newSize];
        int[] nuevoArraySocio = new int[newSize];
        
        for (int i = 0; i < getContactos().length; i++) {
            nuevoArrayContacto[i] = getContactos()[i];
            nuevoArraySocio[i] = getSocios()[i];
        }
        
        //arrayContactos= Arrays.copyOf(arrayContactos.arrayContactos.length+1);
        //arraySocios= Arrays.copyOf(arraySocios.arraySocios.length+1)
        //esto tambien sirve
        
        nuevoArrayContacto[newSize - 1] = nuevoContacto;
        nuevoArraySocio[newSize - 1] = newSize;

        this.arrayContactos = nuevoArrayContacto;
        this.arraySocios = nuevoArraySocio;
    }

    @Override
    public String toString() {
        String stringAgenda = "Contenido de la agenda: \n";
        for (int i = 0; i < getContactos().length; i++) {
            stringAgenda += this.getSocios()[i] + "\t" + getContactos()[i] + "\n" ;
        }
        
        return stringAgenda;
    }

    /**
     * @return the contactos
     */
    public Contacto[] getContactos() {
        return arrayContactos;
    }

    /**
     * @return the socio
     */
    public int[] getSocios() {
        return arraySocios;
    }
    
}//end class