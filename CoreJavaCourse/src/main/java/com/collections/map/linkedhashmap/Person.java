package com.collections.map.linkedhashmap;

public class Person {
    String name;
    String gender;
    int age;

    Person(String name, int age, String gender){
        this.name= name;
        this.age = age;
        this.gender=gender;
    }
    public void display(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nGender: "+gender);
    }

    @Override
    public String toString() {
        return "Person{"+"name= "+name+", gender= "+gender+", age= "+age+"}";
    }
}
