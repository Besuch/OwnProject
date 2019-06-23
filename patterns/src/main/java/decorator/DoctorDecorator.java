package decorator;

public class DoctorDecorator implements Doctor {

    Doctor doctor;

    public DoctorDecorator(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String examine() {
        return doctor.examine();
    }
}