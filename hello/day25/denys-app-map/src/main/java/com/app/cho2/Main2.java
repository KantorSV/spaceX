package com.app.cho2;

import com.app.ch01.Helper;

import java.util.Map;
import java.util.Set;


/*
Map
1) HashMap
- no order key
- key unique
- access by key


2) LinkedHashMap
- order guaranty


3) TreeMap


 */

public class Main2 {


    public static void main(String[] args) {

        Map<String, String> map = Helper2.getData();

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
