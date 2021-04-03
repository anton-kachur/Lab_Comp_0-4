package l2.patternProxy.NewComplexProxy;

import java.lang.reflect.Method;

public class NewComplexProxyView {
    private NewComplexProxy model;

    public NewComplexProxyView(NewComplexProxy model) {
        this.model = model;
    }

    public void startController() {
        model.start();
    }
}
