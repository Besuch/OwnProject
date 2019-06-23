package builder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KeyboardBuilderTest {

    private Keyboard expectedKeyboard;
    private String model;
    private KeyboardType type;
    private int price;

    @Before
    public void before() {
        model = "Standart";
        type = KeyboardType.MEMBRANE;
        price = 100;

        expectedKeyboard = new Keyboard();
        expectedKeyboard.setModel(model);
        expectedKeyboard.setType(type);
        expectedKeyboard.setPrice(price);
    }

    @Test
    public void buildModelTest() {
        expectedKeyboard.setModel(model);

        Keyboard actual = new KeyboardBuilder().buildModel(model).build();

        Assert.assertEquals(expectedKeyboard, actual);
    }

    @Test
    public void buildTypeTest() {
        expectedKeyboard.setType(type);

        Keyboard actual = new KeyboardBuilder().buildType(type).build();

        Assert.assertEquals(expectedKeyboard, actual);
    }

    @Test
    public void buildPriceTest() {
        expectedKeyboard.setPrice(price);

        Keyboard actual = new KeyboardBuilder().buildPrice(price).build();

        Assert.assertEquals(expectedKeyboard, actual);
    }

    @Test
    public void buildTest() {
        Keyboard actual = new KeyboardBuilder().build();

        Assert.assertEquals(expectedKeyboard, actual);
    }
}