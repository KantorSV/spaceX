package Generic;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set set = new LinkedHashSet();

        set.add("A");
        set.add(true);
        set.add(128);

        for(Object item: set){
            System.out.println(item);
        }
        System.out.println("------------------------");

        Set <String> set1 = new LinkedHashSet();

        //set1.add(128);
        //set1.add(true);
        set1.add("I'am Serhii");

        for(Object item: set1){
            System.out.println(item);
        }
    }
}
