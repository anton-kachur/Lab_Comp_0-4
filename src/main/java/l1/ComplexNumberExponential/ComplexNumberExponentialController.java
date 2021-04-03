package l1.ComplexNumberExponential;

import l1.ComplexNumber.ComplexNumber;

public class ComplexNumberExponentialController {
    private ComplexNumberExponential model;
    //private ComplexNumberExponentialView view;

    public ComplexNumberExponentialController(ComplexNumberExponential model) {
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
