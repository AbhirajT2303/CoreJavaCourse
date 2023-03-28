package com.serialization;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String fileName = "Serialization.ser";
        Order obj = new Order();
        obj.setId(21);
        obj.setItemName("Pizza");
        obj.setOrderAdd("plot no.34, XYZ");

        try {
            SerializationUtil.serialize(obj,fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Order newObj= new Order();

        try {
            newObj= (Order) SerializationUtil.deserialize(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("obj Object::"+obj);
        System.out.println("newObj Object::"+newObj);
    }
}
