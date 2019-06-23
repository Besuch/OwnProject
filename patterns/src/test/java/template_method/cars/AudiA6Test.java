package template_method.cars;

import org.junit.Assert;
import org.junit.Test;

public class AudiA6Test {

    private AudiA6 audiA6 = new AudiA6();

    @Test
    public void createCarBodyTest() {
        String expected = "A6 car body";

        String actual = audiA6.createCarBody();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createMotorTest() {
        String expected = "A6 motor";

        String actual = audiA6.createMotor();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }
}