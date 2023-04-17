package com.collections.set.set.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {
    public static void main(String[] args) {
        Set<String> newNames = new TreeSet<>();
        newNames.add("anurag");
        newNames.add("Shripad");

        Set<String> name = new TreeSet<>();
        name.add("Abhi");
        name.add("anu");

        System.out.println("names= "+name);
//      Integer hasCode=  name.hashCode();
        name.addAll(newNames);
        System.out.println("After addAll method in name = "+name);

        System.out.println("Size after addAll method in name " +name.size());
//        name.remove(1);
        name.remove("anurag");
        System.out.println( name.contains("Shripad"));
        System.out.println(name.containsAll(newNames));
//        name.clear();
        System.out.println(name.isEmpty());


//        System.out.println(name.removeAll(newNames));
        System.out.println("After removeAll method in name = "+name);
    }
}
