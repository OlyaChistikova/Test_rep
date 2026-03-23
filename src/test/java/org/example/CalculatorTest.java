package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void addTest(){
        assertEquals(5.0, calc.add(2, 3));
    }

    @Test
    public void subtractTest(){
        assertEquals(-3.0, calc.subtract(2, 3));
    }
}
