package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
//Multiple tests for testing calculator using Junit (TDD)
Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @DisplayName("Adding two numbers")
    @Test
    public void testAddTrue(){
        int result = calculator.add(10,50);
        assertEquals(60, result, 0);
    }

    @Test
    public void testAddFalse(){
        assertThrows(IllegalArgumentException.class, () -> calculator.add(0,4));
        assertThrows(IllegalArgumentException.class, () -> calculator.add(5,0));
    }

    @DisplayName("Subtracting two numbers")
    @Test
    public void testSubtractTrue(){
        int result = calculator.subtract(60,10);
        assertEquals(50, result, 0);
    }

    @Test
    public void testSubtractFalse(){
        assertThrows(IllegalArgumentException.class, () -> calculator.subtract(0,5));
        assertThrows(IllegalArgumentException.class, () -> calculator.subtract(6,0));
    }

    @DisplayName("Dividing two numbers")
    @Test
    public void testDivideTrue(){
        int result = calculator.divide(20,5);
        assertEquals(4, result, 0);
    }

    @Test
    public void testDivideFalse(){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(0,7));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(9,0));
    }

    @DisplayName("Multiplying two numbers")
    @Test
    public void testMultiplyTrue(){
        int result = calculator.multiply(5,4);
        assertEquals(20, result, 0);
    }

    @Test
    public void testMultiplyFalse(){
        assertThrows(IllegalArgumentException.class, () -> calculator.multiply(0,4));
        assertThrows(IllegalArgumentException.class, () -> calculator.multiply(6,0));
    }
}
