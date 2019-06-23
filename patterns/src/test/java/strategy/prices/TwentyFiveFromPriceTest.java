package strategy.prices;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class TwentyFiveFromPriceTest {

    private TwentyFiveFromPrice twentyFiveFromPrice = new TwentyFiveFromPrice();

    @Test
    public void getPrice() {
        double expected = 75.0;

        double actual = twentyFiveFromPrice.getPrice(100.0);

        assertThat(expected, is(equalTo(actual)));
    }
}