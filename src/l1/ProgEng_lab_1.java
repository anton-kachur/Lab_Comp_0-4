package l1;

import l1.About;

import java.lang.String;
import java.lang.reflect.*;
import java.lang.*;

//Anton Kachur TI-82
//Task: 7.Create a complex numbers using Java

public class ProgEng_lab_1 {

    //**************************Generates random name************************************************
    public static void main (String []args) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        ComplexNumber n1 = new ComplexNumber(1, 2);
        ComplexNumberExponential n2 = new ComplexNumberExponential(1, 2);

        Class clazz = ComplexNumberExponential.class;

        System.out.println("Class: " + clazz.getName() + "; Superclass: " + clazz.getSuperclass().getName());

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(About.class)) {
                System.out.println("Method: " + method.getAnnotation(About.class).name() + " -> " + method.invoke(n2));
            }
        }

        Getter proxy = (Getter) ComplexProxy.newProxyInstance(n2);
        System.out.println(proxy.getReal());
        proxy.setReal(1);

    }
}

