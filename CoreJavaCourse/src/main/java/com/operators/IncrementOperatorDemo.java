package com.operators;

public class IncrementOperatorDemo {
    public static void main(String[] args) {
//        increment unary operator
        int a = 10;
//        pre increment
        int c = ++a;
//        post increment
        c = a++;
        System.out.println(c);

//      decrement unary operator
//        int a = 10;
//        pre decrement
//        int c = --a;
//        post decrement
        c = a--;
        System.out.println(c);
    }
}
