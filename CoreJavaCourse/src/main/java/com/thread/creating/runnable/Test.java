package com.thread.creating.runnable;

public class Test {
    public static void main(String[] args) {
        System.out.println("main thread starts!");
        MyRunnable mr = new MyRunnable();
        Thread tr = new Thread(mr);
        tr.start();
        System.out.println("main thread ends!");
    }
}
