package com.controlStatements;

public class ForLoopDemo {
//    For loop demo for printing factorial
public static void main(String[] args) {
    int i =0, factorialOf=5, fact =1;
        for (i =1; i<=factorialOf; i++) {
            fact *= i;
        }
    System.out.println("factorial of "+factorialOf+" is "+fact);
    }
}
