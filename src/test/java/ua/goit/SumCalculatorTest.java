package ua.goit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void init(){
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThat1InputHandledCorrectly() {
        int actual = sumCalculator.sum(1);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testThat3InputHandledCorrectly() {
        int actual = sumCalculator.sum(3);
        Assertions.assertEquals(6, actual);
    }

    @Test
    public void testThat0InputHandledCorrectly() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}