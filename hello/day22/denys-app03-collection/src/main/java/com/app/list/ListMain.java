package com.app.list;

import java.util.ArrayList;


/* list
1) index access // get(0)
2) allow duplicates // [A,A]
3) guaranty order // [A,B,C,D]
 */
public class ListMain {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println(arrayList);
        int n = arrayList.size();
        System.out.println("n="+n);
        boolean empty = arrayList.isEmpty();
        System.out.println("empty="+empty);
        Object item = arrayList.get(0);
        System.out.println("get(0)="+item);
        System.out.println("------------------------");
        for(int i=0;i<n;i++){
            Object data = arrayList.get(i);
            //System.out.println(i+"="+data);
            System.out.println(data);
        }
        System.out.println("------------------------");
        Object oldValue = arrayList.set(1, "Q");
        System.out.println("oldValue="+oldValue);
        System.out.println(arrayList);
        System.out.println("------------------------");
        arrayList.remove(0);
        n = arrayList.size();
        System.out.println("n="+n);
        System.out.println(arrayList);
        System.out.println("--------------------");
        arrayList.clear();
        n = arrayList.size();
        System.out.println("n="+n);
        System.out.println(arrayList);


    }
}
