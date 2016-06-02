
/**
 * Write a description of class Mecanismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mecanismo
{
    private int num;
    /**
     * Constructor for objects of class Mecanismo
     */
    public Mecanismo(int numero){
        num = numero;
    }    
    
    /**
     * Método que encripta
     */
    public abstract int encripta(int numero);
    
    /**
     * Método que desencripta
     */
    
    public abstract int desencripta(int numero);
    
    public int getNumero(){
        return num;
    }
    
    public void setNumero(int numero){
        num = numero;
    }
}
