package com.example.nvimdebbugyoutube;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        int result = calculator.div(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testMult() {
        Calculator calculator = new Calculator();
        int result = calculator.mult(2, 3);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(5, 3);
        Assertions.assertEquals(2, result);
    }
}

