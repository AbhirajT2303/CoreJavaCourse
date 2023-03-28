package com.string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "Hello is there, this is index of methods";
        String str1= "A b C";
        System.out.println(str.indexOf('t'));
        System.out.println(str.indexOf(' ',9));
        System.out.println(str.indexOf("is",12));
        System.out.println(str1.length());
        System.out.println(str.indexOf('H'));
    }
}
