package com.app;

import java.io.*;

public class FileHelper {


    public void writeToFile(String filePath, Person person) {
        File file = new File(filePath);
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            out.writeInt(person.getAge());
            out.writeUTF(person.getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Person readFromFile(String filePath){
        File file = new File(filePath);
        try(DataInputStream in = new DataInputStream(new FileInputStream(file))){
            int age = in.readInt();
            String name = in.readUTF();
            Person person = new Person();
            person.setAge(age);
            person.setName(name);
            return person;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
