package com.operators;

public class BooleanOperatorDemo {
    public static void main(String[] args) {
        boolean x = true, y=false;

        if(x & y){
            System.out.println("both are true");
        }
        if(x | y){
            System.out.println("anyone is correct");
        }
        if(!x){
            System.out.println("X is false");
        }else
            System.out.println("x is true");

    }
}
