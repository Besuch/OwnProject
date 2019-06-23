package template_method.cars;

import template_method.AudiTemplate;

public class AudiQ7 extends AudiTemplate {

    @Override
    public String createCarBody() {
        return "Q7 car body";
    }

    @Override
    public String createMotor() {
        return "Q7 motor";
    }
}
