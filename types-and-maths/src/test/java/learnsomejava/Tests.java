package learnsomejava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void testAdding() throws Exception {
        Learn learn = new Learn();
        assertEquals(1, learn.addOneToInt(0));
        assertEquals(0.5D, learn.addHalfToDouble(0), 1e-15);
    }
}
