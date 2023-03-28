package com.exceptionhandling.userdefined.runtimeexception;

public class RunTimeException extends RuntimeException{
    public RunTimeException(String str){
    super(str);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
