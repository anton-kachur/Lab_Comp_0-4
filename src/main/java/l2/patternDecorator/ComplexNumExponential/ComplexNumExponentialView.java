package l2.patternDecorator.ComplexNumExponential;

import l1.ComplexNumberExponential.ComplexNumberExponential;

public class ComplexNumExponentialView {
    private ComplexNumExponential model;

    public ComplexNumExponentialView(ComplexNumExponential model) {
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
