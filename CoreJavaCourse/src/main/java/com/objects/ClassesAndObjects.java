package com.objects;

public class ClassesAndObjects {
    String name;
    int age;
    String  gender;
    String fevFood;
//    Using Default Constructor
    ClassesAndObjects() {
        this.name= "Krishiv";
        this.age = 1;
        this.gender = "male";
        this.fevFood = "cerlac";
    }
//    Assigning values using parameterized Constructor
    ClassesAndObjects(String name, int age, String gender, String fevFood) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.fevFood= fevFood;
    }
    public void fevFood() {
        System.out.println( name+"'s fev food is "+fevFood);
    }

    public static void main(String[] args) {
//calling default constructor
    ClassesAndObjects obj = new ClassesAndObjects();
    obj.fevFood();
//    obj.name="krishiv";
    System.out.println("default constructor vales - "+obj.name+"\n"+obj.age+"\n"+obj.gender);
//calling para-constructor
    obj = new ClassesAndObjects("raju",21,"male","chines food");
    obj.fevFood();
    System.out.println("default constructor vales - "+obj.name+"\n"+obj.age+"\n"+obj.gender);
    }
}
