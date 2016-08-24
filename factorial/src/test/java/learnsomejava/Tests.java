package learnsomejava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void testFactorials() throws Exception {
        Learn learn = new Learn();
        assertEquals(1, learn.getFactorial(1));
        assertEquals(2, learn.getFactorial(2));
        assertEquals(3628800, learn.getFactorial(10));
    }
}
