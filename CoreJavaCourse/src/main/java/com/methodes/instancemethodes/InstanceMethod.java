package com.methodes.instancemethodes;

public class InstanceMethod {
    String name ;
    int age;
    String gender;
    InstanceMethod(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
//    Accessor method
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender: " + gender);
    }
//    Mutator Method
    public void modify(){
        this.name = "abhi";
        this.age = 21;
        this.gender = "male";
    }
}
