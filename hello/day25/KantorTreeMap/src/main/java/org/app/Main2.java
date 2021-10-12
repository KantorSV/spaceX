package org.app;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main2 {

    public static void main(String[] args) {

        Comparator userComparator = new UserComparator();
        Map<User, Integer> map = new TreeMap(userComparator);

        User u1 = new User("Name1", 1);
        User u2 = new User("Name2", 2);
        User u3 = new User("Name3", 3);

        map.put(u1, 10);
        map.put(u2, 20);
        map.put(u3, 30);

        System.out.println(map);

    }
}
