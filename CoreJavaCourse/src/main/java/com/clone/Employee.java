package com.clone;
public class Employee implements Cloneable{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +"id=" + id +", name='" + name + '\'' +'}';
    }

//    @Override
//    public Employee clone() {
//        try {
//            return (Employee) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee(1,"abc");
        Employee emp2 =null;
        emp2= (Employee) emp1.clone();
        System.out.println(emp1);
        emp1.id=2;
        System.out.println(emp2);
        System.out.println(emp1==emp2);
        System.out.println(emp1.equals(emp2));
    }
}
