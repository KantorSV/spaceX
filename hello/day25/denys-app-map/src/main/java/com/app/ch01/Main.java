package com.app.ch01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/*
Map
1) HashMap
- no order key
- key unique
- access by key


2) LinkedHashMap
3) TreeMap


 */

public class Main {


    public static void main(String[] args) {
       /* Map<String, String> map = new HashMap();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");
        map.put("a", "C");*/

        Map<String, String> map = Helper.getData();

        String res = map.get("w");
        boolean contains = map.containsKey("t");
        System.out.println("contains="+contains);

        System.out.println("get(w)="+res);

        Set<String> keys = map.keySet();
        System.out.println("keys="+keys);
        for(String key : keys){
            String value = map.get(key);
            System.out.println(key+"="+value);
        }



    }

}
