package com.operators;

public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;

        if((a += b )== 30){
            System.out.println("Compact Notation");
        }
    }
}
