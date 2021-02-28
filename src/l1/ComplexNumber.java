package l1;


@Info(name = "Simple form")
class ComplexNumber implements ComplexInterface {
    private double real;
    private double imaginary;

    ComplexNumber(double a, double b){
        real = a;
        imaginary = b;
    }

    @Override
    @About(name="Method, which gets complex number")
    public String toString() {
        return (real!=0)? real + " + " + imaginary + "i": imaginary + "i";
    }

    @Override
    @About(name="Method, which gets real part of complex number")
    public String getReal() {
        return ""+real;
    }

    @Override
    @About(name="Method, which gets imaginary part of complex number")
    public String getImaginary() { return ""+imaginary; }

    @Override
    public void setReal(int r) {
        real = r;
    }

    @Override
    public void setImaginary(int i) { imaginary = i; }
}
