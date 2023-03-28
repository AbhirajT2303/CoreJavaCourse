package com.exceptionhandling.userdefined.exception;

public class Test {
    public static void main(String[] args) {
        int a = -10;
        //write code to throw NegativeNumberException
        if(a<0){
            try{
                throw new USerDefinedException(a);
            } catch(USerDefinedException ne){
                System.out.println("User defined Error!");
                ne.printStackTrace();

            }
        }else
        {
            System.out.println("the given number "+ a + " is a positive number");
        }
        System.out.println("inside main method");
    }

}
