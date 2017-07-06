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
    }

    private List<Integer> factorsOf(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        if(n == 2)
            factors.add(2);
        return factors;
    }

    private List<Integer> intList(Integer... args) {
        return Arrays.asList(args);
    }
}
