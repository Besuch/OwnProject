package command;

import org.junit.Assert;
import org.junit.Test;

public class LiftCommandTest {

    private Crane crane = new Crane();
    private LiftCommand liftCommand = new LiftCommand(crane);

    @Test
    public void execute() {
        String expected = "Lift";

        String actual = liftCommand.execute();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }
}