package factory_method.clockForms;

import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClockTest {

    private DigitalClock digitalClock = new DigitalClock();

    @Test
    public void showTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String expected = dateFormat.format(date);

        String actual = digitalClock.showTime();

        Assert.assertEquals(expected, actual);
    }
}