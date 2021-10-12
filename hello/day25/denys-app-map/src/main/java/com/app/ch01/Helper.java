package com.app.ch01;

import java.util.HashMap;
import java.util.Map;

public class Helper {

    public static Map<String, String> getData(){
        Map<String, String> map = new HashMap<>();
        map.put("p", "Denys");
        map.put("k", "Serhii");
        map.put("j", "Mike");
        return map;
    }

}
