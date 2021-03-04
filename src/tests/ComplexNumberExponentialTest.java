package tests;

import l1.ComplexNumberExponential;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberExponentialTest {

    private ComplexNumberExponential n = new ComplexNumberExponential(4, 2);

    @Test
    @DisplayName("Test for toString")
    void testToString() {
        assertEquals(n.toString(), "4e^i0");
        assertNotEquals(n.toString(), "2e^i4");
    }
}