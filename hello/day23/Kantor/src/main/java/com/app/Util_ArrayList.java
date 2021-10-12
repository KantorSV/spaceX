package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Util_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(16);
        list.add(7);
        list.add(5);
        list.add(10);
        list.add(154);
        list.add(2);
        list.add(300);

        System.out.println(list);
        Collections.sort(list);
        System.out.println("----------------------------");
        System.out.println(list);
        System.out.println("list size = " + list.size());

        System.out.println("");
        System.out.println("****************************");
        System.out.println("");

        List list1 = new ArrayList();
        list1.add("1");
        list1.add("16");
        list1.add("7");
        list1.add("5");
        list1.add("10");
        list1.add("154");
        list1.add("2");
        list1.add("300");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println("----------------------------");
        System.out.println(list1);

    }
}
