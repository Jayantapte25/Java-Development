package Junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class J1 {
    public static void main(String[] args) throws Exception {
        System.out.println(jayant());
    }

    public static String jayant() {
        return "Hello Java";
    }

    @Test
    public void testhello() {
        assertEquals("Hello Java", J1.jayant());
    }
}
