/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Daw1
 */
public class Prestamo {
    private int diasPrestamo;

    public Prestamo(int diasPrestamo) {
        if (diasPrestamo > 30) {
            throw new IllegalArgumentException("Máximo 30 días");
        }
        this.diasPrestamo = diasPrestamo;
    }

    public boolean getPrestamo(int dias) {
        return dias <= 30;
    }

    public void renovarPrestamo(int diasAdicionales) {
        if (diasPrestamo + diasAdicionales <= 30) {
            diasPrestamo += diasAdicionales;
        }
    }
    public void decrementarDias() {
        if (diasPrestamo > 0) {
            diasPrestamo--;
        }
    }
    
    public int diasRestantes() {
        return diasPrestamo;
    }


}//end class