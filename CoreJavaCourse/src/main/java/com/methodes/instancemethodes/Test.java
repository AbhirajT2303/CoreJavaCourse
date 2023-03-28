package com.methodes.instancemethodes;

public class Test {
    public static void main(String[] args) {
        InstanceMethod obj = new InstanceMethod("Krishiv",1,"male");
//        Calling accessor method
        obj.display();
//        Calling mutator method
        obj.modify();
        obj.display();
    }
}
