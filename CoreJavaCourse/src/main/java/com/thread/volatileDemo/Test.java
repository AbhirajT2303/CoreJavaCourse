package com.thread.volatileDemo;

public class Test {
    public static void main(String[] args) {
        System.out.println("main thread");
        Volatile v1 = new Volatile();
        v1.start();

        v1.stopFlag = false;
        System.out.println("stopFla set to false.");

    }
}
