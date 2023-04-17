package com.java8.interfaces;

public class ImpClass implements StaticAndDefaultMethods {
    @Override
    public void method1() {
        System.out.println("inside Method1");
    }
    public static void method4(){
        System.out.println("inside static Method4 in impclass");
    }
}
