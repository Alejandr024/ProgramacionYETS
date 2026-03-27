/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listado;

import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class Listado {
    Individuo[] individuos;

    public Listado() {
        this.individuos = new Individuo[0];
    }
    
    public Listado(Individuo[] individuos){
        this.individuos=individuos;
    }
    
    public void append(Individuo individuo){
        individuos= Arrays.copyOf(individuos, individuos.length+1);
        
        
        individuos[individuos.length-1]=individuo;
    }
    
    public Listado add(Individuo individuo){
        Individuo [] arrayAux= Arrays.copyOf(individuos, individuos.length+1);
        
        
        arrayAux[arrayAux.length-1]= individuo;
        
        return new Listado(arrayAux);
    }
}//end class