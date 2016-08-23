package learnsomejava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IfTest {

    @Test
    public void test40YearOldFemale() throws Exception {
        LearnIf learnIf = new LearnIf();
        assertEquals("Female is 40", learnIf.getGenderAndAge(true, 40));
    }

    @Test
    public void testUnder40YearOldFemale() throws Exception {
        LearnIf learnIf = new LearnIf();
        assertEquals("Female under 40", learnIf.getGenderAndAge(true, 0));
    }

    @Test
    public void testOver40YearOldMale() throws Exception {
        LearnIf learnIf = new LearnIf();
        assertEquals("Male over 40", learnIf.getGenderAndAge(false, 41));
    }
}
