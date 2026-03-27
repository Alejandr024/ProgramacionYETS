
package arrays;

/**
 *
 * @author Administrador
 */
public class A5_18_MatrizMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] a = {{1,2,6}, {2,3,1}, {3,1,2}};
        matrizMagica(a);
        
        
    }
    
    static void matrizMagica(int[][]matriz) {
        // Compruebo si la matriz es cuadrada, si no lo es imprimo que no se puede
        boolean ismagica = true;
        if (matriz.length != matriz[0].length) {
            System.out.println("La Matriz no es cuadrada");
        } else {
            // copruebo que todas las filas y columnas suman los mimo que la primera fila
            int valor = sumaFila(matriz[0]);

            System.out.println("Valor mágico: " + valor);
            
            for (int i = 1;   i < matriz[0].length; i++) {
               if (valor != sumaFila(matriz[i])){
                   ismagica = false;
                   break;
               }
            }
   
            if (ismagica) {
                for (int i = 0; i < matriz[0].length; i++) {
                    if (valor != sumaColumna(matriz,i)) {
                        ismagica = false;
                        break;
                    }
                }
            }
        }
        
        if (ismagica) {
            System.out.println("Matriz magica");
        } else {
            System.out.println("La matriz NO es magica");
        }
        
        
    }  // end Main
    
    static int sumaFila(int[] fila) {
        int valor =0;
        for (int i =0; i < fila.length; i++)     {
            valor += fila[i];
        }
               
        return valor;
    }
    
       static int sumaColumna(int[][] matriz, int col) {
        int valor =0;
        for (int i = 0; i < matriz.length; i++) {
            valor += matriz[i][col];
        }
            
        return valor;
    } 
    
}
