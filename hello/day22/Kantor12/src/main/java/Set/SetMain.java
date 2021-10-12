package Set;

import java.util.HashSet;

public class SetMain {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add("K");
        hashSet.add("A");
        hashSet.add("N");
        hashSet.add("T");
        hashSet.add("O");
        hashSet.add("R");

        int n = hashSet.size();

        boolean empty = hashSet.isEmpty();
        System.out.println("hashSet is empty = " + empty);
        System.out.println("n = " + n);
        System.out.println(hashSet);
        System.out.println("---------------------------");
        hashSet.add("a1");
        System.out.println(hashSet);
        n = hashSet.size();
        System.out.println("n = " + n);
        System.out.println("---------------------------");
        for (Object item : hashSet) {
            System.out.print(item);
        }
        System.out.println("\n---------------------------");
        hashSet.remove("a1");
        System.out.print(hashSet);
        System.out.println("\n---------------------------");
        hashSet.remove("O");
        System.out.print(hashSet);
        System.out.println("\n---------------------------");
        hashSet.clear();
        System.out.print(hashSet);

    }
}
