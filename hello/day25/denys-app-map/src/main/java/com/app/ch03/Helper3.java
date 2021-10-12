package com.app.ch03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Helper3 {

    public static Map<String, String> getData(){
        Map<String, String> map = new TreeMap<>();
        map.put("p", "Denys");
        map.put("k", "Serhii");
        map.put("j", "Mike");
        return map;
    }
}
