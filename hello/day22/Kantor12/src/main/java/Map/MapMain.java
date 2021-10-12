package Map;

import java.util.HashMap;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        int n = map.size();

        boolean empty = map.isEmpty();
        System.out.println("map is emrty = " + empty);
        System.out.println("n = " + n);
        System.out.print(map);
        System.out.println("\n-----------------------------");
        Object value = map.get("A");
        System.out.println("A = " + value);
        System.out.println("-------------------------------");
        map.put("D",4);
        System.out.println(map);
        System.out.println("-------------------------------");
        Set keys = map.keySet();
        System.out.println("keys = " + keys);
        for (Object item: keys){
            Object valueItem = map.get(item);
            System.out.println(item + " = " + valueItem);
        }
        System.out.println("-------------------------------");
        map.remove("A");
        System.out.println(map);
        System.out.println("-------------------------------");
        map.clear();
        System.out.println(map);

    }
}
