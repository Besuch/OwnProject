package template_method;

import template_method.cars.AudiA6;
import template_method.cars.AudiQ7;
import template_method.cars.AudiR8;

public class App {
    public static void main(String[] args) {
        AudiTemplate a6 = new AudiA6();
        AudiTemplate q7 = new AudiQ7();
        AudiTemplate r8 = new AudiR8();

        q7.createCar();
        r8.createCar();
        a6.createCar();
    }
}