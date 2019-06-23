package decorator.doctors;

import org.junit.Assert;
import org.junit.Test;

public class LocalDoctorTest {

    private Intern intern = new Intern();
    private LocalDoctor localDoctor = new LocalDoctor(intern);

    @Test
    public void makeRecommendation() {
        String expected = "Make a recommendation to the patient. ";

        String actual = localDoctor.makeRecommendation();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void examine() {
        String expected = "Examine a patient. Make a recommendation to the patient. ";

        String actual = localDoctor.examine();

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }
}