package com.app;

public class MyHashCodeMain {

    public static void main(String[] args) {
        Person p1 = new Person("Name1", 1);
        Person p2 = new Person("Name1", 1);
        //Person p2 = new Person(null, 1);

        System.out.println("p1.hash="+p1.hashCode());
        System.out.println("p2.hash="+p2.hashCode());

        boolean res = p1.equals(p2);
        System.out.println(res);

    }

}
