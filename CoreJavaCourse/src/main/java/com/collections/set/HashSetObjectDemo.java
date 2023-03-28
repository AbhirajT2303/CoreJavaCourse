package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee{
    int id;
    String name;
    Employee(int id,String name){
        this.id = id;
        this.name = name;
    }
    public void display(){
        System.out.println("Employee id is: "+this.id);
        System.out.println("Employee Name is: "+this.name);
    }
}
public class HashSetObjectDemo {
    public static void main(String[] args) {
        Set<Employee> emp = new HashSet<>();
        emp.add(new Employee(1,"arjun"));
        emp.add(new Employee(2,"raj"));
        emp.add(new Employee(3,"krishiv"));

        Iterator itr  = emp.iterator();
        while (itr.hasNext()){
           Employee e = (Employee) itr.next();
           e.display();
        }
    }
}
