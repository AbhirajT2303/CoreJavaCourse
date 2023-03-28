package com.abstractdemo2;

public class Test {
    public static void main(String[] args) {
        Bike b = new Activa(123);
        b.maxAvg();
        b.maxSpeed();
        b = new HeroHonda(1234);
        b.maxAvg();
        b.maxSpeed();
    }
}
