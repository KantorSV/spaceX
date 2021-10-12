package com.app.Part_2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Helper_2 {
    public static Map<String, String> getData() {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("r", "robot");
        map.put("g", "girl");
        map.put("t", "taxi");

        return map;
    }
}
