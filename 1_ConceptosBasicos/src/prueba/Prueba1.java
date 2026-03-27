package prueba;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 4+6/2; //7
        System.out.println(a);
        double b = 4*(6+2);//32
        System.out.println(b);
        double c = (9-4)*(2+3)/3;//
        System.out.println(c);
        int x = 3;
        int y = 4*++x + x++;
        System.out.println(y);//20
        
        int z = 2;
        System.out.println(3*z+2);//8
        
        int e = 4;
        int f = 5;
        int g = e+f;
        e++;
        System.out.println(g);//10
        int h = 34;
        h/=2;
        int i = --h;
        i*=2;
        System.out.println(i);//32
        
    }
    
}
