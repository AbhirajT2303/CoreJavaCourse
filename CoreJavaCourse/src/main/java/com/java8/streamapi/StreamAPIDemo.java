package com.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPIDemo {
    private  int id;
    private String name;
    private String add;

    public StreamAPIDemo(int id, String name, String add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    @Override
    public String toString() {
        return "StreamAPIDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<StreamAPIDemo> details = new ArrayList<>();
        details.add(new StreamAPIDemo(1,"karan","abc road,hyd"));
        details.add(new StreamAPIDemo(2,"arjun","abc road,hyd"));
        details.add(new StreamAPIDemo(4,"abhi ","abc road,hyd"));
        details.add(new StreamAPIDemo(3,"prem ","abc road,hyd"));
        details.add(new StreamAPIDemo(5,"shri ","abc road,hyd"));

        Stream<StreamAPIDemo> data =details.stream();
        data.forEach(System.out::println);

        details.stream().filter(p -> p.id==3).forEach(n ->System.out.println("filter method: "+n));

        details.stream().filter(a -> a.id<2).forEach(n -> System.out.println(n.name));

        Optional<StreamAPIDemo> obj = details.stream().max((e1, e2) -> e1.id > e2.id ? 1:-1);
        System.out.println(obj);

        details.stream().filter(s ->s.id>4).map(p -> p.id+100).forEach(System.out::println);

        boolean result = details.stream().allMatch(a-> a.id == 5);
        System.out.println(result);
        System.out.println("hello");
    }
}
