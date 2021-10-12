package com.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//LIST - ArrayList, LinkedList
//STACK
//QUEUE
//SET
//MAP


public class Main {

    public static void main(String[] args) {
        List list = new LinkedList();
        //List list = new ArrayList();

        list.add("a");
        int size = list.size();
        boolean isEmpty = list.isEmpty();
        Object item = list.get(0);
        System.out.println("size="+size);
        System.out.println("isEmpty="+isEmpty);
        System.out.println("data[0]="+item);

        //List list = new ArrayList();
        //List list = new LinkedList();
    }

}
