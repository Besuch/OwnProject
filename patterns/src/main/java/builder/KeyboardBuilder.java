package builder;

class KeyboardBuilder {
    private String model = "Standart";
    private KeyboardType type = KeyboardType.MEMBRANE;
    private int price = 100;

    KeyboardBuilder buildModel(String model) {
        this.model = model;
        return this;
    }

    KeyboardBuilder buildType(KeyboardType type) {
        this.type = type;
        return this;
    }

    KeyboardBuilder buildPrice(int price) {
        this.price = price;
        return this;
    }

    Keyboard build() {
        Keyboard keyboard = new Keyboard();
        keyboard.setModel(model);
        keyboard.setType(type);
        keyboard.setPrice(price);
        return keyboard;
    }
}