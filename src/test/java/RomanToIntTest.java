import org.junit.Test;
import static org.junit.Assert.*;


public class RomanToIntTest {
    @Test
    public void testOne(){
        assertEquals(3, RomanToInt.convert("III"));
    }

    @Test
    public void testTwo(){
        assertEquals(58, RomanToInt.convert("LVIII"));
    }

    @Test
    public void testThree(){
        assertEquals(1994, RomanToInt.convert("MCMXCIV"));
    }
}
