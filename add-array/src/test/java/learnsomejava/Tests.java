package learnsomejava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void TestAddArrayNumbers() throws Exception {
        AddArray learn = new AddArray();

        assertEquals(7, learn.addArrayNumbers(new int [] {0, 2, 5}));
        assertEquals(1, learn.addArrayNumbers(new int [] {-1, 2, 0}));
        assertEquals(0, learn.addArrayNumbers(new int[] {}));
        assertEquals(-5, learn.addArrayNumbers(new int[] {-5, 2, 0, -2}));
    }
}
