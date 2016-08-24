package learnsomejava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void runHelloWorldTest() throws Exception {
        HelloGetter getter = new HelloGetter();
        assertEquals("Hello World", getter.getHelloWorldGenerator().getHelloWorld());
    }
}
