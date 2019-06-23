package factory_method.clockForms;

import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WallClockTest {

    private WallClock wallClock = new WallClock();

    @Test
    public void showTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        String expected = dateFormat.format(date);

        String actual = wallClock.showTime();

        Assert.assertEquals(expected, actual);
    }
}