package p106.lab03;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FirstTests {

    @Test
    @Order(1)
    public void firstTest() {

    }

    @Test
    @Order(2)
    public void textEqualsText_ReturnsTrue_text() {
        Assertions.assertEquals("Text", "Text");
    }

    @Test
    @Order(3)
    public void failingTextEqualsTexts_ReturnsTrue_failure() {
        Assertions.assertEquals("Text", "text");
    }

    @BeforeEach
    public void logTextBeforeEachTest() {
        System.out.println("Run before each test");
    }

    @BeforeAll
    public static void logTextBeforeAllTests() {
        System.out.println("Run before all tests");
    }

    @AfterEach
    public void logTextAfterEachTest() {
        System.out.println("Run after each test");
    }

    @AfterAll
    public static void logTextAfterAllTests() {
        System.out.println("Run after all tests");
    }

}
