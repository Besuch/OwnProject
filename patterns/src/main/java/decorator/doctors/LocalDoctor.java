package decorator.doctors;

import decorator.Doctor;
import decorator.DoctorDecorator;

public class LocalDoctor extends DoctorDecorator {

    public LocalDoctor(Doctor doctor) {
        super(doctor);
    }

    public String makeRecommendation() {
        return "Make a recommendation to the patient. ";
    }

    @Override
    public String examine() {
        return super.examine() + makeRecommendation();
    }
}