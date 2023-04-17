package com.thread.volatileDemo;

public class Volatile extends Thread{
   public volatile boolean stopFlag =true;

    public void run(){
        long count=0;
        while (stopFlag) {
            count++;
            System.out.println(count);
        }
        System.out.println("Thread terminated."+count);

    }
}
