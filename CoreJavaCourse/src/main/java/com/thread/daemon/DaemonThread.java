package com.thread.daemon;

public class DaemonThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Good things are on the way");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
