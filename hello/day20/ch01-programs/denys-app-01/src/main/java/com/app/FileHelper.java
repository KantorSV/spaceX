package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileHelper {

    public void writeToFile(String filePath, Person person){
        File file = new File(filePath);
        try (FileOutputStream out = new FileOutputStream(file)){
            String data = person.toString();
            byte[] dataB = data.getBytes();
            out.write(dataB);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Person readFromFile(String filePath){
        File file = new File(filePath);
        try (FileInputStream in = new FileInputStream(file)){
            int n = in.available();
            byte[] data = new byte[n];
            in.read(data);
            String fileContent = new String(data);
            Person person = parse(fileContent);
            return person;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //Person{name='Vasya', age=25}
    //Person{name='Vasya' - array[0]
    private Person parse(String fileContent){

        String [] array = fileContent.split(",");
        System.out.println("array[0]="+array[0]);
        System.out.println("array[1]="+array[1]);

        int startIndex = array[0].indexOf("'", 0);
        int endIndex = array[0].indexOf("'", startIndex+1);
        String name = array[0].substring(startIndex+1, endIndex);

        Person person = new Person();
        person.setName(name);

        startIndex = array[1].indexOf("=", 0 );
        endIndex = array[1].indexOf("}", startIndex+1);

        String ageValue = array[1].substring(startIndex+1, endIndex);
        System.out.println("ageValue="+ageValue);
        int age = Integer.parseInt(ageValue);

        person.setAge(age);

        return person;
    }
}
