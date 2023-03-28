package com.serialization.demo;

import com.sun.jdi.request.StepRequest;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String fileName = "file.txt";
        Movie mv = new Movie();
        mv.setMovieName("RRR");
        mv.setMovieTiming("3:00 PM");
        mv.setNoOfTickets(3);

        try {
            ConvertingClass.Serialization(mv,"file.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Object object = new Object();
        try {
           object =(Object) ConvertingClass.Deserialization(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After reading from file = \n"+object);

    }
}
