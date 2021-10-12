package Part_2;

import java.util.LinkedHashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        Set set = new LinkedHashSet();

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
