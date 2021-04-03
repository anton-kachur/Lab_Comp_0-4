package l1.ComplexProxy;

import l1.ComplexNumber.ComplexNumber;

import java.lang.reflect.Method;

public class ComplexProxyController {
    private ComplexProxy model;
    //private ComplexProxyView view;

    public ComplexProxyController(ComplexProxy model) {
        this.model = model;
    }


    public Object invokeController(Object proxy, Method method, Object[] args) throws Throwable {
       return model.invoke(proxy, method, args);
    }

}
