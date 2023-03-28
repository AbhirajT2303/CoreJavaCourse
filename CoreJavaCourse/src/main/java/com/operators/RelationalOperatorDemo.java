package com.operators;

public class RelationalOperatorDemo {
    public static void main(String[] args) {
        int a= 12;
        int b= 89;
        if (a > b){
            System.out.println("a is greater then b ");
        }else {
            System.out.println("a is smaller then b");
        }

        int c = 10,d=10;
        if(c == d){
            System.out.println("both values are same");
        }else {
            System.out.println("both are diff values");
        }

        if( c!=d ){
            System.out.println("both are diff values");
        }else {
            System.out.println("both are same values");
        }
    }
}
