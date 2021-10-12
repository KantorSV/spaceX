package com.app;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------");
        Person person = new Person();
        person.setName("Gena");
        person.setAge(50);
        System.out.println(person);

        System.out.println("------------------------------------");

        Person zzz = new Person(25,"Stepan");
        System.out.println(zzz);
        System.out.println("------------------------------------");

        new Person(1, "killer");
        System.gc();
    }
}
