package command;

import org.junit.Assert;
import org.junit.Test;

public class TurnCommandTest {

    private Crane crane = new Crane();
    private TurnCommand turnCommand = new TurnCommand(crane);

    @Test
    public void execute() {
        String expected = "Turn";

        String actual = turnCommand.execute();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }
}