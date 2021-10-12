package com.app;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String filePath = "Kantor.txt";
        Person person = new Person();
        person.setAge(25);
        person.setName("Vasya");



        FileHelper fileHelper = new FileHelper();
        fileHelper.writeToFile(filePath, person);

        Person personFromFile = fileHelper.readFromFile(filePath);
        System.out.println("personFromFile="+personFromFile);
    }

}
