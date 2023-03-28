package com.objects;

public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void talk(){
        System.out.println("Hi Hello, I'm "+ name);
        System.out.println("My age is "+ age);
    }

    public void run() {
        System.out.println("I can run fast!");
    }
}
