package com.controlStatements;

public class SwitchCaseDemo {

    public static void main(String[] args) {
        String month = "feb";
//switch case demo
        switch(month){
            case "jan": System.out.println("");
            case "mar":
                break;
            case "may":
            case "jul":
            case "agu":
            case "oct":
            case "dec":
                System.out.println("31 days");
                break;
            case "apr":
            case "jun":
            case "sep":
            case "nov":
                System.out.println("30 days");
                break;
            case "feb":
                System.out.println("28 days");
                break;
        }
    }
}
