package com.java8.functionalinterface;

import com.java8.multipleInterfaces.Interface1;
import com.java8.multipleInterfaces.Interface2;

public class Test {
//    static Runnable r = new Runnable() {
//        @Override
//        public void run() {
//            System.out.println("Inside Runnable");
//        }
//    };

    public static void main(String[] args) {
//        Test t = new Test();
//        t.r.run();
//        r.run();

        Runnable i1 = ()-> {
            System.out.println("my Runnable");
        };
        Interface2 ref = System.out::println;
//        ref.method1("Hello");

    }
}
