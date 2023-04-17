package com.java8.multipleInterfaces;

public interface Interface1 {
    void method1(String str);
    default void log(String str){
        System.out.println("inside log method of interface2 : "+str);
    }
    static void print(String str){
        System.out.println("inside print method of interface2 : "+str);
    }
}
