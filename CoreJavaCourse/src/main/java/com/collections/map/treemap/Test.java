package com.collections.map.treemap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Person p1= new Person("Raj",23,"male");
        Person p2= new Person("arjun",21,"male");
        Person p3= new Person("Abhi",21,"male");
        Person p4= new Person("rani",20,"female");

        Map<String, Person> hm = new TreeMap<>();
        hm.put("raj",p1);
        hm.put("arjun",p2);
        hm.put("abhi",p3);
        hm.put("rani",p4);
        System.out.println("after adding :"+hm);

        Set<String> keys = hm.keySet();
        for (String key:keys) {
            System.out.println("Value of "+key+" is: ");
            Person obj = hm.get(key);
            obj.display();
        }
        hm.remove("rani");
        System.out.println(hm);
    }
}
