package l1.ComplexNumberExponential;

public class ComplexNumberExponentialView {
    private ComplexNumberExponential model;

    public ComplexNumberExponentialView(ComplexNumberExponential model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model.toString();
    }

    public ComplexNumberExponential setModel(ComplexNumberExponential m) {
        this.model = m;
        return this.model;
    }

}
