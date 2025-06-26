package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    void testAdd() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(5, mathUtils.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(2, mathUtils.subtract(5, 3), "5 - 3 should equal 2");
    }

    @Test
    void testMultiply() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(15, mathUtils.multiply(5, 3), "5 * 3 should equal 15");
    }

    @Test
    void testDivide() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(2.0, mathUtils.divide(6, 3), "6 / 3 should equal 2.0");
    }

    @Test
    void testDivideByZero() {
        MathUtils mathUtils = new MathUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> mathUtils.divide(6, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
