package factory_method.clockForms;

import factory_method.Clock;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Watch implements Clock {

    @Override
    public String showTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}