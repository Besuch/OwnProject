package factory_method.clockForms;

import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WatchTest {

    private Watch watch = new Watch();

    @Test
    public void showTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String expected = dateFormat.format(date);

        String actual = watch.showTime();

        Assert.assertEquals(expected, actual);
    }
}