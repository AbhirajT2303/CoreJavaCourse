package com.string;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre First Name:");
        String firstName = sc.nextLine();
        System.out.println("Entre Last Name:");
        String lastName = sc.nextLine();
        System.out.println("First Name's last character: " + firstName.charAt(firstName.length()-1));
        System.out.println("compering to Strings: "+ firstName.compareTo(lastName));// firstName > lastName
//                                                                                        a<b= -1  b<a= 1
//        firstName=firstName.concat(lastName);
//        System.out.println("first Name after String concat method: "+firstName);
        System.out.println("String Contains method: "+firstName.contains("abhi"));
        System.out.println("String endsWith method: "+firstName.endsWith("okul"));
        System.out.println("String equals method: "+ firstName.equals(lastName));
        System.out.println("String equals ignore case: "+ firstName.equalsIgnoreCase(lastName));
    }
}
