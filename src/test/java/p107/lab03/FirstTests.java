package p107.lab03;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FirstTests {

    @BeforeAll
    public static void logBeforeAll() {
        System.out.println("In beforeAll method");
    }

    @BeforeEach
    public void logBeforeEach() {
        System.out.println("In beforeEach method.");
    }

    @AfterAll
    public static void logAfterAll() {
        System.out.println("In afterAll method.");
    }

    @AfterEach
    public void logAfterEach() {
        System.out.println("In afterEach method.");
    }

    @Test
    @Order(2)
    public void firstTest() {

    }

    @Test
    @Order(3)
    public void string_EqualsString_stringEquals() {
        Assertions.assertEquals("Text", "Text");
    }

    @Test
    @Order(1)
    public void failureString_NotEqualsString_stringNotEquals() {
        Assertions.assertEquals("Text", "text");
    }
}
