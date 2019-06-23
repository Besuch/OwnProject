package command;

import org.junit.Assert;
import org.junit.Test;

public class SignalCommandTest {

    private Crane crane = new Crane();
    private SignalCommand signalCommand = new SignalCommand(crane);

    @Test
    public void execute() {
        String expected = "Signal";

        String actual = signalCommand.execute();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }
}