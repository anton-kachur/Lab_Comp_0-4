package l1.ComplexNumber;

public class ComplexNumberView {
    private ComplexNumber model;

    public ComplexNumberView(ComplexNumber model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model.toString();
    }
    public String getNumberReal() {
        return model.getReal();
    }
    public String getNumberImaginary() {
        return model.getImaginary();
    }

}
