package com.collections.set.comparable;

import com.collections.set.compareto.Employee;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Employee> hs=new ArrayList<>();
        hs.add(new Employee(1002, "Rakhi"));
        hs.add(new Employee(1001, "Arjun"));
        hs.add(new Employee(1003, "Anu"));
        hs.add(new Employee(1004, "Ajay"));

        Collections.sort(hs);
        for (Employee e1 : hs) {
            e1.display();
        }
    }
}
