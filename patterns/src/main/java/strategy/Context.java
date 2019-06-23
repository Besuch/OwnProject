package strategy;

public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(double price) {
        return strategy.getPrice(price);
    }
}