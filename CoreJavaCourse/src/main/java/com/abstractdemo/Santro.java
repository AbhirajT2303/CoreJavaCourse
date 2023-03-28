package com.abstractdemo;

public class Santro extends Car
{
    public Santro(int regNo) {
        super(regNo);
    }

    @Override
    public void steering() {
        System.out.println("Hydraulic Steering");
    }
    @Override
    public void breaking() {
        System.out.println("Hydraulic breaks");
    }
    public void displayDetails(){
        System.out.println("this is Santro car");
    }
}
