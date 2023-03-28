package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("arjun");
        hs.add("krishiv");
        hs.add("pooja");
        hs.add("Vaishnavi");
        hs.add("kamuni");
        System.out.println("Set Elements:"+ hs+"\n");

        hs.add("Abhishek");

        System.out.println("Elements Iterating through Iterator:");
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        hs.remove("Abhishek");
        System.out.println("\n"+"Elements Iterating through foreach:");
        for (String names : hs) {
            System.out.println(names);
        }

    }
}