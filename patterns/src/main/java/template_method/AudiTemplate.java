package template_method;

public abstract class AudiTemplate {
    public void createCar() {
        System.out.println(createCarBody());
        System.out.println("4 wheels");
        System.out.println("4 doors");
        System.out.println(createMotor());
        System.out.println("2 airbags");
        System.out.println();
    }

    public abstract String createCarBody();

    public abstract String createMotor();
}
