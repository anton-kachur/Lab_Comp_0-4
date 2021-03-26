package mock_tests;

import l1.ComplexNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ComplexNumberTest_mock {

    ComplexNumber n = new ComplexNumber(1, 2);
    ComplexNumber n1 = new ComplexNumber(6, 1.5);
    ComplexNumber n2 = new ComplexNumber(0, 1.5);

    @BeforeEach
    void setUp() {
        n = mock(ComplexNumber.class);
        when(n.getImaginary()).thenReturn("2.0i");
        when(n.getReal()).thenReturn("1.0");
        when(n.toString()).thenReturn("1.0 + 2.0i");
        when(n.setImaginary(3)).thenReturn(3.0);
        when(n.setReal(6)).thenReturn(6.0);
    }

    @Test
    void testToString() {
        assertEquals(n.toString(), "1.0 + 2.0i");
    }

    @Test
    void getReal() {
        assertEquals(n.getReal(), "1.0");
        verify(n).getReal();
    }

    @Test
    void getImaginary() {
        assertEquals(n.getImaginary(), "2.0i");
        verify(n).getImaginary();
    }

    @Test
    void setReal() {
        assertEquals(n.setReal(6), 6.0);
        verify(n).setReal(6);
    }

    @Test
    void setImaginary() {
        assertEquals(n.setImaginary(3), 3.0);
        verify(n).setImaginary(3);
    }

    @Test
    void sumNumbers() {
        assertEquals(n1.sumNumbers(n).toString(), "7.0 + 3.5i");
        verify(n).sumNumbers(n1);
    }

    @Test
    void minusNumbers() {
        assertEquals(n1.minusNumbers(n).toString(), "-5.0 + 0.5i");
        verify(n).sumNumbers(n1);
    }

    @Test
    void timesNumbers() {
        assertEquals(n1.timesNumbers(n).toString(), "6.5 + 6.5i");
        verify(n).sumNumbers(n1);
    }

}