package l2.patternProxy.NewComplexProxy;

import java.lang.reflect.Method;

public class NewComplexProxyController {
    private NewComplexProxy model;
    //private ComplexProxyView view;

    public NewComplexProxyController(NewComplexProxy model) {
        this.model = model;
    }

    public void startController() {
        model.start();
    }

}
