package com.collections.list;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("String");
        lst.add("Integer");
        lst.add("Character");
        lst.add("Float");
        lst.add("Double");
        lst.add("Long");
        System.out.println("ArrayList - "+lst);

        Set<String> llst = new TreeSet<>(lst);
        System.out.println("set -       "+llst);
    }
}
