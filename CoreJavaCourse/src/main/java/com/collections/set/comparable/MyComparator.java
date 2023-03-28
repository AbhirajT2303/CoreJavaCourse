package com.collections.set.comparable;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {



    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getId()> o2.getId()){
            return 1;
        }else
            return -1;
    }
}
