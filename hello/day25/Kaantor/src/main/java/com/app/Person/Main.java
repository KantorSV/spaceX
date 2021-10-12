package com.app.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<Person, Integer> map = new HashMap<>();

        Person a = new Person("a", 1);
        map.put(a, 10);

        Person b = new Person("b", 2);
        map.put(b, 20);

        Person c = new Person("c", 3);
        map.put(c, 30);

        System.out.println("map is empty = " + map.isEmpty());
        int size = map.size();
        System.out.println("size = " + size);

        Set<Person> keys = map.keySet();
        for (Person key : keys) {
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("--------------------------------------------");

        Person myKey = new Person("a",1);
        Integer value1 = map.get(myKey);
        System.out.println(myKey + " = " + value1);
        System.out.println(map.containsKey(myKey));


    }
}
