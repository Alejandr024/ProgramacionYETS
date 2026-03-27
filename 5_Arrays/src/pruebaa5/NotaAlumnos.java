
package pruebaa5;

import java.util.Arrays;
/**
 *
 * @author Daw1
 */
public class NotaAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int [][]  notas= {{6,2,4,9,1},{0,8,8,10,2},
                    {9,2,5,9,3},{5,1,1,1,4}};
        
        String [] alumnos = {"Juan","Pedro","Antonio","Luis"};
        
        System.out.println(notaMedia(notas, alumnos));
        
    }//end main
    
    
    static double descartarExtremo(int [] notas){
        double media = 0;
        
        //crear copia del array y ordenarla, evitando modificar el original
        int[] copia = Arrays.copyOf(notas, notas.length);
        Arrays.sort(copia);

        //calcular la media sin contar el valor mas alto y el mas bajo
        for(int i=1; i<notas.length-1;i++){
            media += notas[i];
        }
        media = media / (notas.length - 2);
        
        
        
        return media;
    }//end descartarExtremos
    
    
    
    static double notaMedia(double[] media){
        double resultado=0;
        
        for(int i=0; i<media.length;i++){
            resultado+=media[i];
        }
        
        resultado= resultado / media.length;
        
        return resultado;
    }
    
    static double [] notaMedia(int[][] notas, String [] alumnos){
        
        double[] media= new double[notas.length];

        
        for(int i=0; i<notas.length;i++){
            media[i]= descartarExtremo(notas[i]);
            System.out.printf("Media de %s = %.2f \n", alumnos[i], media[i]);
            

        }
        System.out.println("-----------------------");
        
        System.out.printf("Ademas, la nota media total del curso es de %.2f \n", (notaMedia(media)));
        return media;
    }//end procesarLotes
}//end class