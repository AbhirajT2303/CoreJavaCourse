package com.methodes;

public class StaticMethod {
//    static variable
    StaticMethod(){
        System.out.println("Inside constructor");
    }
    static int num1 = 10;
    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
    StaticMethod.print();
    int a = num1;
    num1++;
    int b = num1;
        System.out.println("a: "+a+"\nb:"+b);
    }

//    static block
    static {
    System.out.println("Inside Static block");
    }

//    static method
    static void print(){
        System.out.println("Inside Static method");
    }
}
