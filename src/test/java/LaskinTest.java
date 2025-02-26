import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaskinTest {
    @Test
    void testSum() {
        assertEquals(5, Laskin.add(2, 3), "Sum method failed");
        assertEquals(-1, Laskin.add(-2, 1), "Sum method failed");
        assertEquals(0, Laskin.add(0, 0), "Sum method failed");
    }

    @Test
    void testSub() {
        assertEquals(1,Laskin.subtract(3, 2), "Subtraction method failed");
        assertEquals(-3, Laskin.subtract(2, 5), "Subtraction method failed");
        assertEquals(0, Laskin.subtract(4, 4), "Subtraction method failed");
    }

    @Test
    void testMul() {
        assertEquals(6, Laskin.multiply(2, 3), "Multiplication method failed");
        assertEquals(-10, Laskin.multiply(-2, 5), "Multiplication method failed");
        assertEquals(0, Laskin.multiply(0, 100), "Multiplication method failed");
    }

    @Test
    void testDiv() {
        assertEquals(2, Laskin
                .divide
                        (6, 3), "Division method failed");
        assertEquals(-2, Laskin
                .divide
                        (-6, 3), "Division method failed");

        // Testing division by zero (Should throw ArithmeticException)
        assertThrows(ArithmeticException.class, () -> Laskin
                .divide
                        (5, 0), "Division by zero should throw an exception");
    }

}