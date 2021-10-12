package com.app.ch03;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
        Set set = new TreeSet();
        set.add("C");
        set.add("A");
        set.add("D");
        set.add("E");
        set.add("B");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }

}
