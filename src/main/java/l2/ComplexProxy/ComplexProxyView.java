package l2.ComplexProxy;

import l2.ComplexProxy.ComplexProxy;

import java.lang.reflect.Method;

public class ComplexProxyView {
    private ComplexProxy model;

    public ComplexProxyView(ComplexProxy model) {
        this.model = model;
    }

    public Object invokeController(Object proxy, Method method, Object[] args) throws Throwable {
        return model.invoke(proxy, method, args);
    }
}
