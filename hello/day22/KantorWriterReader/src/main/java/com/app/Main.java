package com.app;

public class Main {
    public static void main(String[] args) {
        FileHelper fileHelper = new FileHelper();
        String filePath = "Kantor";
        String data = "My name is Serhii";

        fileHelper.writeToFile(filePath, data);
        String res =fileHelper.readFromFile(filePath);
        System.out.println(res);

    }
}
