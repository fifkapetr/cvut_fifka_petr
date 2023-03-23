package p106.lab03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooLabTest {

    Foo foo = new Foo();

    @Test
    public void returnNumber5_MethodReturns5_5() {
        Assertions.assertEquals(5, foo.returnNumber());
    }

    @Test
    public void returnNumber0_MethodReturns0_0() {
        Assertions.assertEquals(0, foo.getNum());
    }
}
