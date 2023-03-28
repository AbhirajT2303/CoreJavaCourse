package com.abstractdemo;

public abstract class Car {

    int regNo;

    public Car(int regNo) {
        this.regNo = regNo;
    }

    public void fillTank(){
        System.out.println("Take key ,open tank and fill Oil");
    }

    public abstract void steering();
    public abstract void breaking();
}
