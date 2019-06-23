package strategy.prices;

import strategy.Strategy;

public class FullPrice implements Strategy {

    @Override
    public double getPrice(double price) {
        System.out.println("Discount: 0%");
        return price;
    }
}