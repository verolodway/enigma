
/**
 * Write a description of class MecanismoSumatorioParcial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoSumatorioParcial extends Mecanismo
{
    
    /**
     * Constructor for objects of class MecanismoSumatorioParcial
     */
    public MecanismoSumatorioParcial(int numero)
    {
        super(numero);
    }

    /**
     * se elige un número a de 1 a 9. El número original x se suma al número x-1 y el resultado al x-2, etc. hasta a incluido. 
     */
    public int encripta(int cod){
        int contador = cod - 1;
        int encriptado = -1;
        while(cod >= super.getNumero()){
            encriptado += cod + contador;
            contador++;
        }
        return encriptado;
    }
    
    public int desencripta(int cod){
        int contador = cod + 1;
        int desencriptado = -1;
        while(cod <= super.getNumero()){
            desencriptado -= cod - contador;
            contador--;
        }
        return desencriptado;
    }
}
