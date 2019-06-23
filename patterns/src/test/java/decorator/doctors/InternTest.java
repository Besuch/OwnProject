package decorator.doctors;

import org.junit.Assert;
import org.junit.Test;

public class InternTest {

    private Intern intern = new Intern();

    @Test
    public void examineTest() {
        String expected = "Examine a patient. ";

        String actual = intern.examine();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }
}