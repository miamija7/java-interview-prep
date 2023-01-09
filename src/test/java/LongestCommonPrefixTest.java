import org.junit.Test;
import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    @Test
    public void returnPrefixIfMatches(){
        String[] args = {"flower","flow","flight"};
        assertEquals("fl", LongestCommonPrefix.solve(args));
    }

    @Test
    public void returnEmptyStringIfNoMatch(){
        String[] args = {"dog","racecar","car"};
        assertEquals("" , LongestCommonPrefix.solve(args));
    }
}
