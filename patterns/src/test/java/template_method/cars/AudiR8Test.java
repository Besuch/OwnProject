package template_method.cars;

import org.junit.Assert;
import org.junit.Test;

public class AudiR8Test {

    private AudiR8 audiR8 = new AudiR8();

    @Test
    public void createCarBodyTest() {
        String expected = "R8 car body";

        String actual = audiR8.createCarBody();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createMotorTest() {
        String expected = "R8 motor";

        String actual = audiR8.createMotor();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }
}