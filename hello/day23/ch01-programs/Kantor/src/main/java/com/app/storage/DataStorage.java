package com.app.storage;

import com.app.model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;

public class DataStorage {
    private ArrayList data = new ArrayList();

    public void save(Person person) {
        data.add(person);
    }


    public void update(int id, Person candidate) {
        data.set(id, candidate);
    }

    public void delete(int id) {
        data.remove(id);
    }

    public void deleteAll() {
        data.clear();
    }

    public Person read(int id) {
        return (Person) data.get(id);
    }

    public ArrayList readAll() {
        return data;
    }

    public void saveToFile() {
        File file = new File("data.txt");
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            int n = data.size();
            out.writeInt(n);
            for (int i = 0; i < data.size(); i++) {
                Person p = (Person) data.get(i);
                int age = p.getAge();
                String name = p.getName();
                String phone = p.getPhone();
                out.writeInt(age);
                out.writeUTF(name);
                out.writeUTF(phone);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void loadFromFile() {
        data.clear();
        File file = new File("data.txt");
        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            int n = in.readInt();
            for (int i = 0; i < n; i++) {
                Person person = new Person();
                int age = in.readInt();
                String name = in.readUTF();
                String phone = in.readUTF();
                person.setAge(age);
                person.setName(name);
                person.setPhone(phone);
                data.add(person);

            }
        } catch (Exception ex) {
            throw new RuntimeException();
        }
    }

    public void saveToFile2() {
        File file = new File("data2.txt");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile2() {
        File file = new File("data2.txt");
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            data = (ArrayList) in.readObject();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void saveToFile3() {
        Properties properties = new Properties();
        properties.put("size", data.size() + "");
        for (int i = 0; i < data.size(); i++) {
            Person person = (Person) data.get(i);
            int age = person.getAge();
            String name = person.getName();
            String phone = person.getPhone();
            properties.put("age." + i, age + "");
            properties.put("name." + i, name);
            properties.put("phone." + i, phone);
        }

        File file = new File("data3.properties");
        try (FileOutputStream out = new FileOutputStream(file)) {
            properties.store(out, "");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void loadFromFile3() {
        data.clear();
        Properties properties = new Properties();
        File file = new File("data3.properties");
        try (FileInputStream in = new FileInputStream(file)) {
            properties.load(in);
            int size = Integer.parseInt(properties.getProperty("size"));
            for (int i = 0; i < size; i++) {
                int age = Integer.parseInt(properties.getProperty("age." + i));
                String name = properties.getProperty("name." + i);
                String phone = properties.getProperty("phone." + i);
                Person person = new Person(name, age, phone);
                data.add(person);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
