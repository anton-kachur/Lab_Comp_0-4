package mock_tests;

import l1.ComplexNumberExponential;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

class ComplexNumberExponentialTest_mock {

    private ComplexNumberExponential n = new ComplexNumberExponential(4, 2);

    @BeforeEach
    void setUp() {
        n = mock(ComplexNumberExponential.class);
        when(n.toString()).thenReturn("4e^i0");
    }

    @Test
    void testToString() {
        assertEquals(n.toString(), "4e^i0");
    }
}