package examen20260212Herencia;
import java.util.Random;
/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */

//hacemos que humano se herede hacia especie
public class Humano extends Especie{
    String nombre;

    //contructo
    public Humano(String nombre, int sexo, int edad) {
        super(sexo, edad);
        this.nombre=nombre;
    }
    //mostramos el nombre
    public void consultarNombre(){
        System.out.println("El nombre del humano es " + this.nombre +".");
    }
    // comprobamos si se infectan
    public void contacto(Humano humano2){
        Random rnd= new Random();
        int dado= rnd.nextInt(10)+1;
        
        if(infectado && !humano2.infectado){
            System.out.println("El humano infectado "+ nombre + ", que ha invocado el metodo, esta infectado. "
                    + "Por tanto, ha infectado al humano " + humano2.nombre + ".");
            humano2.infectado= true;
        }else if(!infectado && humano2.infectado){
            switch(dado){
                case 1,2,3,4,5,6:
                    System.out.println("El humano infectado " + humano2.nombre + " ha infectado al invocador " + nombre + ".");
                    infectado=true;
                    break;
                case 7,8,9,10:
                    System.out.println("El humano infectado " + humano2.nombre + " no ha podido infectar al invocador " + nombre + ".");
            }
        }else{
            System.out.println("Los dos humanos estan sanos.");
        }   
    }
    
    //mostrar
    @Override
    public String toString() {
        return "Nombre:" + nombre + " \n" + super.toString();
    }
    
}// end class