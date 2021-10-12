package com.app.Part_3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Helper_3 {

    public static Map<String, String> getData() {

        Map<String, String> map = new TreeMap<>();

        map.put("r", "robot");
        map.put("g", "girl");
        map.put("t", "taxi");

        return map;
    }
}
