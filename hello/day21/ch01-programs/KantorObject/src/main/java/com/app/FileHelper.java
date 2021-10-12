package com.app;

import java.io.*;

public class FileHelper {
    public void writeToFile(String filePath, Person person){
        File file = new File(filePath);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))){
            out.writeObject(person);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Person readFromFile(String filePath){
        File file = new File(filePath);
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){
            Person person = (Person) in.readObject();
            return person;

        } catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
