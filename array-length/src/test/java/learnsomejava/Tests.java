package learnsomejava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void TestArrayLength() throws Exception {
        ArrayLength learn = new ArrayLength();

        assertEquals(3, learn.getArrayLength(new int [] {0, 2, 5}));
        assertEquals(5, learn.getArrayLength(new int [] {0, 0, 0, 0, 1}));
        assertEquals(0, learn.getArrayLength(new int [] {}));
    }

}
