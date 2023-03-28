package com.operators;

public class LogicalOperatorDemo {
    public static void main(String[] args) {
        int a = 9, b=10;
        int u = (a>b)? a:b;
        if (a  != b && a<b){
            System.out.println("Both are diff values and b is greater then a");
        }
        int c = 10,d=10;
        if(!(c==d)){
            System.out.println(" c is not equals to d");
        }else{
            System.out.println("Both are equal");
        }
    }
}
