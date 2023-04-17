package com.java8.interfaces;

import static com.java8.interfaces.ImpClass.method4;

public class MainMethod {
    public static void main(String[] args) {
        ImpClass obj = new ImpClass();
        obj.method1();
        StaticAndDefaultMethods.method2();
        obj.method3();
        method4();
    }
}
