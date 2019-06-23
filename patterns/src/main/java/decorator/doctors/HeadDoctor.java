package decorator.doctors;

import decorator.Doctor;
import decorator.DoctorDecorator;

public class HeadDoctor extends DoctorDecorator {
    public HeadDoctor(Doctor doctor) {
        super(doctor);
    }

    public String treatment() {
        return "Prescribe treatment to the patient. ";
    }

    @Override
    public String examine() {
        return super.examine() + treatment();
    }
}