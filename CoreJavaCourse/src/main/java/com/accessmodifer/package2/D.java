package com.accessmodifer.package2;
import com.accessmodifer.package1.A;
public class D extends A {

    public static void main(String[] args) {
        A obj1 = new A();
        //System.out.println(obj1.c); //its illegal
        D obj2  =new D();
        System.out.println(obj2.c);
    }
}
