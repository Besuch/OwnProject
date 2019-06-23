package builder;

import java.util.Objects;

class Keyboard {
    private String model;
    private KeyboardType type;
    private int price;


    public void setModel(String model) {
        this.model = model;
    }

    public void setType(KeyboardType type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "model='" + model + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Keyboard)) return false;
        Keyboard keyboard = (Keyboard) o;
        return price == keyboard.price &&
                Objects.equals(model, keyboard.model) &&
                type == keyboard.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, price);
    }
}