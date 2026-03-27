//package simulacro;
//import java.util.Scanner;
//import java.util.Arrays;
///**
// *
// * @author Daw1
// */
//public class ControlDeCalidadEnFábrica {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//    
//        double [][]  voltajes= {{3.6,3.8,3.7,3.2,3.7},{4.0,4.1,4.0,3.9,4.2},
//                      {3.5,3.5,3.4,3.6,3.5},{3.8,3.9,3.8,3.9,4.5}};
//        
//        
//        System.out.println(procesarLotes(voltajes));
//
//        
//    }//end main
//    
//    static double calcularMediana(double[] voltajes){
//        Arrays.sort(voltajes);
//        
//        return voltajes[2];
//    }
//    
//    static double[][]procesarLotes(double[][] voltajes){
//        
//        double[] mediana= new double[voltajes.length];
//
//        
//        for(int i=0; i<voltajes.length;i++){
//            mediana[i]= calcularMediana(voltajes[i]);
//        }
//        
//
//        
//        return mediana;
//    }//end procesarLotes
//    
//
//   
//}//end class