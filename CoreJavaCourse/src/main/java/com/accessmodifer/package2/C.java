package com.accessmodifer.package2;
import com.accessmodifer.package1.A;

public class C {
    public static void main(String[] args) {
        A a= new A();
//    private    a cant access
//    public     b can  access
//    protected  c cant access
//    default    d cant access
        System.out.println("public: "+a.b);
    }
}
