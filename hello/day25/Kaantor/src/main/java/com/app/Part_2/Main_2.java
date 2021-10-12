package com.app.Part_2;

import java.util.Map;
import java.util.Set;

public class Main_2 {

    public static void main(String[] args) {

        Map<String, String> map = Helper_2.getData();
        String res = map.get("w");

        boolean contains = map.containsKey("t");
        System.out.println("contains = " + contains);

        System.out.println("get(w)" + res);

        Set<String>keys = map.keySet();
        System.out.println("keys = " + keys);

        for(String key: keys){
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

    }
}
