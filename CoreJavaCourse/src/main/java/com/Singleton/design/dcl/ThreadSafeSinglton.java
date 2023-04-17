package com.Singleton.design.dcl;

public class ThreadSafeSinglton {
    private static volatile ThreadSafeSinglton instance;

    private ThreadSafeSinglton() {
    }

    public static ThreadSafeSinglton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSinglton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSinglton();
                }
            }
        }
        return instance;
    }
}

