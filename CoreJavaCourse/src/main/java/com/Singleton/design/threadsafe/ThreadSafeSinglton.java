package com.Singleton.design.threadsafe;

public class ThreadSafeSinglton {
    private static ThreadSafeSinglton instance ;

    private ThreadSafeSinglton(){}

    public static synchronized ThreadSafeSinglton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSinglton();
        }
        return instance;
    }
}

