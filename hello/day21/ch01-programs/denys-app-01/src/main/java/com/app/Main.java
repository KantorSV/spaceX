package com.app;

public class Main {

    public static void main(String[] args) {
        String filePath = "Kantor.txt";
        FileHelper fileHelper = new FileHelper();
        Person person = new Person();
        person.setName("Name1");
        person.setAge(1);

        //fileHelper.writeToFile(filePath, person);
        //Person result = fileHelper.readFromFile(filePath);
        //System.out.println(result);

    }
}
