package com.wrappers;

public class Autoboxing {
    public static void main(String[] args) {
//      Autoboxing example of int to Integer
        int a = 12;
//        Integer i = Integer.valueOf(a); ----->this is avoided because compiler will
//        automatically do it and this is called as aut-boxing
        Integer j = a;

        System.out.println("a: "+a+"\nj: "+j);


    }
}
