package com.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> hs=new TreeSet<>();
        hs.add("Ajay");
        hs.add("Lakhi");
        hs.add("Anu");
        hs.add("Arjun");

        Iterator<String> itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Iterator<String> itr1 = hs.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next() + " deleting");
            itr1.remove();
        }
    }
}
