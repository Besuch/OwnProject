package template_method.cars;

import template_method.AudiTemplate;

public class AudiA6 extends AudiTemplate {

    @Override
    public String createCarBody() {
        return "A6 car body";
    }

    @Override
    public String createMotor() {
        return "A6 motor";
    }
}
