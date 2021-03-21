package by.academy.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestSum extends Assert {

    private int valueA;
    private int valueB;
    private int expected;

    public TestSum(int valueA, int valueB, int expected) {
        super();
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{{1, 0, 1}, {-1, 1, 0}, {6, 5, 11}, {10, 15, 25}, {100, 200, 300}});
    }

    @Test
    public void paramTest() {
        assertEquals(expected, Calculator.getSum(valueA, valueB));
    }

}
