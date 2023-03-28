package com.accessmodifer.package1;

public class B {
    public static void main(String[] args) {
        A a = new A();
//    private    a cant access
//    public     b can  access
//    protected  c can  access
//    default    d can  access
        System.out.println("public: "+a.b+"protected: "+a.c+"default: "+a.d);
    }
}
