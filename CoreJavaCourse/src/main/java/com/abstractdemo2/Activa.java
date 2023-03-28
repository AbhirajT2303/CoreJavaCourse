package com.abstractdemo2;

public class Activa extends Bike {
    Activa(int regNo) {
        super(regNo);
        System.out.println("Activa reg No= "+regNo);
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max Speed is 80 km/h");
    }

    @Override
    public void maxAvg() {
        System.out.println("Max avg is 20 km/h");
    }
}
