package ua.goit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    @Test
    public void testThat1InputHandledCorrectly() {
        int actual = new SumCalculator().sum(1);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testThat3InputHandledCorrectly() {
        int actual = new SumCalculator().sum(3);
        Assertions.assertEquals(6, actual);
    }

    @Test
    public void testThat0InputHandledCorrectly() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new SumCalculator().sum(0));
    }
}