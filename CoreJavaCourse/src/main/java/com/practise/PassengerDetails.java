package com.practise;

public class PassengerDetails {
    private String Name;
    private int age;
    private String gender;
    private String berth;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBerth() {
        return berth;
    }

    public void setBerth(String berth) {
        this.berth = berth;
    }

    @Override
    public String toString() {
        return "PassengerDetails{" +"Name='" + Name + '\'' +", age=" + age +", gender='" + gender + '\''
                +", berth='" + berth + '\'' +'}';
    }
}
