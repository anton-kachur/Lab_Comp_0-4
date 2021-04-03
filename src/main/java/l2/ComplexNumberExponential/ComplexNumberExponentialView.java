package l2.ComplexNumberExponential;

import l1.ComplexNumberExponential.ComplexNumberExponential;

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
