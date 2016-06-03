import java.util.ArrayList;
/**
 * Write a description of class MecanismoOffset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class 
MecanismoOffset extends Mecanismo
{

    /**
     * Constructor for objects of class MecanismoOffset
     */
    public MecanismoOffset(int clave)
    {
        super(clave);
    }
    
    public int encripta(int num)
    {
        String numero = "";
        int encriptado = -1;

        ArrayList<Integer> digitos = new ArrayList<>();
        while(num>0){
            digitos.add(num % 10);
            num/=10;
        }
        for(int cont = digitos.size()-2;cont >= 0;cont--)
        {
            int digito = digitos.get(cont) + getNumero();

            if(digito>=10)
            {
                digito = digito % 10;
            }
            numero = (numero + digito);
        }
        numero = digitos.get(digitos.size()-1) + numero;
        encriptado = Integer.parseInt(numero);
        return encriptado;
    }
    
    public int desencripta(int num)
    {
        String numero = "";
        int desencriptado = -1;
        ArrayList<Integer> digitos = new ArrayList<>();

        while(num>0){
            digitos.add(num % 10);
            num/=10;
        }
        for(int cont = digitos.size()-2;cont >= 0;cont--)
        {

            int digito = digitos.get(cont) - getNumero();
            if(digito < 0)
            {
                digito = digito + 10;
            }

            numero = (numero + digito);
        }
        numero = digitos.get(digitos.size()-1) + numero;
        desencriptado = Integer.parseInt(numero);
        return desencriptado;
    }
}