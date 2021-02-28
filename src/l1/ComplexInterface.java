package l1;

public interface ComplexInterface {
    @About(name="Method, which gets complex number")
    String toString();

    @About(name="Method, which gets real part of complex number")
    String getReal();

    @About(name="Method, which gets imaginary part of complex number")
    String getImaginary();

    void setReal(int r);
    void setImaginary(int i);
}
