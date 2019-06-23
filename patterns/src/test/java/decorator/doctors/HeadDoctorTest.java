package decorator.doctors;

import org.junit.Assert;
import org.junit.Test;

public class HeadDoctorTest {

    private Intern intern = new Intern();
    private LocalDoctor localDoctor = new LocalDoctor(intern);
    private HeadDoctor headDoctor = new HeadDoctor(localDoctor);

    @Test
    public void treatment() {
        String expected = "Prescribe treatment to the patient. ";

        String actual = headDoctor.treatment();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void examine() {
        String expected = "Examine a patient. Make a recommendation to the patient. Prescribe treatment to the patient. ";

        String actual = headDoctor.examine();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }
}