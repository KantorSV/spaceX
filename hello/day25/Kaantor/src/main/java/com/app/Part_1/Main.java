package com.app.Part_1;

import com.app.Part_1.Helper;

import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<String, String> map = Helper.getData();
        String res = map.get("w");

        boolean contains = map.containsKey("p");
        System.out.println("contains = " + contains);

        System.out.println("get(w) = " + res);

        Set <String> keys = map.keySet();
        System.out.println("keys = " + keys);

        for(String key: keys){
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }

}
