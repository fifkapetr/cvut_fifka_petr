package p107.lab03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import p106.lab03.Foo;

public class FooLabTests {

    private Foo foo;

    @BeforeEach
    public void setObject() {
        foo = new Foo();
    }

    @Test
    public void returnNumber_returnsFive_Five() {
        Assertions.assertEquals(5, foo.returnNumber());
    }

    @Test
    public void increment_doubleCallIncrement_two() {
        foo.increment();
        foo.increment();
        Assertions.assertEquals(2, foo.getNum());
    }
}
