package facebook;

/**
 *
 * @author Daw1
 */
public class Usuario {
    private String nick;
    private String email;
    private int telefono=0;
 
    //Constructor (como Arbeloa)
    Usuario(String nick, String email, int telefono){
        this.nick= nick;
        this.email= email;
        this.telefono= telefono;
    }
    
    Usuario(String nick, String email){
        this.nick= nick;
        this.email= email;
        this.telefono=0;
    }
    
    Usuario(){
        this.nick="No definido";
        this.email="No definido";
        this.telefono=0;
    }
    
    void presentarse(String mensaje){
        System.out.println(mensaje);
    }
    
    void verEstado(String texto){
        System.out.println("Mi estado actual: " + texto);
    }
    
    void setNick(String nick){
        this.nick=nick;
        System.out.println(nick);
    }
    
    void mostrar(){
        System.out.println("Nombre: "+ getNick() + "\nEmail: " + getEmail() + "\nTelefono: " + getTelefono());
    }

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}//end class