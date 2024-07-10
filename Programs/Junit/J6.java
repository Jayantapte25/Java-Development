package Junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class J6 {

    @Test
    public void testAdditionRepeated() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter 2 number & their addition");
            int result = add(2, 3);
            assertEquals(5, result);
        }
    }

    // Helper method to add two numbers
    private int add(int a, int b) {
        return a + b;
    }
}
