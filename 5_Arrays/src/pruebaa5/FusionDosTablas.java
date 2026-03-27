
package pruebaa5;
import java.util.Arrays;
/**
 *
 * @author Daw1
 */
public class FusionDosTablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] a= {1,2,5,3,4};
        int[] b= {0,-1,7,2,3};
        //Array resultante
        
        int[] c = fusion(a,b);

        
        System.out.println("Meter a y b en c: " + Arrays.toString(c));
        
    }//end main
    
    
    static int[] fusion (int[]a, int[]b){
        
        int []c = new int [a.length+b.length];
        //copio los valores de a en c
        
        for(int i =0; i<a.length;i++){
            c[i]=a[i];
            for(int j =0; j<b.length;j++){
            c[j+a.length]= b[j];// empieza justo cuando en el principio del array de b
        }
        }
//        for (int i = 0; i < c.length; i++) {
//            for (int j = 0; j < c.length - i - 1; j++) {
//                if (c[j] > c[j + 1]) {
//                    int [c[j], c[j + 1]] = [c[j + 1], c[j]];
//                }
//            }
//        }

        Arrays.sort(c);
        return c;
    }//end fusion
    
    
}//end class