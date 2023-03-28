package com.exceptionhandling.userdefined.exception;

public class USerDefinedException extends Exception{
    int x;
    public USerDefinedException(int i) {
        this.x = i;
    }

    public String toString(){
        return "the given number " + x + " is a negative number";
    }

}
