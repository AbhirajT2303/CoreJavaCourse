package com.abstractdemo2;

public abstract class Bike {
    int regNo;
    Bike(int regNo){
        this.regNo= regNo;
    }
    public void type(){
        System.out.println("This is two wheeler bike");
    }
    public abstract void maxSpeed();
    public abstract void maxAvg();
}
