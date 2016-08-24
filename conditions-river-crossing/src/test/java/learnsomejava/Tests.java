package learnsomejava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void testCombintaions() throws Exception {
        Learn learn = new Learn();
        
        assertEquals("Nobody", learn.whoGetsEaten(true, true, true, true)); // everyone there
        assertEquals("Chicken", learn.whoGetsEaten(true, true, true, false)); // everyone except farmer
        assertEquals("Chicken", learn.whoGetsEaten(true, true, false, false)); // Only fox and chicken
        assertEquals("Corn", learn.whoGetsEaten(false, true, true, false)); // Chicken and corn
        assertEquals("Nobody", learn.whoGetsEaten(false, true, true, true)); // Chicken and corn and farmer
        assertEquals("Nobody", learn.whoGetsEaten(false, false, false, false)); // nobody is there
    }
}
