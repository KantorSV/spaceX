package com.app;

import java.util.LinkedList;
import java.util.List;

public class Util_LinkedList {

    public static void main(String[] args) {
        List list = new LinkedList();

        list.add("h");
        list.add("s");
        list.add("e");
        list.add("b");

        int size = list.size();
        boolean isEmpty = list.isEmpty();
        Object item = list.get(2);
        System.out.println("size = " + size);
        System.out.println("isEmpty = " + isEmpty);
        System.out.println("data[2] = " + item);

    }
}
