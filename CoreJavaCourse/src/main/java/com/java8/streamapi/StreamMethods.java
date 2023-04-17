package com.java8.streamapi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(1,2,4,3,5);
//        in.stream().sorted().forEach(System.out::println);
//        in.stream().filter(n-> (n>3)).forEach(System.out::println);
//        long count =in.stream().count();
//        System.out.println(count);
//        in.stream().map(n -> (n+n)).sorted().forEach(System.out::println);
//        boolean result = in.stream().allMatch(n->n==3);
//        Optional<Integer> result = in.stream().findAny();
//        System.out.println(result);
        float result = in.stream().reduce(0, Integer::sum);
        System.out.println(result);
    }
}
