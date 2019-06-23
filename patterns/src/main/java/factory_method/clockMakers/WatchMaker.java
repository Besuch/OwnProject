package factory_method.clockMakers;

import factory_method.Clock;
import factory_method.ClockMaker;
import factory_method.clockForms.Watch;

public class WatchMaker implements ClockMaker {
    @Override
    public Clock createClock() {
        return new Watch();
    }
}