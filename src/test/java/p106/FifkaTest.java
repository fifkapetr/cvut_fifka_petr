package p106;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import p106.Fifka;

public class FifkaTest {

    @Test
    public void factorialTest() {
        Assertions.assertEquals(2, Fifka.factorialRecursive(2));
        Assertions.assertEquals(120, Fifka.factorialIterative(5));
    }
}
