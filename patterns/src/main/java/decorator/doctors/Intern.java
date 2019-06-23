package decorator.doctors;

import decorator.Doctor;

public class Intern implements Doctor {
    @Override
    public String examine() {
        return "Examine a patient. ";
    }
}