package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Object> lis = new ArrayList<>();
        lis.add("one");
        lis.add(2);
        lis.add(3.0);
        lis.add('E');

        System.out.println("size of ArrayList is " +lis.size());
        lis.remove("one");
        System.out.println("size of ArrayList is " +lis.size());
        lis.remove(2);
        System.out.println("size of ArrayList is " +lis.size());
        lis.add(2,"abcd");
        lis.add(3,23);

        System.out.println("Using Iterator moving backward");
        Iterator itr =lis.iterator() ;
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Using list Iterator moving forward");
        ListIterator listr = lis.listIterator();
        while(listr.hasNext()){
            System.out.println(listr.next());
        }

        System.out.println("Using list Iterator moving backward");
        ListIterator listrB = lis.listIterator(lis.size());
        while(listrB.hasPrevious()){
            System.out.println(listrB.previous());
        }
    }
}

