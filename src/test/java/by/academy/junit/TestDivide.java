package by.academy.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestDivide extends Assert {

    private int valueA;
    private int valueB;
    private int expected;

    public TestDivide(int valueA, int valueB, int expected) {
        super();
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:divideOf({0}-{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays
                .asList(new Object[][]{{0, 1, -1}, {1, 1, 0}, {5, 2, 3}, {20, 10, 10}, {0, 0, 0}});
    }

    @Test
    public void paramTest() {
        assertEquals(expected, Calculator.getDivide(valueA, valueB));
    }
}
