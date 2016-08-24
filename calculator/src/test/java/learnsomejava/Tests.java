package learnsomejava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void TestAddIntegerValues() throws Exception {
        Calculator learn = new Calculator();
        assertEquals(3, learn.performIntegerArithmetic('+', 1, 2));
        assertEquals(1, learn.performIntegerArithmetic('+', 1, 0));
        assertEquals(0, learn.performIntegerArithmetic('+', Integer.MAX_VALUE, 0 - Integer.MAX_VALUE));
    }


    @Test
    public void TestDivideIntegerValues() throws Exception {
        Calculator learn = new Calculator();
        assertEquals(5, learn.performIntegerArithmetic('/', 10, 2));
        assertEquals(3, learn.performIntegerArithmetic('/', 10, 3));
        assertEquals(1, learn.performIntegerArithmetic('/', 1, 1));
    }

    @Test
    public void TestSubtractIntegerValues() throws Exception {
        Calculator learn = new Calculator();
        assertEquals(8, learn.performIntegerArithmetic('-', 10, 2));
        assertEquals(0, learn.performIntegerArithmetic('-', 10, 10));
        assertEquals(-1, learn.performIntegerArithmetic('-', 1, 2));
    }    

    @Test
    public void TestMultipleIntegerValues() throws Exception {
        Calculator learn = new Calculator();
        assertEquals(20, learn.performIntegerArithmetic('*', 10, 2));
        assertEquals(100, learn.performIntegerArithmetic('*', 10, 10));
        assertEquals(-1, learn.performIntegerArithmetic('*', 1, -1));
    }      
}
