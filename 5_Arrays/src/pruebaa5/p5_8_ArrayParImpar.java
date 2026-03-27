package pruebaa5;
import java.util.Arrays;


//Crear un prgama que tenga un array con numeros pares e impares y diivida en dos arrays diferentes y hacerlo en una función.
public class p5_8_ArrayParImpar {
    public static void main(String[] args) {

        int[] arrayOriginal= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println( "Longitud arrayOriginal: " + arrayOriginal.length);

        System.out.println("Separando array en pares e impares:");
        separaArray(arrayOriginal);
    }//end main


    //funcion para separar arrays
    static int[] separaArray (int[] arrayOriginal){
        int contadorPar=0;
        int contadorImpar=0;
        //contar pares e impares
        for(int i=0; i<arrayOriginal.length; i++){
            if(arrayOriginal[i]%2==0){
                contadorPar++;
            }else{
                contadorImpar++;
            }
        }
        //crear arrays con la longitud adecuada
        int[] arrayPar= new int[contadorPar];
        System.out.println( "Longitud arrayPar: " + arrayPar.length);
        int[] arrayImpar= new int[contadorImpar];
        System.out.println( "Longitud arrayImpar: " + arrayImpar.length);   
        //rellenar arrays
        int indicePar=0;
        int indiceImpar=0;
        for(int i=0; i<arrayOriginal.length; i++){
            if(arrayOriginal[i]%2==0){
                arrayPar[indicePar]= arrayOriginal[i];
                indicePar++;
            }else{
                arrayImpar[indiceImpar]= arrayOriginal[i];
                indiceImpar++;
            }
        }
        System.out.println("Array original: " + Arrays.toString(arrayOriginal));

        System.out.println("Array pares: " + Arrays.toString(arrayPar));

        System.out.println("Array impares: " + Arrays.toString(arrayImpar));

        return arrayImpar; 

    }//end separaArray
}//end class
