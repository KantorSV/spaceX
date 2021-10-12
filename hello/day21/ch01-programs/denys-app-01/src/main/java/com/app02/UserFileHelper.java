package com.app02;

import java.io.*;

public class UserFileHelper {

    public void saveToFile(String filePath, User user) {
        File file = new File(filePath);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(user);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public User loadFromFile(String filePath){
        File file = new File(filePath);
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){
            User user = (User) in.readObject();
            return user;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

}
