package primefactors;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeFactorsTest {
    @Test
    public void
    primeFactorsTest() {
        assertThat(factorsOf(1), is(intList()));
    }

    private List<Integer> factorsOf(int n) {
        return null;
    }

    private List<Integer> intList(int... args) {
        return Arrays.asList();
    }
}
