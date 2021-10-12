package com.app.Part_1;

import java.util.HashMap;
import java.util.Map;

public class Helper {

    public static Map<String, String> getData() {

        Map<String, String> map = new HashMap<>();

        map.put("r", "robot");
        map.put("g", "girl");
        map.put("t", "taxi");

        return map;

    }
}
