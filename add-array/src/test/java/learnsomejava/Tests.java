package learnsomejava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void TestAddArrayNumbers() throws Exception {
        AddArray learn = new AddArray();

        assertEquals(7, learn.addArrayNumbers([0, 2, 5]));
        assertEquals(1, learn.addArrayNumbers([-1, 2, 0]);
        assertEquals(0, learn.addArrayNumbers([]);
        assertEquals(-5, learn.addArrayNumbers([-5, 2, 0, -2]);
    }

}
