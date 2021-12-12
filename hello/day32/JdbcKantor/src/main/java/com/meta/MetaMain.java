package com.meta;

import java.util.List;
import java.util.Map;

public class MetaMain {

    public static void main(String[] args) {
        Dao3 dao = new Dao3();
        List<Map<String, Object>> result =  dao.readAll("test");
        System.out.println("-----------------------------------------------");
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }

    }

}
