package com.controlStatements;

public class ReturnDemo {


    public static void main(String[] args) {
        int a =addToNo(6,10);
        System.out.println("addition is "+a);
        checkCondition(a);
    }

    public static int addToNo(int a,int b){
        return a+b;
    }

    public static void checkCondition(int a) {
        if(a==15)
            return;
        System.out.println("A value " + a);
    }

}
