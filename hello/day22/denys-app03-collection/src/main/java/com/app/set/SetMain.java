package com.app.set;

import java.util.HashSet;

/* set
1) unique // [A,A] -->[A]
2) no index access // get(0) - no
3) no order garanty
 */


public class SetMain {

    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("A");
        set.add("B");
        set.add("C");

        int n = set.size();
        boolean empty = set.isEmpty();
        System.out.println("n="+n);
        System.out.println("empty="+empty);
        System.out.println(set);
        System.out.println("--------------");
        set.add("A1");
        System.out.println(set);

        System.out.println("--------------");
        //for each
        for(Object item: set){
            System.out.println(item);
        }
        System.out.println("--------------");
        set.remove("W");
        System.out.println(set);
        System.out.println("--------------");
        set.remove("B");
        System.out.println(set);
        System.out.println("--------------");
        set.clear();
        System.out.println(set);
    }
}
