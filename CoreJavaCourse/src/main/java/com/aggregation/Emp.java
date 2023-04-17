package com.aggregation;

public class Emp {
    int id;
    String name;
    Address address;
    public Emp(int id, String name, Address address){
        this.id= id;
        this.name=name;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Emp{" +"id=" + id +", name='" + name + '\'' +", address=" + address +'}';
    }

    public static void main(String[] args) {
        Emp emp= new Emp(1,"Abc",new Address("Hyd","TS","IND"));
        System.out.println(emp);
    }
}
