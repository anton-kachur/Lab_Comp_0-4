package l2.ComplexNumberExponential;

import l2.ComplexNumber.ComplexNumber;
import l2.ComplexNumberExponential.ComplexNumberExponential;

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
