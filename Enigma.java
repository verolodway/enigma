
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{
    
    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {
        
    }

    /**
     * Método que encripta
     */
    public int encripta(Mecanismo mecanismo, int num){
        int encriptado = -1;
        if(num > 10){
            encriptado = mecanismo.encripta(num);
        }
        return encriptado;
    }
    
    /**
     * Método que desencripta
     */
    public int desencripta(Mecanismo mecanismo, int num){
        int desencriptado = -1;
        if(mecanismo.desencripta(num) > 10){
            desencriptado = mecanismo.desencripta(num);
        }
        return desencriptado;
    }
}
