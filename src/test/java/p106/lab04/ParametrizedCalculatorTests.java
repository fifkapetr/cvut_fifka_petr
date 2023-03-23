package p106.lab04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParametrizedCalculatorTests {

    Calculator calculator = new Calculator();

    @ParameterizedTest(name = "{0} plus {1} should be equal to {2}")
    @CsvSource({"1, 2, 3", "2, 3, 5", "-3, 5, 2", "1, 2, 1"})
    public void add_addsAAndB_returnC(int a, int b, int c) {
        int expectedResult = c;
        int result = calculator.add(a, b);
        Assertions.assertEquals(expectedResult, result);
    }
}
