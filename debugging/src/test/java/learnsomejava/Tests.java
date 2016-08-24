package learnsomejava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void runHelloWorldTest() throws Exception {
        Buggy buggy = new Buggy();
        assertEquals("Hello World", learn.getHelloWorld());
    }
}
