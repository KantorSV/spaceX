package com.app;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dao2 dao = new Dao2();

        Person person = new Person();

        person.setName("BRO");
        person.setAge(16);
        dao.create(person);
        System.out.println("________________________________________________________________");
        List<Person> persons = dao.read();
        for (Person p : persons) {
            System.out.println(p.getName() + " ; " + p.getAge());
        }
        System.out.println("________________________________________________________________");
        dao.update("Ronald", 22);
        System.out.println("________________________________________________________________");
        persons = dao.read();
        for (Person p : persons) {
            System.out.println(p.getName() + " ; " + p.getAge());
        }
        System.out.println("________________________________________________________________");
        dao.delete("Bro", 154);

    }
}
