package factory_method;

import factory_method.clockMakers.DigitalClockMaker;
import factory_method.clockMakers.WallClockMaker;
import factory_method.clockMakers.WatchMaker;


public class App {
    public static void main(String[] args) {
        ClockMaker wall = getClockByName("wall");
        ClockMaker digital = getClockByName("digital");
        ClockMaker watch = getClockByName("watch");

        Clock clock = wall.createClock();
        Clock clock1 = digital.createClock();
        Clock clock2 = watch.createClock();

        System.out.println(clock.showTime());
        System.out.println(clock1.showTime());
        System.out.println(clock2.showTime());
    }

    public static ClockMaker getClockByName(String clock) {
        if (clock.equals("digital")) {
            return new DigitalClockMaker();
        } else if (clock.equals("wall")) {
            return new WallClockMaker();
        } else if (clock.equals("watch")) {
            return new WatchMaker();
        }

        throw new RuntimeException("Not correct: " + clock);
    }
}