package strategy;

import strategy.prices.TwentyFiveFromPrice;

public class App {
    public static void main(String[] args) {
        double startPrice = 1000;
        System.out.println("Initial price: " + startPrice);

        Context context = new Context(new TwentyFiveFromPrice());
        double price = context.getPrice(startPrice);
        System.out.println("Total price: " + price);
    }
}