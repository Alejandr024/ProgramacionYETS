/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;



/**
 *
 * @author alej3
 */
public class MatrizMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] array ={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        
        boolean resultado= comprobacion(array);
        
        System.out.println(resultado);
        
        
    }//end main
    
    static boolean comprobacion(int [][] array){
        boolean resultado= true;
        
        int sumaFila=0;
        

        
        for(int j=0; j<array[0].length;j++){
            sumaFila+= array[0][j];
        }
        
        for(int i=1; i<array.length;i++){
            int suma=0;
            for(int j=0; j<array[i].length;j++){
                suma+=array[i][j];
            }
            if(suma!=sumaFila){
                resultado=false;
                break;
            }
        }
        
        
        for(int i=0; i<array[0].length;i++){
            int suma=0;
            for(int j=0; j<array.length;j++){
                suma+=array[j][i];
            }
            if(suma!=sumaFila){
                resultado=false;
                break;
            }
        }

        System.out.print("¿Este array es magico? ");
        
        return resultado;
    }//end comprobacion
    
    
    
    
}//end class