package l1;

import l1.About;

@Info(name = "Simple form")
class ComplexNumber {
    private double real;
    private double imaginary;

    ComplexNumber(double a, double b){
        real = a;
        imaginary = b;
    }

    @About(name="Method, which gets complex number")
    String getNumber() {
        return (real!=0)? real + " + " + imaginary + "i": imaginary + "i";
    }

    @About(name="Method, which gets real part of complex number")
    String getReal() {
        return ""+real;
    }

    @About(name="Method, which gets imaginary part of complex number")
    String getImaginary() {
        return ""+imaginary;
    }
}
