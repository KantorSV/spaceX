package Part_3;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set set = new TreeSet();

        set.add("K");
        set.add("A");
        set.add("N");
        set.add("T");
        set.add("O");
        set.add("R");

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set);

    }
}
