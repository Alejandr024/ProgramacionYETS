/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class Lista {
    private int [] arrayLista;

    public Lista() {
        this.arrayLista= new int[0];
    }

    
    
    public Lista(int[] arrayLista) {
        this.arrayLista = arrayLista;
    }
    
    public void insertarPrincipio(int number){
        int[] arrayAux= new int[arrayLista.length+1];
        
        arrayAux[0]=0;
        
        for(int i=1; i<arrayAux.length;i++){
            arrayAux[i]= arrayLista[i-1];
        }
        
        arrayLista=arrayAux;
        
    }
    
    public Lista concatenar(Lista lista2){
        
//       int[] arrayAux= new int[this.arrayLista.length+lista2.arrayLista.length];
        
        int [] arrayAux= Arrays.copyOf(this.arrayLista, this.arrayLista.length+lista2.arrayLista.length);
        
        for(int i=0; i<lista2.arrayLista.length;i++){
            arrayAux[i+this.arrayLista.length]= lista2.arrayLista[i];
        }
        
        
        
        
        return new Lista(arrayAux);
    }

    
    
    public  static Lista concatenar( Lista lista1, Lista lista2){
        
        int[] arrayAux= new int[lista1.arrayLista.length+lista2.arrayLista.length];
        
        
        for(int i=0; i<lista1.arrayLista.length;i++){
            arrayAux[i]= lista1.arrayLista[i];
        }
        
        for(int i=0; i<lista2.arrayLista.length;i++){
            arrayAux[i + lista1.arrayLista.length]= lista2.arrayLista[i];
        }
        
        return new Lista(arrayAux);
    }
    
    
    public void append(int [] array,int numero){
        
        array= Arrays.copyOf(array, array.length+1);
        array[array.length-1]=numero;
        
    }
    
    
    
    @Override
    public String toString() {
        String texto= "Contenido de la lista\n";
        
        
        for(int i=0; i<arrayLista.length;i++){
            texto+=arrayLista[i] +" ";
        }
        
        
        return texto;
    }
    
    
    
    
    
    
}//end class