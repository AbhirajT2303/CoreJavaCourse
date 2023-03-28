package com.exceptionhandling.userdefined.runtimeexception;

import java.util.Scanner;

public class Test {

    static void vote(int age){
        Scanner se = new Scanner(System.in);
        try {
            if (age < 18) {
                throw new RunTimeException("your not eligible to vote");
            } else {
                System.out.println("Welcome! you can vote");
            }
        }catch( RunTimeException e){
            System.out.println("exception caught here\n"+e);
        }
        System.out.println("more code can go here! hi");
    }
    public static void main(String[] args) {
        try {
            vote(12);
        }catch(RunTimeException e){
            System.out.println("exception caught here\n"+e);
        }
        System.out.println("more code can go here!");
    }
}
