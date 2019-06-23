package strategy.prices;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class FullPriceTest {

    private FullPrice fullPrice = new FullPrice();

    @Test
    public void getPrice() {
        double expected = 100.0;

        double actual = fullPrice.getPrice(100.0);

        assertThat(expected, is(equalTo(actual)));
    }
}