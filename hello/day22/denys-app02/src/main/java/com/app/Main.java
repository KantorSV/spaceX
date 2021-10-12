package com.app;

public class Main {

    public static void main(String[] args) {
        FileHelper fileHelper = new FileHelper();
        String filePath = "data.txt";
        String data = "tEST WWWW!!!ttt";
        //fileHelper.writeToFile(filePath, data);
        String res = fileHelper.readFromFile(filePath);
        System.out.println(res);
    }

}
