package com.thread.daemon;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DaemonThread d1 = new DaemonThread();
        d1.setDaemon(true);
        d1.start();
        System.out.println("enter some data: ");
        String data  = sc.nextLine();
        System.out.println("you have entered: "+ data);
        System.out.println("main thread goes to sleep for 5 sec!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main thread resumed!");
        System.out.println("main thread ends.");
    }
}
