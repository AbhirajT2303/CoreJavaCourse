package com.interfaces;

public class MySql implements ConnectingProcess{
    @Override
    public void connect() {

        System.out.println("Connecting to DB");
    }

    @Override
    public void process() {
        System.out.println("Processing on DB");

    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting on DB");
    }
}
