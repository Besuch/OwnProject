package strategy.prices;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class HalfPriceTest {

    private HalfPrice halfPrice = new HalfPrice();

    @Test
    public void getPrice() {
        double expected = 50.0;

        double actual = halfPrice.getPrice(100.0);

        assertThat(expected, is(equalTo(actual)));
    }
}