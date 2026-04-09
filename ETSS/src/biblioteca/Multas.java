/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Daw1
 */
public class Multas {
    private double multaTotal;

    public void calcularMulta(int diasRetraso) {
        try {
            if (diasRetraso < 0) {
                throw new IllegalArgumentException("Los dias deben de ser minimo de 0.");
            }
            multaTotal = diasRetraso * 1.5;
        } catch (Exception e) {
            multaTotal = Double.POSITIVE_INFINITY;
        }
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            multaTotal -= multaTotal * (porcentaje / 100);
        }
    }

    public double getMultaTotal() {
        return multaTotal;
    }
}//end class