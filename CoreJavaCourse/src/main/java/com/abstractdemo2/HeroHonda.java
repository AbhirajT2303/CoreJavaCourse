package com.abstractdemo2;

public class HeroHonda extends Bike{

    HeroHonda(int regNo) {
        super(regNo);
        System.out.println("HeroHonda reg No= "+regNo);
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed is 100 kp/h");
    }

    @Override
    public void maxAvg() {
        System.out.println("Max avg is 25/km");
    }
}
