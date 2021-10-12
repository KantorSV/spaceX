package com.app;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileHelper2 {

    public void writeToFile(String filePath, String data) {
        File file = new File(filePath);
        try {
            FileOutputStream out = new FileOutputStream(file);
            byte[] dataB = data.getBytes();
            out.write(dataB);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile (String filePath){
        File file = new File(filePath);
        try {
            FileInputStream in = new FileInputStream(file);
            int n = in.available();
            byte[] data = new byte[n];
            in.read(data);
            String s = new String(data);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
