package com.app.map;

import java.util.HashMap;
import java.util.Set;


/* map
1) uniqueue key // [a,a] ->a
2) no index accees // get(0)
access by key  get(key) ->  Object value = map.get("a");
3) order no guaranty
 */
public class MapMain {

    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "B");


        int n = map.size();
        boolean empty = map.isEmpty();
        System.out.println("n="+n);
        System.out.println("empty="+empty);
        System.out.println(map);
        System.out.println("---------------------------------");
        Object value = map.get("a");
        System.out.println("b="+value);

        System.out.println("---------------------------------");
        map.put("a", "A1");
        System.out.println(map);
        System.out.println("---------------------------------");
        map.put("a1", "Test");
        System.out.println(map);
        System.out.println("---------------------------------");
        Set keys = map.keySet();
        System.out.println("keys="+keys);
        for(Object item: keys){
            Object valueItem = map.get(item);
            System.out.println(item+"="+valueItem);
        }
        System.out.println("---------------------------------");
        map.remove("b");
        System.out.println(map);
        System.out.println("---------------------------------");
        map.clear();
        System.out.println(map);


    }

}
