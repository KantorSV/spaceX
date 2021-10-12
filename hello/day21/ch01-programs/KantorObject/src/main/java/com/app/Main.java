package com.app;

public class Main {
    public static void main(String[] args) {
        String filePath = "KantorObject.txt";
        FileHelper fileHelper = new FileHelper();
        Person person = new Person();

        person.setName("Misha");
        person.setAge(8);

        fileHelper.writeToFile(filePath, person);

        Person person1 = fileHelper.readFromFile(filePath);
        System.out.println(person1);



    }
}
