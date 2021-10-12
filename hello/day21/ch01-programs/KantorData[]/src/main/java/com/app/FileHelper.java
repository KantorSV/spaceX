package com.app;

import java.io.*;

public class FileHelper {
    public void writToFile(String filePath, Person[] persons) {
        File file = new File(filePath);
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            int n = persons.length;
            out.writeInt(n);

            for (int i = 0; i < n; i++) {
                Person p = persons[i];
                int age = p.getAge();
                String name = p.getName();
                out.writeInt(age);
                out.writeUTF(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Person[] readFromFile(String filePath) {
        File file = new File(filePath);
        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            int n = in.readInt();

            Person[] persons = new Person[n];
            for (int i = 0; i < n; i++) {
                int age = in.readInt();
                String name = in.readUTF();
                Person p = new Person();
                p.setAge(age);
                p.setName(name);
                persons[i] = p;
            }
            return persons;


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
