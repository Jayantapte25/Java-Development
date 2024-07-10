package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class J3 {

    @BeforeClass //this helps to run the method before all the test cases
    public static void beforeAll() {
        System.out.println("Before all tests");
    }

    @AfterClass //this helps to run the method after all the test cases
    public static void afterAll() {
        System.out.println("After all tests");
    }

    @Before //this helps to run the method before each test case
    public void beforeEach() {
        System.out.println("Before each test");
    }

    @After //this helps to run the method after each test case
    public void afterEach() {
        System.out.println("After each test");
    }

    @Test
    public void test1() {
        System.out.println("Test 1 executed");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 executed");
    }
}
