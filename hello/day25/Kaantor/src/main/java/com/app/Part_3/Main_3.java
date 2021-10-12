package com.app.Part_3;

import javax.jws.soap.SOAPMessageHandlers;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main_3 {

    public static void main(String[] args) {

        Map<String, String>map = Helper_3.getData();
        String res = map.get("r");

        boolean contains = map.containsKey("c");
        System.out.println("contains = " + contains);

        System.out.println("get(r)" + res);

        Set<String>keys = map.keySet();
        System.out.println("keys" + keys);

        for (String key: keys){
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }


    }
}
