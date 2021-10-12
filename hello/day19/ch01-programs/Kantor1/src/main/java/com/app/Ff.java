package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Ff {
    public void writeToFile(String filePath, String data) {
        File file = new File(filePath);
        try (FileOutputStream out = new FileOutputStream(file)) {
            byte[] dataB = data.getBytes();
            out.write(dataB);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(String filePath) {
        File file = new File(filePath);
        try (FileInputStream in = new FileInputStream(file)) {
            int n = in.available();
            byte[] data = new byte[n];
            in.read(data);
            String d = new String(data);
            System.out.println(d);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
