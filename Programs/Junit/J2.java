package Junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int integerDivision(int i, int j) {
        return i / j;
    }
}

@RunWith(JUnit4.class)
public class J2 {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
        System.out.println("Test Passed");
    }

    @Test
    public void testIntegerDivision(){
        Calculator calc = new Calculator();
        int result = calc.integerDivision(6, 3);
        assertEquals(2, result);
    }

    //Test - if we comment the @Test annotation, the method will not be tested.
    public void testIntegerDivisionByZero(){
        Calculator calc = new Calculator();
        int result = calc.integerDivision(6, 0);
        assertEquals(0, result);
    }
}
