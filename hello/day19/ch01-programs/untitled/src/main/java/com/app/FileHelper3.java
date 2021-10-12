package com.app;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileHelper3 {

    public void writeToFile(String filePath, String data) {
        File file = new File(filePath);
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file);
            byte[] dataB = data.getBytes();
            out.write(dataB);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void readFromFile(String filePath) {
        File file = new File(filePath);
        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
            int n = in.available();
            byte[] data = new byte[n];
            in.read(data);
            String d = new String(data);
            System.out.println(d);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
