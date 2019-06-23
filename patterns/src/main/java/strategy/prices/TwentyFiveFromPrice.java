package strategy.prices;

import strategy.Strategy;

public class TwentyFiveFromPrice implements Strategy {

    @Override
    public double getPrice(double price) {
        System.out.println("Discount: 25%");
        return price * 0.75;
    }
}