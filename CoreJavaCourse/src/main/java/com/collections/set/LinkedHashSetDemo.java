package com.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Employee> hs=new LinkedHashSet<>();
        hs.add(new Employee(1001, "Lakhi"));
        hs.add(new Employee(1002, "Arjun"));
        hs.add(new Employee(1003, "Anu"));
        hs.add(new Employee(1004, "Ajay"));


        Iterator<Employee> itr1 = hs.iterator();

        while(itr1.hasNext()){
            Employee e1 = itr1.next();
            e1.display();
        }
    }
}
