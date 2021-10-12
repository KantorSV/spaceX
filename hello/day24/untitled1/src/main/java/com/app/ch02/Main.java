package com.app.ch02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Set
1) unique
2) no index access

a) HashSet
b) LinkedHashSet - makes order!!!
c) TreeSet


 */

public class Main {

    public static void main(String[] args) {
        Set set = new LinkedHashSet();
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
