import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    @Test
    public void testCommit01Bayon()
    {
        Enigma enigma = new Enigma();
        Mecanismo mecanismo01 = new MecanismoMultiplicacionPrimo(7);
        
        assertEquals(35084, enigma.encripta(mecanismo01, 5012));
        assertEquals(63000, enigma.encripta(mecanismo01, 9000));
        assertEquals(-1,    enigma.encripta(mecanismo01, 10));        
        assertEquals(5012,  enigma.desencripta(mecanismo01, 35084));        
        assertEquals(9000,  enigma.desencripta(mecanismo01, 63000));              
        assertEquals(-1,  enigma.desencripta(mecanismo01, 70)); 
    }
}
