package com.app;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dao dao = new Dao();

        Person person = new Person();
        person.setName("P1");
        person.setAge(1);
        System.out.println("-------create-------");
        dao.create(person);
        System.out.println("-------read-------");
        List<Person> persons = dao.read();
        for(Person p: persons){
            System.out.println(p.getName()+"; "+p.getAge());
        }
        System.out.println("-------update-------");
        dao.update(1, "TEST");
        System.out.println("-------read-------");
        persons = dao.read();
        for(Person p: persons){
            System.out.println(p.getName()+"; "+p.getAge());
        }
        System.out.println("---------delete----------");
        dao.delete("TEST", -1);
        System.out.println("-------read-------");
        persons = dao.read();
        for(Person p: persons){
            System.out.println(p.getName()+"; "+p.getAge());
        }
    }

}
