package com.app.ch01;

import java.util.HashSet;
import java.util.Set;

/*
Set
1) unique
2) no index access
3) order is not guaranty

a) HashSet
b) LinkedHashSet3
c) TreeSet


 */

public class Main {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("1");
        set.add("@");
        set.add("c");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }

}
