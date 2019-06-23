package builder;

public class App {
    public static void main(String[] args) {
        Keyboard keyboard = new KeyboardBuilder()
                .buildModel("Tesoro")
                .buildType(KeyboardType.MECHANICAL)
                .buildPrice(300)
                .build();

        System.out.println(keyboard);
    }
}