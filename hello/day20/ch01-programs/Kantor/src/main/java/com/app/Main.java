package com.app;

public class Main {
    public static void main(String[] args) {
        String filePath = "Serhii.txt";
        Person person = new Person();
        person.setAge(34);
        person.setName("Kantor S.V.");

        FileHelper fileHelper = new FileHelper();
        fileHelper.writeToFile(filePath, person);

        Person personFromFile = fileHelper.readFromFile(filePath);
        System.out.println(personFromFile);
    }
}
