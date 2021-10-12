package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingMain {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("d");
        list.add("c");
        list.add("a");
        list.add("b");
        System.out.println(list);
        System.out.println("----------------");
        Collections.sort(list);
        System.out.println(list);
    }

}
