package List;

import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("K");
        arrayList.add("A");
        arrayList.add("N");
        arrayList.add("T");
        arrayList.add("O");
        arrayList.add("R");
        System.out.println(arrayList);
        System.out.println("-----------------------");
        int n = arrayList.size();
        System.out.println("n = " + n);
        System.out.println("-----------------------");
        boolean empty = arrayList.isEmpty();
        System.out.println("arrayList is empty = " + empty);
        System.out.println("-----------------------");
        Object item = arrayList.get(2);
        System.out.println("arrayList(2) = " + item);
        System.out.println("-----------------------");
        for (int i = 0; i < n; i++) {
            Object data = arrayList.get(i);
            System.out.print(data);
        }
        System.out.println("\n-----------------------");
        Object oldValue = arrayList.set(5, "F");
        System.out.println("oldValue = " + oldValue);
        System.out.println(arrayList);
        System.out.println("-----------------------");
        arrayList.remove(0);
        n = arrayList.size();
        System.out.println(arrayList);
        System.out.println("n = " + n);
        System.out.println("-----------------------");
        arrayList.clear();
        n = arrayList.size();
        System.out.println("n = " + n);
        System.out.println(arrayList);
    }
}
