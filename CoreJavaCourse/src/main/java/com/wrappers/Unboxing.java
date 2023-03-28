package com.wrappers;

public class Unboxing {
    public static void main(String[] args) {
//        Unboxing Example -wrapper to primitive
        Integer a = 10;

//        int  b= a.intValue(a); ---> this step is called  unboxing and compiler implicitly does it.
        int c = a;
        System.out.println("a : "+a+"\nc : "+c);

    }
}
