package strategy.prices;

import strategy.Strategy;

public class HalfPrice implements Strategy {

    @Override
    public double getPrice(double price) {
        System.out.println("Discount: 50%");
        return price * 0.5;
    }
}