package Junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Collection;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class J5 {

    private int number;

    public J5(int number) {
        this.number = number;
    }

    @Parameterized.Parameters(name = "{index}: number={0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1}, {2}, {3}, {4}, {5}
        });
    }

    @Test
    public void testSquare() {
        int expected = number * number;
        assertEquals(expected, square(number));
    }

    private int square(int num) {
        return num * num;
    }
}
