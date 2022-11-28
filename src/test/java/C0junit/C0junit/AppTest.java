package C0junit.C0junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  
	@Test
    public void test() {

        App p = new App();
        assertEquals("Hello chandrika", p.getMessage("chandrika"));

    }
    @Test
    public void testNameEmpty() {

        App c = new App();
        assertEquals("Please provide a name!", c.getMessage(" "));

    }
}
	
	
   

