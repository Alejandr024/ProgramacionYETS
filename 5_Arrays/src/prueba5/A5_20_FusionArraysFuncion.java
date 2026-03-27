/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author Administrador
 */
public class A5_20_FusionArraysFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] a = {1,2,5,3,4};
       int[] b = {0,-1,7,2};
       // Array resultante
       //int[] c = new int[a.length + b.length];
       // Copio los valores de a en c
       
        int[] c = fusionVector(a,b);
        System.out.println("Matriz fusionada y ordenada: " + Arrays.toString(c));
        
        // Aprovechar la fuincion fusionVector para fusionar arrays bidimensionales
        int [][] d = {{1,2,3,-3},{3,4,5,0}, {-1,3,4,8}};
        //System.out.println(Arrays.toString(d[0]));    
        int [][] e = {{6,7}, {5,-2}, {3,3}};
        //System.out.println(e[0].length);
        
        
//        int[][] g = new int[d.length][d[0].length + e[0].length]; 
////        g[0] = fusionVector(d[0], e[0]);
////        g[1] = fusionVector(d[1], e[1]);
////        g[2] = fusionVector(d[2], e[2]);
//         for (int i=0; i<d.length; i++) {
//             g[i] = fusionVector(d[i], e[i]);
//         }
//        
        int [][] g = fusionVector(d,e);
        
        System.out.println("Array g" + Arrays.deepToString(g));
        
        
        
    } // end MAin
    
    static int[] fusionVector(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        // inserto a en c
        for (int i =0; i < a.length; i++) {
           c[i] = a[i];
        }
        // inserto b  e c, después de los datos de a
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        Arrays.sort(c);
        return c;
    }
    
    //
        static int[][]  fusionVector(int[][] d, int[][] e) {
            int[][] g = new int[d.length][d[0].length + e[0].length]; 
                     for (int i=0; i<d.length; i++) {
             g[i] = fusionVector(d[i], e[i]);
            }
        return g;
        }
    
} // end Class
