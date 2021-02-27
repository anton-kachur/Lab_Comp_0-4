package l1;

import java.lang.reflect.*;

public class ComplexProxy implements InvocationHandler{
    private Object n;

    private ComplexProxy(Object obj) {
        this.n = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("Method")) {
            return method.invoke(n, args);
        }
        throw new IllegalAccessException("Not allowed");
    }

    public static Object newProxyInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new ComplexProxy(obj));
    }
}
