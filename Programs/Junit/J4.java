package Junit;

//In this code we are testing the division by zero exception using JUnit

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class J4 {

    private int num1 = 10;
    private int num2 = 0;

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            divide(num1, num2);
        });

        String expectedMessage = "/ by zero";
        String actualMessage = exception.getMessage(); //getMessage() method is used to get the description of the exception

        assertEquals(expectedMessage, actualMessage);
    }

    private int divide(int a, int b) {
        return a / b;
    }
}
