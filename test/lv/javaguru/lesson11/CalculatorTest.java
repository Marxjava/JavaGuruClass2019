package lv.javaguru.lesson11;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator victim;

    @Before
    public void setUp() throws Exception {
        victim = new Calculator();
    }

    @Test
    public void shouldSumTwoValues() {
        int sum = victim.sum(3,6);
        assertEquals(9, sum);
    }

    @Test
    public void shouldMultiplyTwoFloatingPointValues() {
        BigDecimal result = victim.multiply (BigDecimal.valueOf(3), BigDecimal.valueOf(4));
        assertEquals(new BigDecimal ("12.00"), result);
    }

    @Test
    public void shouldDivideTwoFloatingPointValues() {
        BigDecimal devideResult = victim.divide (BigDecimal.valueOf(13), BigDecimal.valueOf(3));
        assertEquals(new BigDecimal ("4.33"), devideResult);
    }

}