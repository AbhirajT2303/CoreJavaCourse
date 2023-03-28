package com.controlStatements;

public class IfElseStatementDemo {
    public static void main(String[] args) {
        int num = 43;
//   this is if else demo
        if(num == 0){
            System.out.println("Number is Zero");
        }else{
            System.out.println("Nmber is non-Zero value");
        }

//  nested if else demo
        int  num1 = 100;
        if(num1 == 0 ){
            System.out.println("Number is Zero");
        }else if(num1 > 0){
            System.out.println("Number is positive Integer");
        }else {
            System.out.println("Number is Negative Integer");
        }
    }
}
