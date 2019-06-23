package factory_method.clockMakers;

import factory_method.Clock;
import factory_method.clockForms.DigitalClock;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class DigitalClockMakerTest {

    private DigitalClockMaker digitalClockMaker = new DigitalClockMaker();

    @Test
    public void createClock() {

        Clock actual = digitalClockMaker.createClock();

        assertThat(actual, instanceOf(DigitalClock.class));
    }
}