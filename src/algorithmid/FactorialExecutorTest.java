package algorithmid;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialExecutorTest {

    FactorialExecutor factorialExecutor;

    @Before
    public void setUp() {
        factorialExecutor = new FactorialExecutor();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testFactorialFor() {

    }

    @Test
    public void testFactorialWhile() {
    }

    @Test
    public void testFactorialDoWhile() {
        long[] actual = factorialExecutor.factorialDoWhile(5);
        long[] expected = new long[]{1, 1, 2, 6, 24};
        Assert.assertArrayEquals(actual, expected);
    }
}