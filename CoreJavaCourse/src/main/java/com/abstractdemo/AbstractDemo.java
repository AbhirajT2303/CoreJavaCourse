package com.abstractdemo;

public class AbstractDemo {
    public static void main(String[] args) {

        Celerio c = new Celerio(1000);
        Santro s = new Santro(10001);

        Car car;
        car = c;
        car.steering();
        car.breaking();
        car.fillTank();

        car = s;
        car.steering();
        car.breaking();
        car.fillTank();

    }
}
