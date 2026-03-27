package registro;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Registro implements Serializable{
    
    double temperatura;
    LocalDateTime fechaYHora; // Guarda year, mes, día, hora, min, seg.

    // Constructor: La fecha se genera automaticamente al crear el objeto
    Registro(double temperatura) {
        this.temperatura = temperatura;
        this.fechaYHora = LocalDateTime.now(); // Captura el instante actual
    }

    @Override
    public String toString() {
        // Formateador para que la fecha sea legible (ej: 26/03/24 10:30)
        DateTimeFormatter f = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT)
                .withLocale(Locale.getDefault());
        
        return String.format("Temp: %-6.2f°C | Fecha: %-10s\n", 
                             temperatura, f.format(fechaYHora));
    }
    
    public void mostrar(Registro [] a){
        
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    
    
}//end class