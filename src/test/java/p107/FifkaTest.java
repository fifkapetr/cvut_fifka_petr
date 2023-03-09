package p107;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FifkaTest {

    @Test
    public void factorialTest() {
        Assertions.assertEquals(120, Fifka.factorialRecursive(5));
    }
}
