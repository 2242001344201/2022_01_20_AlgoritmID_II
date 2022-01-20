package algorithmid;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialExecutorTest {

    FactorialExecutor factorialExecutor;

    @Before
    public void setUp() {

        factorialExecutor = new FactorialExecutor();
    }

    @Test
    public void testFactorialFor() {
        long[] actual = factorialExecutor.factorialWhile(8);
        long[] expected = new long[] {1, 1, 2, 6, 24, 120, 720, 5040};
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testFactorialWhile() {
        long[] actual = factorialExecutor.factorialWhile(8);
        long[] expected = new long[] {1, 1, 2, 6, 24, 120, 720, 5040};
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testFactorialDoWhile() {
        long[] actual = factorialExecutor.factorialDoWhile(8);
        long[] expected = new long[] {1, 1, 2, 6, 24, 120, 720, 5040};
        Assert.assertArrayEquals(actual, expected);
    }
}