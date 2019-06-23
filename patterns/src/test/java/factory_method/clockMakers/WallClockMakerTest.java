package factory_method.clockMakers;

import factory_method.Clock;
import factory_method.clockForms.WallClock;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class WallClockMakerTest {

    private WallClockMaker wallClockMaker = new WallClockMaker();

    @Test
    public void createClock() {

        Clock actual = wallClockMaker.createClock();

        assertThat(actual, instanceOf(WallClock.class));
    }
}