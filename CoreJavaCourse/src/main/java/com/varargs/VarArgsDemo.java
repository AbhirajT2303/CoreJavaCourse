package com.varargs;

public class VarArgsDemo {

    public void display(String...parameters) {

        for (String str : parameters) {
            System.out.println("Parameters:-" + str);
        }
        System.out.println(" ");

    }

    public void display(int x, String... parameters) {

        System.out.println("Int x value is : " + x);

        for (String str : parameters) {
            System.out.println("Parameters:-" + str);
        }
        System.out.println(" ");

    }

    public static void main(String[] args) {
        VarArgsDemo varArgsDemo = new VarArgsDemo();
        varArgsDemo.display("Item");
        varArgsDemo.display("Product", "Delivery");
        varArgsDemo.display("Checkout", "Bag", "Style");

        varArgsDemo.display(10, "No Rush", "Next Day");


    }
}
