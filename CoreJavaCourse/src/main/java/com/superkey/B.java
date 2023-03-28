package com.superkey;

public class B extends A {
    int num1;
    B(int num, int num1){
//        calling para-constructor using super
        super(num);
        this.num1=num1;
    }
    public void show(){
//        calling super class variable using super
        System.out.println("Num value from from B class: "+super.num);
        System.out.println("Num1 value of class B: "+ num1);
//        calling super class method using super
    }
}
