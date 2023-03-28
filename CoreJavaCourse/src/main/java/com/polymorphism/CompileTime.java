package com.polymorphism;

public class CompileTime {
    static void sum(int a, int b) {
        System.out.println("The Sum of two Numbers is: "+ (a+b));
    }
    static void sum(int a, int b,int c){
        System.out.println("The Sum of Three Numbers is: "+ (a+b+c));
    }

    public static void main(String[] args) {
       CompileTime.sum(12,13);
       CompileTime.sum(12,13,14);
    }
}
