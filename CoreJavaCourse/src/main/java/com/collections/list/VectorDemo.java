package com.collections.list;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List<String> lst= new Vector<>();
        lst.add("laptop");
        lst.add("mobile");
        lst.add("tab");
        lst.add(2,"Tablet");
        lst.add(4,"tv");
        System.out.println(lst);

        System.out.println("after deleting");
        lst.remove(2);
        lst.remove("tv");
        System.out.println(lst);

        System.out.println("Using IteratorInterface ListIterator backward: ");
        ListIterator itr = lst.listIterator(lst.size());
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
