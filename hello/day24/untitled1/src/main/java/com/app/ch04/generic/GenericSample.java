package com.app.ch04.generic;

import com.sun.scenario.effect.impl.state.LinearConvolveKernel;

import java.util.LinkedHashSet;
import java.util.Set;

public class GenericSample {

    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("A");
        set.add(true);
        set.add(100);

        //for each
        for(Object item: set){
            System.out.println(item);
        }
        System.out.println("----------generic----------------");
        Set<String> genericSet = new LinkedHashSet();


        //genericSet.add(100);
        //genericSet.add(true);
        genericSet.add("Hello");

        for(String item: genericSet){
            System.out.println(item);
        }
    }

}
