package learnsomejava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void testDoubersLength() throws Exception {

      int[] numArray = {1, 2, 3, 4, 5};
      ObjectDoubler[] doublers = Learn.createDoublers(numArray);
      assertEquals(numArray.length, doublers.length);

      int[] numArray2 = {};
      doublers = Learn.createDoublers(numArray2);
      assertEquals(numArray2.length, doublers.length);
    }

    @Test
    public void testDoubersContent() throws Exception {

        int[] numArray = {1, 2, 3, 4, 5};
        ObjectDoubler[] doublers = Learn.createDoublers(numArray);

        for (int i = 0; i < numArray.length; i++) {
            int doubleNum = numArray[i] * 2;
            assertEquals(doubleNum, doublers[i].getMeDoubled());
        }
    }
}