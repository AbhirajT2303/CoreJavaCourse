package com.generics;

public class GenericsDemo<T> {
    T obj;
    GenericsDemo(T obj){
        this.obj =obj;
    }
    public T getObj(){
        return this.obj;
    }

    public static void main(String[] args) {
     GenericsDemo<String>  sobj = new GenericsDemo<>("Generics Demo:");
        System.out.println(sobj.getObj());
     GenericsDemo<Integer> iobj = new GenericsDemo<>(1);
        System.out.println(iobj.getObj());
    }
}
