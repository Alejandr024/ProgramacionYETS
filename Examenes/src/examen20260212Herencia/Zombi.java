package examen20260212Herencia;

import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
//hacemos que el zombi se herede hacia especie
public class Zombi extends Especie{
    String evolution;
    String[] arrayTipos= {"Lento","Rapido","Inteligente","Alfa"};
//contrucot y su sobrecarga
    public Zombi(int sexo, int edad) {
        super(sexo, edad);
        this.infectado=true;
        this.evolution="Lento";
    }
    
    public Zombi(int sexo, int edad, int indice) {
        super(sexo, edad);
        this.infectado=true;
        this.evolution=arrayTipos[indice];
    }
    //mostramos el tipo
    public void tipo(){
        System.out.println("Zombi tipo: " + evolution + ".");
    }
    
    //hacemos que evolucione
    public void evoluciona(){
        if(this.evolution==arrayTipos[0]){
            this.evolution= arrayTipos[1];
            System.out.println("El zombi paso de ser "+ arrayTipos[0] + " a ser " + this.evolution + ".");
            
        }else if(this.evolution==arrayTipos[1]){
            this.evolution= arrayTipos[2];
            System.out.println("El zombi paso de ser "+ arrayTipos[1] +" a ser " + this.evolution + ".");
        }else if(this.evolution==arrayTipos[2]){
            this.evolution= arrayTipos[3];
            System.out.println("El zombi paso de ser " + arrayTipos[2] + " a ser " + this.evolution + ".");
        }else if(this.evolution==arrayTipos[3]){
            System.out.println("El zombi ya no puede evolucionar, pues a llegado al maximo que es " + this.evolution + ".");
        }   
    }
    
    
    //mostramos
   @Override
    public String toString() {
        return "Evolucion:" + evolution + " \n" + "Tipos de evolucion: "+ Arrays.toString(arrayTipos) + " \n" + super.toString();
    }
    
}//end class