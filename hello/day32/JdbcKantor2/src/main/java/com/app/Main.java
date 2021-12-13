package com.app;

public class Main {

    public static void main(String[] args) {

        Dao2 dao = new Dao2();
        Person person = new Person();


        person.setName("Fox");
        person.setAge(12);
        //dao.create(person);

        //dao.delete("dhbs", 22);
        dao.update("Cash", 12);

    }
}
