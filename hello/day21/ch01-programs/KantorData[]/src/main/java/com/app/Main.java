package com.app;

public class Main {
    public static void main(String[] args) {
        String filePath = "KantorData[]";
        FileHelper fileHelper = new FileHelper();

        Person[] persons = new Person[10];
        for (int i = 0; i < persons.length; i++) {
            Person p = new Person();
            p.setName("Name" + i);
            p.setAge(i);
            persons[i] = p;
        }
        fileHelper.writToFile(filePath, persons);

        Person[] pp = fileHelper.readFromFile(filePath);
        for (int i = 0; i < pp.length; i++) {
            System.out.println("i = " + pp[i]);
        }
    }
}
