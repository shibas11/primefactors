package primefactors;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeFactorsTest {
    @Test
    public void
    primeFactorsTest() {
        assertThat(factorsOf(1), is(intList()));
        assertThat(factorsOf(2), is(intList(2)));
        assertThat(factorsOf(3), is(intList(3)));
        assertThat(factorsOf(4), is(intList(2, 2)));
        assertThat(factorsOf(5), is(intList(5)));
        assertThat(factorsOf(6), is(intList(2, 3)));
        assertThat(factorsOf(7), is(intList(7)));
        assertThat(factorsOf(8), is(intList(2, 2, 2)));
        assertThat(factorsOf(9), is(intList(3, 3)));
        assertThat(factorsOf(10), is(intList(2, 5)));
        assertThat(factorsOf(12), is(intList(2, 2, 3)));
        assertThat(factorsOf(14), is(intList(2, 7)));
        assertThat(factorsOf(15), is(intList(3, 5)));
        assertThat(factorsOf(2 * 2 * 3 * 5 * 7 * 13 * 17 * 17), is(intList(2, 2, 3, 5, 7, 13, 17, 17)));
    }

    private List<Integer> factorsOf(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for (int divisor = 2; n > 1; divisor++)
            for (; n % divisor == 0; n /= divisor)
                factors.add(divisor);

        return factors;
    }

    private List<Integer> intList(Integer... args) {
        return Arrays.asList(args);
    }
}
