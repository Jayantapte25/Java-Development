package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class J8 {

    private static StringBuilder stringBuilder;

    @BeforeClass
    public static void beforeAllTests() {
        // This runs once before any test method
        stringBuilder = new StringBuilder();
        System.out.println("Before All Tests");
    }

    @AfterClass
    public static void afterAllTests() {
        // This runs once after all test methods
        System.out.println("After All Tests");
        System.out.println("Final StringBuilder content: " + stringBuilder.toString());
    }

    @Before
    public void beforeEachTest() {
        // This runs before each test method
        System.out.println("Before Each Test");
    }

    @After
    public void afterEachTest() {
        // This runs after each test method
        System.out.println("After Each Test");
        System.out.println("StringBuilder content: " + stringBuilder.toString());
    }

    @Test
    public void testA() {
        stringBuilder.append("A");
        System.out.println("Running Test A");
    }

    @Test
    public void testB() {
        stringBuilder.append("B");
        System.out.println("Running Test B");
    }

    @Test
    public void testC() {
        stringBuilder.append("C");
        System.out.println("Running Test C");
    }

    @Test
    public void testD() {
        stringBuilder.append("D");
        System.out.println("Running Test D");
    }

    @Test
    public void testE() {
        stringBuilder.append("E");
        System.out.println("Running Test E");
    }
}
