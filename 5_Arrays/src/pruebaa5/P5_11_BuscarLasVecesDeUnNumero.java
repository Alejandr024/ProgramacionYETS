package pruebaa5;


//import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author alej3
 */
public class P5_11_BuscarLasVecesDeUnNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array={2,4,5,3,2,2,6,8,2,10};
        
        int clave=2;
        
        int[] buscarTodos= buscarTodos(array, clave);

        System.out.println(Arrays.toString(buscarTodos));
        
    }//end main
    
    
    static int[] buscarTodos(int t[], int clave){
        int[] resultado = new int [t.length];
        
        for(int i =0; i<t.length;i++){
            for(int j=0; j<i; j++){
                if(t[j]==clave){ 
                    resultado[j]=t[j]; 
                }                
            }
        }
        
        System.out.println("El numero " + clave + " se encuentra en las siguientes posiciones: ");
        return resultado;
    }//end buscarTodos
    
    
}//end class
