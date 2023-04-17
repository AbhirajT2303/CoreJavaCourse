package com.java8.foreach;

import java.util.function.Consumer;

public class ImpClass implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
