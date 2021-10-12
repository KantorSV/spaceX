package com.app.conroller;

import com.app.model.Person;

public interface PersonController {

    public void create(Person person);

    public Person read(int id);

    public void update(int id, Person candidatePerson);

    public void delete(int id);

    public void deleteAll();

    public void saveToFile();

    public void loadFromFile();

    public void loadFromFile2();

    public  void loadFromFile3();

    public void saveToFile2();

    public void saveToFile3();
}
