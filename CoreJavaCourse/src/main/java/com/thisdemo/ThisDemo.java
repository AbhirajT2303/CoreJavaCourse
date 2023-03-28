package com.thisdemo;

public class ThisDemo {
    int num;
    ThisDemo(){
//        calling constructor using this
        this(100);
//        calling display method using this
        this.display();
    }
    ThisDemo(int num){
//        accessing current class variable using this
        this.num=num;
    }
    public void display(){
        System.out.println("num vaalue is: "+ num);
    }
}
