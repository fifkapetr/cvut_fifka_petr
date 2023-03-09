package prepare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FifkaTest {

    @Test
    public void factorialTest() {
        Assertions.assertEquals(2, Factorial.factorialIterative(2));
    }
}
