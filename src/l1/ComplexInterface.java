<<<<<<< HEAD
package l1;

public interface ComplexInterface {
    @About(name="Method, which gets complex number")
    String toString();

    @About(name="Method, which gets real part of complex number")
    String getReal();

    @About(name="Method, which gets imaginary part of complex number")
    String getImaginary();

    double setReal(int r);
    double setImaginary(int i);

    @About(name="Method, which gets the sum of complex numbers")
    ComplexNumber sumNumbers(ComplexNumber num);

    @About(name="Method, which gets the difference of complex numbers")
    ComplexNumber minusNumbers(ComplexNumber num);

    @About(name="Method, which gets the product of complex numbers")
    ComplexNumber timesNumbers(ComplexNumber num);
}
=======
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
>>>>>>> origin/master
