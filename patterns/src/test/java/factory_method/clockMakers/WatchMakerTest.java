package factory_method.clockMakers;

import factory_method.Clock;
import factory_method.clockForms.Watch;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class WatchMakerTest {

    private WatchMaker watchMaker = new WatchMaker();

    @Test
    public void createClock() {

        Clock actual = watchMaker.createClock();

        assertThat(actual, instanceOf(Watch.class));
    }
}