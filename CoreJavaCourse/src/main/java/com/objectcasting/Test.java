package com.objectcasting;

public class Test {
    public static void main(String[] args) {
//        implicit object casting (widening or up casting)
//        One o = new Two();
//        o.show1();
//        explicit object casting (narrowing or down casting)
        One o;
        o  = new Two();
        Two t = (Two) o;
        t.show1();
        t.show2();
    }
}
