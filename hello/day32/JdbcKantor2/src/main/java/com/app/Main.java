package com.app;

public class Main {

    public static void main(String[] args) {

        Dao dao = new Dao();
        Person person = new Person();


        person.setName("Fox");
        person.setAge(12);
        dao.create(person);

        dao.delete("dhbs", 22);
        dao.update("Bear", 12);

    }
}
