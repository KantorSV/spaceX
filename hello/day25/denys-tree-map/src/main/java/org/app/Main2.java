package org.app;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main2 {

    public static void main(String[] args) {
        //Map<User, Integer> map = new TreeMap();
        Comparator userComparator = new UserComparator();
        Map<User, Integer> map = new TreeMap(userComparator);
        User u1 = new User(1, "Name1");
        User u2 = new User(2, "Name2");
        User u3 = new User(3, "Name3");

        map.put(u1, 10);
        map.put(u2, 20);
        map.put(u3, 30);

        System.out.println(map);
    }

}
