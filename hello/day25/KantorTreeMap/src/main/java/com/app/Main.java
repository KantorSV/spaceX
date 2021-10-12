package com.app;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Person, Integer> map = new TreeMap();

        Person p1 = new Person();
        p1.setAge(1);
        p1.setName("Name1");

        Person p2 = new Person("Name2", 2);
        Person p3 = new Person("Name3", 3);

        map.put(p1, 10);
        map.put(p2, 20);
        map.put(p3, 30);

        System.out.println(map);


    }
}
