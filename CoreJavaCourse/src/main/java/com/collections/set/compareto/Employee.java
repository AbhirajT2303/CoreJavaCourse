package com.collections.set.compareto;

public class Employee implements Comparable{
   int id;
   String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display(){
        System.out.println("Employee id is: "+this.id);
        System.out.println("Employee Name is: "+this.name);
    }
    @Override
    public int compareTo(Object o) {
        Employee em  = (Employee) o;
        if (name == em.name){
            return 0;
        }else if (id > em.id){
            return 1;
        }else {
            return -1;
        }
    }
}
