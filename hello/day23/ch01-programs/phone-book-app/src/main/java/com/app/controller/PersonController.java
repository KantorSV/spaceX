package com.app.controller;

import com.app.model.Person;

import java.util.ArrayList;

public interface PersonController {

    public void create(Person person);

    public Person read(int id);

    public void update(int id, Person candidatePerson);

    public void delete(int id);

    public void deleteAll();

    public void saveToFile();

    public void loadFromFile();

    public ArrayList readAll();

    public void saveToFile2();

    public void loadFromFile2();

    public void saveToFile3();

    public void loadFromFile3();



}
