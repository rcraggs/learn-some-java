package learnsomejava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void returnAValueTest() throws Exception {
        Learn learn = new Learn();
        assertEquals("Hello World", learn.returnAValue());
    }
}
