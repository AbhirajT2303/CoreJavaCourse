package com.collections.list.listmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

import com.collections.list.ArrayListDemo;

public class ListMethods {
    public static void main(String[] args) {

        List<String> newNames = new ArrayList<>();
        newNames.add("anurag");
        newNames.add("Shripad");

        List<String> name = new ArrayList<>();
        name.add("Abhi");
        name.add(0, "anu");
        String indexAt_1 = name.get(1);
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
        List<String>subNames = name.subList(1,2);
        System.out.println("subNames"+subNames);
        System.out.println(name.lastIndexOf("Abhi"));
    }
}
