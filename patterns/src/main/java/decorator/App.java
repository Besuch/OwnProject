package decorator;

import decorator.doctors.HeadDoctor;
import decorator.doctors.Intern;
import decorator.doctors.LocalDoctor;

public class App {
    public static void main(String[] args) {
        Doctor doctor = new HeadDoctor(new LocalDoctor(new Intern()));
        System.out.println(doctor.examine());
    }
}