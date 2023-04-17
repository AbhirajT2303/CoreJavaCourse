package com.thread;

import com.thread.creating.runnable.MyRunnable;

public class JoinTest {
    public static void main(String[] args) {
        System.out.println("main thread starts!");
        MyRunnable obj  = new MyRunnable();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.start();
        try {
            t1.join(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main thread ends");
    }
}
