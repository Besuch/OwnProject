package template_method.cars;

import org.junit.Assert;
import org.junit.Test;

public class AudiQ7Test {

    private AudiQ7 audiQ7 = new AudiQ7();

    @Test
    public void createCarBodyTest() {
        String expected = "Q7 car body";

        String actual = audiQ7.createCarBody();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createMotorTest() {
        String expected = "Q7 motor";

        String actual = audiQ7.createMotor();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }
}