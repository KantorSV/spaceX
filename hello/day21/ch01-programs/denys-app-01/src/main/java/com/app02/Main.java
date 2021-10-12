package com.app02;

public class Main {
    public static void main(String[] args) {
        String filePath = "User.txt";

        UserFileHelper userFileHelper = new UserFileHelper();
        User user = new User();
        user.setAge(1);
        user.setName("Name1");

        userFileHelper.saveToFile(filePath, user);

        User result = userFileHelper.loadFromFile(filePath);
        System.out.println(result);
    }

}
