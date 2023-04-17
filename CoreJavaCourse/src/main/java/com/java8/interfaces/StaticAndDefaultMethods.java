package com.java8.interfaces;

public interface StaticAndDefaultMethods {
    void method1();
    static void method2(){
        System.out.println("inside static Method2");
    }
    default void method3(){
        System.out.println("inside default Method3");
    }
}
