package com.abstractdemo;

public class Celerio  extends Car {


    public Celerio(int regNo) {
        super(regNo);
    }

    @Override
    public void steering() {
        System.out.println("Manual Steering");
    }
    @Override
    public void breaking() {
        System.out.println("Gas breaks");
    }
    public void displayDetails(){
        System.out.println("this is Maruthi car");
    }

}
