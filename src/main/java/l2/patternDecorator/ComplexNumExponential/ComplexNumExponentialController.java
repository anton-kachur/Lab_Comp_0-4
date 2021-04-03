package l2.patternDecorator.ComplexNumExponential;

import l2.ComplexNumberExponential.ComplexNumberExponential;

public class ComplexNumExponentialController {
    private ComplexNumExponential model;
    //private ComplexNumberExponentialView view;

    public ComplexNumExponentialController(ComplexNumExponential model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model.toString();
    }

    public ComplexNumExponential setModel(ComplexNumExponential m) {
        this.model = m;
        return this.model;
    }

}
