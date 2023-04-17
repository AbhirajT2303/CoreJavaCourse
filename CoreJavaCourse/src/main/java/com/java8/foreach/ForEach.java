package com.java8.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums =new ArrayList<>();
        nums.add(1);
        nums.add(0);
        nums.add(8);
        nums.add(9);
        nums.add(15);
        nums.add(188);
        nums.add(215);

//        nums.forEach(Numbers ->System.out.println(Numbers));
        ImpClass imp = new ImpClass();
        nums.forEach(imp);
    }
}
