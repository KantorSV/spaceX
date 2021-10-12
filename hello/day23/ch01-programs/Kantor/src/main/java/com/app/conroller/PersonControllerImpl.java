package com.app.conroller;

import com.app.model.Person;
import com.app.storage.DataStorage;

import java.util.ArrayList;

public class PersonControllerImpl implements PersonController {

    private DataStorage dataStorage = new DataStorage();
    private static PersonControllerImpl instance = new PersonControllerImpl();

    private PersonControllerImpl() {
    }

    @Override
    public void create(Person person) {
        dataStorage.save(person);
    }

    @Override
    public Person read(int id) {
        return dataStorage.read(id);
    }

    @Override
    public void update(int id, Person candidatePerson) {
        dataStorage.update(id, candidatePerson);
    }

    @Override
    public void delete(int id) {
        dataStorage.delete(id);
    }

    @Override
    public void deleteAll() {
        dataStorage.deleteAll();
    }

    @Override
    public void saveToFile() {
        dataStorage.saveToFile();
    }

    @Override
    public void loadFromFile() {
        dataStorage.loadFromFile();
    }

    @Override
    public void loadFromFile2() {
        dataStorage.loadFromFile2();
    }

    @Override
    public void loadFromFile3() {
        dataStorage.loadFromFile3();
    }

    @Override
    public void saveToFile2() {
        dataStorage.saveToFile2();
    }

    @Override
    public void saveToFile3() {
        dataStorage.saveToFile3();
    }

    public ArrayList readAll() {
        return dataStorage.readAll();
    }

    public static PersonControllerImpl getInstance() {
        return instance;
    }
}
