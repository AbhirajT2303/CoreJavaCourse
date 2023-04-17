package com.collections.map.mapmethods;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<String ,Integer> map = new TreeMap<>();
        map.put("banglor",26);
        map.put("Maharashtra",35);
        map.put("Chennai",35);
        map.put("Delhi",36);
        System.out.println(map);
//        map.remove("banglor",26);
        Set<String> keys = map.keySet();
        System.out.println(keys);

        map.replace("banglor",26,11);
        System.out.println("ContainsKey: "+map.containsKey("banglor"));

        System.out.println("equals method: "+ map.equals(map));

        System.out.println(map.putIfAbsent("Rajasthan",34));
        System.out.println(map.toString());
        System.out.println(map.getOrDefault("banglor",21));
        System.out.println(map);
        System.out.println(map.entrySet());

    }
}
