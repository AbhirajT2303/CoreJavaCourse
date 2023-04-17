package com.thread.creating.threadclass;

public class Test {
    public static void main(String[] args) {
        System.out.println("main thread starts");
        MyThread mt = new MyThread();
        mt.start();
        System.out.println("main thread ends.");
    }
}
