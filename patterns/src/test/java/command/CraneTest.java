package command;

import org.junit.Assert;
import org.junit.Test;

public class CraneTest {

    private Crane crane = new Crane();

    @Test
    public void turnTest() {
        String expected = "Turn";

        String actual = crane.turn();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void liftTest() {
        String expected = "Lift";

        String actual = crane.lift();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void signalTest() {
        String expected = "Signal";

        String actual = crane.signal();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }
}