
/**
 * Write a description of class Mecanismo01 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoMultiplicacionPrimo extends Mecanismo
{
    /**
     * Constructor for objects of class Mecanismo01
     */
    public MecanismoMultiplicacionPrimo(int numeroPrimo)
    {
        super(numeroPrimo);
    }
    
    /**
     * método que encripta
     */
    public int encripta(int numeroAEncriptar){
        return (numeroAEncriptar * super.getNumero());
    }
    
    /**
     * método que desencripta
     */
    public int desencripta(int numeroADesencriptar){
        return (numeroADesencriptar/super.getNumero());
    }
}
