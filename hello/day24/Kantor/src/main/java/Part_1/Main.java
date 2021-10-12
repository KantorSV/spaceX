package Part_1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set set = new HashSet();

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
