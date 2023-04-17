package com.thread;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("Main thread started!");
        System.out.println("Entre some data!");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("you entred: "+ name);
        System.out.println("main thread go for sleep for 5 sec!");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main thread resumed!");
        System.out.println("main thread ends.");
    }
}
