package template_method.cars;

import template_method.AudiTemplate;

public class AudiR8 extends AudiTemplate {

    @Override
    public String createCarBody() {
        return "R8 car body";
    }

    @Override
    public String createMotor() {
        return "R8 motor";
    }
}
