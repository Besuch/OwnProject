package factory_method.clockForms;

import factory_method.Clock;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WallClock implements Clock {

    public String showTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}