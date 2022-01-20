package algorithmid;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciExecutorTest {

    FibonacciExecutor fibonacciExecutor;

    @Before
    public void setUp() {
        fibonacciExecutor = new FibonacciExecutor();
    }

    @Test
    public void testFibonacciFor() {
        long[] actual = fibonacciExecutor.fibonacciFor(10);
        long[] expected = new long[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testFibonacciWhile() {
        long[] actual = fibonacciExecutor.fibonacciWhile(10);
        long[] expected = new long[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testFibonacciDoWhile() {
        long[] actual = fibonacciExecutor.fibonacciDoWhile(10);
        long[] expected = new long[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        Assert.assertArrayEquals(actual, expected);
    }
}